import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // educational dp 1

        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            long cost1 = Math.abs(list[i] - list[i + 1]) + dp[i];
            if (dp[i+1] == -1) {
                dp[i+1] = cost1;
            } else {
                dp[i+1] = Math.min(dp[i+1], cost1);
            }

            if (i != n - 2) {
                long cost2 = Math.abs(list[i] - list[i + 2]) + dp[i];
                if (dp[i+2] == -1) {
                    dp[i+2] = cost2;
                } else {
                    dp[i+2] = Math.min(dp[i+2], cost2);
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}