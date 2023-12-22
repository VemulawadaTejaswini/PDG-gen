import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double coins[]=new double[n+1];
        for (int i=1;i<=n;i++)coins[i]=sc.nextDouble();
        double dp[][]=new double[n+1][n+1];
        dp[0][0]=1.0;
        for (int i=1;i<=n;i++){
            for (int j=0;j<=i;j++){
                if (j==0)dp[i][j]=dp[i-1][j]*(1.0-coins[i]);
                else {
                    dp[i][j]=dp[i-1][j]*(1.0-coins[i])+dp[i-1][j-1]*coins[i];
                }
            }
        }
        double ans=0.0;
        for (int i=(n+1)/2;i<=n;i++){
            ans+=dp[n][i];
        }
        System.out.println(ans);
    }
}