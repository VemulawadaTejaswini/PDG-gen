import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[][] dp = new int[n][2];
        /*
        dp[i][0]: 増加(非減少)
        dp[i][1]: 減少
        dp[i][x]: iまで数列を見たときの，分割列の最小数
        */
        dp[0][0] = 1;
        dp[0][1] = 1;
        for(int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
            dp[i][1] = dp[i - 1][1] + 1;
            if(a[i] >= a[i - 1]) dp[i][0]--;
            if(a[i] <= a[i - 1]) dp[i][1]--;
            dp[i][0] = Math.min(dp[i][0], dp[i][1] + 1);
            dp[i][1] = Math.min(dp[i][0] + 1, dp[i][1]);
        }
        System.out.println(Math.min(dp[n - 1][0], dp[n - 1][1]));
    }
}
