import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[n+10];

        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;

            if (i-2 >= 0) {
                int cost = Math.abs(h[i] - h[i-2]);
                dp[i] = Math.min(cost+dp[i-2], dp[i]);
            }
            int cost = Math.abs(h[i] - h[i-1]);
            dp[i] = Math.min(cost+dp[i-1], dp[i]);
        }

        System.out.println(dp[n-1]);
    }
}
