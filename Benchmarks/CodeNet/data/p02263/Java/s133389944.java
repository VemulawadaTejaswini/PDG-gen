import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        for (String s : scanner.nextLine().split(" ")) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                stack.push(i2 - i1);
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        System.out.println(stack.pop());
    }

    private static class Stack {
        private static class Node {
            int i;
            Node next;

            public Node(int i, Node next) {
                this.i = i;
                this.next = next;
            }
        }

        Node top;

        public void push(int i) {
            top = new Node(i, top);
        }

        public int pop() {
            int i = top.i;
            top = top.next;
            return i;
        }
    }
}