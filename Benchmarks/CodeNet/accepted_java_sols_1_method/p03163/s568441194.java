import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [][]po=new int[n][2];
        for(int i=0;i<n;i++){
            po[i][0]=sc.nextInt();
            po[i][1]=sc.nextInt();
        }
        long dp[][]=new long[n+1][k+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(j-po[i-1][0]>=0)dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-po[i-1][0]]+po[i-1][1]);
                else dp[i][j]=dp[i-1][j];
            }
        }
        System.out.println(dp[n][k]);
    }
}
