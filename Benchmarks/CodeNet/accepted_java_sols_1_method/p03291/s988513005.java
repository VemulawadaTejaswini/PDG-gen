import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        long[][] dp = new long[s.length + 1][4];
        for (int i = s.length; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                if (i == s.length) {
                    dp[i][j] = j == 3 ? 1 : 0;
                } else {
                    dp[i][j] = dp[i + 1][j] * (s[i] == '?' ? 3 : 1);
                    if (j < 3 && (s[i] == '?' || s[i] == 'A' + j)) {
                        dp[i][j] += dp[i + 1][j + 1];
                    }
                    dp[i][j] %= 1e9 + 7;
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}