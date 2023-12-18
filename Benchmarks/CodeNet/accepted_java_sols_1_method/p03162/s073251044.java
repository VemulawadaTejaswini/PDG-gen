import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }


        int[][] dp = new int[n+1][3];
        int ax = 0, bx = 1, cx = 2;

        for (int i = 1; i <= n; i++) {
            dp[i][ax] = a[i-1] + Math.max(dp[i - 1][bx], dp[i - 1][cx]);
            dp[i][bx] = b[i-1] + Math.max(dp[i - 1][ax], dp[i - 1][cx]);
            dp[i][cx] = c[i-1] + Math.max(dp[i - 1][ax], dp[i - 1][bx]);
        }

        int max = Math.max(dp[n][ax], dp[n][bx]);
        max = Math.max(max, dp[n][cx]);
        System.out.println(max);
    }
}

