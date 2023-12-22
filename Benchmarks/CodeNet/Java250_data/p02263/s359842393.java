import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        System.out.println(calcurate(values));
    }

    private static long calcurate(String[] values) {
        Stack<Long> stack = new Stack<>();

        for (int i = 0; i < values.length; i++) {

            switch (values[i]) {
            case "+":
                stack.push(Long.valueOf(
                        stack.pop().longValue() + stack.pop().longValue()
                        ));
                break;
            case "-":
                long b = stack.pop().longValue();
                long a = stack.pop().longValue();
                stack.push(Long.valueOf(a - b));
                break;
            case "*":
                stack.push(Long.valueOf(
                        stack.pop().longValue() * stack.pop().longValue()
                        ));
                break;
            default:
                stack.push(Long.parseLong(values[i]));
            }
        }

        return stack.pop().longValue();
    }
}

