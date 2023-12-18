import java.util.Scanner;
import java.util.Stack;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        while (!(s = in.nextLine()).equals(".")) {
            Stack<Character> parens = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    parens.add(c);
                } else if (c == ')') {
                    if (!parens.isEmpty() && parens.peek() == '(') {
                        parens.pop();
                    }
                } else if (c == ']') {
                    if (!parens.isEmpty() && parens.peek() == '[') {
                        parens.pop();
                    }
                }
            }

            if (parens.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}