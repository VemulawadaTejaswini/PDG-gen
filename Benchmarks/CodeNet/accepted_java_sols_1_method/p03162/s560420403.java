import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n][3];
        for (int i=0; i<n; i++) {
            int a,b,c;
            a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
            dp[i][0] = a + (i > 0 ? Math.max(dp[i-1][1], dp[i-1][2]) : 0);
            dp[i][1] = b + (i > 0 ? Math.max(dp[i-1][0], dp[i-1][2]) : 0);
            dp[i][2] = c + (i > 0 ? Math.max(dp[i-1][0], dp[i-1][1]) : 0);
        }
        System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
    }
}