import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[n+10];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j < 0)
                    break;
                int cost = Math.abs(h[i] - h[i-j]);
                dp[i] = Math.min(cost + dp[i-j], dp[i]);
            }
        }

        System.out.println(dp[n-1]);
    }
}
