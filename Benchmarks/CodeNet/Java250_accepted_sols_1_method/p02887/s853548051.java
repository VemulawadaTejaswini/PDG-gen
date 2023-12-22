import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length; i++) {
            if (stack.isEmpty()) {
                stack.push(S[i]);
                continue;
            }
            if (stack.peek() == S[i]) {
                continue;
            }
            stack.push(S[i]);
        }

        System.out.println(stack.size());
    }

}
