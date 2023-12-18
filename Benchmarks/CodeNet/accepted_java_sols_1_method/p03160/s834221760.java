import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for (int i = 0; i < n-1; i++) {
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i] - h[i + 1]));
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(h[i] - h[i + 2]));
            }
        }
        System.out.println(dp[n-1]);

    }
}
