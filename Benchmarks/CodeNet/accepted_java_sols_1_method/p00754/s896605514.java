import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean ans = true;
            String str = scanner.nextLine();
            if (str.equals(".")) break;

            Stack<Character> s = new Stack<>();

            for (int i = 0; i < str.length(); ++i) {
                char c = str.charAt(i);
                if (c == '(') s.push(c);
                else if (c == ')') {
                    if (s.empty() || s.pop() != '(') ans = false;
                }

                if (c == '[') s.push(c);
                else if (c == ']') {
                    if (s.empty() || s.pop() != '[') ans = false;
                }
            }

            System.out.println((s.empty() && ans ? "yes" : "no"));
        }
    }
}
