import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        while (true) {
            s = sc.nextLine();
            if (s.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean flg = true;
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '(':
                    case '[':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.empty() || stack.pop() != '(') flg = false;
                        break;
                    case ']':
                        if (stack.empty() || stack.pop() != '[') flg = false;
                        break;
                }
                if (!flg) break;
            }
            if (!stack.empty()) flg = false;
            System.out.println(flg ? "yes" : "no");
        }
    }
}