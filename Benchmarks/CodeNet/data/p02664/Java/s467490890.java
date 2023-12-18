import java.util.Arrays;
import java.util.Scanner;

class B2 {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] T = sc.next().toCharArray();
        final int[] dp = new int[T.length + 1];
        final char[] ans = Arrays.copyOf(T, T.length);
        for (int i = 1; i <= T.length; i++)
            if (T[i - 1] == 'P') {
                dp[i] = dp[i - 1];
            } else if (i >= 2 && T[i - 2] == 'P') {
                dp[i] = dp[i - 2] + 2;
                ans[i - 1] = 'D';
            } else if (i >= 2 && T[i - 2] == '?') {
                if (dp[i - 1] + 1 < dp[i - 2] + 2) {
                    dp[i] = dp[i - 2] + 2;
                    ans[i - 1] = 'P';
                    ans[i - 1] = 'D';
                } else {
                    dp[i] = dp[i - 1] + 1;
                    ans[i - 1] = 'D';
                }
            } else {
                dp[i] = dp[i - 1] + 1;
                ans[i - 1] = 'D';
            }
        System.err.println(dp[T.length]);
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B2.main();
    }
}
