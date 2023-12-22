import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        calcurate(values);
    }

    private static void calcurate(String[] values) {
        Stack<Long> stack = new Stack<>();

        for (int i = 0; i < values.length; i++) {
            switch (values[i]) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(-(stack.pop() - stack.pop()));
                break;
            case "*":
                stack.push(Long.valueOf(stack.pop() * stack.pop()));
                break;
            default:
                stack.push(Long.parseLong(values[i]));
            }
        }

        System.out.println(stack.pop());
    }
}

