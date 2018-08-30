package com.z0976190100.sock;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/mes")
    @SendTo("/topic/mes")
    public Message sendMessage(MessageRecepient messageRecepient) throws Exception{
        Thread.sleep(1000);
        return new Message("Message" + HtmlUtils.htmlEscape(messageRecepient.getName()));
    }
}
