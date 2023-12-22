import javax.swing.text.MutableAttributeSet;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i-1];
            dp[i][1] = Math.max(dp[i-1][2], dp[i-1][0]) + b[i-1];
            dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0]) + c[i-1];
        }

        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
    }
}
