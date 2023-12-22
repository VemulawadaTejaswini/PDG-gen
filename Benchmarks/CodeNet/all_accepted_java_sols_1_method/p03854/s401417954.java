import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String S = cin.next();

        String[] words = {"dream", "dreamer", "erase", "eraser"};

        boolean[] dp = new boolean[S.length() + 1];

        dp[0] = true;

        for (int i = 0; i < S.length(); i++) {
            if (!dp[i]) {
                continue;
            }

            for (String word : words) {
                int end = i + word.length();
                if (end > S.length()) {
                    continue;
                }
                if (S.substring(i, end).equals(word)) {
                    dp[end] = true;
                }
            }
        }

        if (dp[S.length()]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}