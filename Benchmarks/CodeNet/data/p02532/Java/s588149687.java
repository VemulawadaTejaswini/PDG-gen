import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Deque<String>> stacks = new ArrayList<Deque<String>>();

        Scanner scan = new Scanner(System.in);
        int noStack = scan.nextInt();
        for (int i = 0; i < noStack; i++) {
            stacks.add(new ArrayDeque<String>());
        }

        while (scan.hasNext()) {
            String operate = scan.next();
            if (operate.equals("quit")) {
                break;
            } else if (operate.equals("push")) {
                int dst = scan.nextInt() - 1;
                String block = scan.next(); 
                stacks.get(dst).push(block);
            } else if (operate.equals("pop")) {
                int src = scan.nextInt() - 1;
                String block = stacks.get(src).pop();
                System.out.println(block);
            } else if (operate.equals("move")) {
                int src = scan.nextInt() - 1;
                int dst = scan.nextInt() - 1;
                String block = stacks.get(src).pop();
                stacks.get(dst).push(block);
            }
        }
    }
}