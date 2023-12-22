import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int leftIndex = 0;
        int rightIndex = 1;
        while (rightIndex < s.length()) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                ans += 2;
                if (stack.empty()) {
                    leftIndex = rightIndex + 1;
                    rightIndex = rightIndex + 2;
                } else {
                    leftIndex = stack.pop();
                    rightIndex = rightIndex + 1;
                }
            } else {
                stack.push(leftIndex);
                leftIndex = rightIndex;
                rightIndex = rightIndex + 1;
            }
        }
        System.out.println(ans);
    }

}
