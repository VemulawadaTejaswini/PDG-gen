import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextLong();
        long[][] dp = new long[n][n];
        for(int l = n-1; l>=0; l--) {
            for(int r = l; r<n; r++) {
                if(l==r) continue;
                dp[l][r] = Long.MAX_VALUE;
                long sum = 0;
                for(int i = l; i<=r; i++)
                    sum+=a[i];
                for(int k = l; k<r; k++)
                    dp[l][r] = Math.min(dp[l][r], dp[l][k]+dp[k+1][r]+sum);
            }
        }
        System.out.println(dp[0][n-1]);
    }
}