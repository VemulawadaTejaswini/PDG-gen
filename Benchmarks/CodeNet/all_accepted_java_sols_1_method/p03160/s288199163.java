import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; ++i) {
            stones[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(stones[1] - stones[0]);
        for (int i = 2; i < stones.length; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(stones[i] - stones[i - 1]), dp[i - 2] + Math.abs(stones[i] - stones[i - 2]));
        }
        System.out.print(dp[n - 1]);
    }
}