import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        LinkedList<Integer> stack = new LinkedList();
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.charAt(0) == '+') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a + b);
                break;
            } else if (input.charAt(0) == '*') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a * b);
                break;
            } else if (input.charAt(0) == '-') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
                break;
            } else {
                stack.push(parseInt(input));
                break;
            }
        }
        System.out.println(stack.pop());
    }
}
