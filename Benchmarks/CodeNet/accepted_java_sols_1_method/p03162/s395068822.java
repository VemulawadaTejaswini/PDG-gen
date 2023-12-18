import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }

        int[][] dp = new int[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        //dp[1] = Math.abs(a[0]-a[1]);

        for(int i=1; i<n; i++) {
            dp[i][0] = Integer.MIN_VALUE;
            dp[i][1] = Integer.MIN_VALUE;
            dp[i][2] = Integer.MIN_VALUE;

            dp[i][0] = Math.max(a[i] + dp[i-1][1], a[i] + dp[i-1][2]);
            dp[i][1] = Math.max(b[i] + dp[i-1][0], b[i] + dp[i-1][2]);
            dp[i][2] = Math.max(c[i] + dp[i-1][0], c[i] + dp[i-1][1]);
        }

        System.out.println(Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2])));
    }

}
