import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = solve(s);
        System.out.println(ans);
    }

    static int solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '0') {
                if (stack.peek() == '0') {
                    stack.add(s.charAt(i));
                } else {
                    stack.pop();
                }
            } else {
                if (stack.peek() == '1') {
                    stack.add(s.charAt(i));
                } else {
                    stack.pop();
                }
            }
        }
        return s.length() - stack.size();
    }
}
