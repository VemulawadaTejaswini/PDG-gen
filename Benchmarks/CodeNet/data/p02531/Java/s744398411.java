import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Stack stack = new Stack();
        String command = scanner.next();

        while (!command.equals("quit")) {
            switch (command) {
                case "push":
                    String block = scanner.next();
                    stack.push(block);
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
            }
            command = scanner.next();
        }
    }
}