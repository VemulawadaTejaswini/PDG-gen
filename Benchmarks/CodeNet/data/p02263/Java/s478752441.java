import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String s : array) {
            if (isOperator(s)) {
                int a = stack.pop();
                int b = stack.pop();
                int c = calculate(b, a, s);
                stack.push(c);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        System.out.println(stack.pop());
    }

    private static boolean isOperator(String s) {
        switch (s) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }

    private static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}