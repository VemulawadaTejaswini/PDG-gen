import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        System.out.println(reversePolishNotationCalc(expr));
    }

    private static int reversePolishNotationCalc(String expr) {
        String[] e = expr.split(" ");
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < e.length; i++) {
            switch (e[i]) {
                case "+":
                    s.push(s.pop() + s.pop());
                    break;
                case "-":
                    s.push(-s.pop() + s.pop());
                    break;
                case "*":
                    s.push(s.pop() * s.pop());
                    break;
                default:
                    s.push(Integer.valueOf(e[i]));
                    break;
            }
        }
        return s.pop();
    }
}