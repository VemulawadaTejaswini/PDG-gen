import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] symbols = br.readLine().split(" ");

        Stack stack = new Stack();

        for (String symbol : symbols) {
            try {
                int n = Integer.parseInt(symbol);
                stack.push(n);
            } catch (NumberFormatException e) {
                int a = stack.pop();
                int b = stack.pop();
                int result = calculate(b, a, symbol);
                stack.push(result);
            }
        }

        System.out.println(stack.pop());

    }

    private static int calculate(int a, int b, String symbol) {
        switch (symbol) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new RuntimeException();
        }
    }

    public static class Stack {
        private int[] stacks;
        private int top;

        public Stack() {
            stacks = new int[100];
            top = 0;
        }

        public void push(int stack) {
            stacks[top] = stack;
            top++;
        }

        public int pop() {
            top--;
            return stacks[top];
        }
    }

}

