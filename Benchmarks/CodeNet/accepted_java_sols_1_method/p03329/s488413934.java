import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // educational dp 2

        int n = sc.nextInt();

        long[] dp = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        int six = 1;

        while (six * 6 <= n) {
            six *= 6;
            for (int i = 0; i <= n - six; i++) {
                dp[i + six] = Math.min(dp[i + six], dp[i] + 1);
            }
        }

        int nine = 1;

        while (nine * 9 <= n) {
            nine *= 9;
            for (int i = 0; i <= n - nine; i++) {
                dp[i + nine] = Math.min(dp[i + nine], dp[i] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}