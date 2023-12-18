import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Stack<String> stack = new Stack<String>();
        
        while (true) {
            String command = scanner.next();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("push")) {
                String block = scanner.next();
                stack.push(block);
            } else if (command.equals("pop")) {
                    System.out.println(stack.pop());
            }
        }
    }
}