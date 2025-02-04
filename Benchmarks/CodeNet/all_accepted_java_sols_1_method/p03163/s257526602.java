import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),W=sc.nextInt();
        int w[]=new int[n+1];int v[]=new int[n+1];
        for (int i=1;i<=n;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        long dp[][]=new long[n+1][W+1];
        for (int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                if (j>=w[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j - w[i]] + v[i], dp[i - 1][j]);
                }else dp[i][j]=dp[i-1][j];
            }
        }
        System.out.println(dp[n][W]);
    }
}