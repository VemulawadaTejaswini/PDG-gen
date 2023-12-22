import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String operate = scan.next();
            if (operate.equals("quit")) {
                break;
            } else if (operate.equals("push")) {
                String block = scan.next(); 
                stack.push(block);
            } else if (operate.equals("pop")) {
                String block = stack.pop();
                System.out.println(block);
            }
        }
    }
}