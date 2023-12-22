import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        char[] s = sc.next().toCharArray();
        Queue<Character> stack = new LinkedList<>();
        int ans = 0;
        for (char c : s) {
            if (stack.isEmpty()) {
                stack.add(c);
                continue;
            }

            if (stack.peek() != c) {
                ans += 2;
                stack.poll();
            } else {
                stack.add(c);
            }
        }
        System.out.println(ans);
    }
}