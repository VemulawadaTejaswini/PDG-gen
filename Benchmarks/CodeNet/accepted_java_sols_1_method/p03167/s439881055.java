import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt();
        int arr[][]=new int[h][w];
        for (int i=0;i<h;i++){
            String s=sc.next();
            for (int j=0;j<w;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        int mod=(int)1e9+7;
        int dp[][]=new int[h][w];
        dp[0][0]=1;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (i-1>=0 && arr[i][j]=='.') {
                    dp[i][j] += dp[i-1][j];
                }
                if (j-1>=0 && arr[i][j]=='.'){
                    dp[i][j]+=dp[i][j-1];
                }
                if (dp[i][j]>=mod)dp[i][j]-=mod;
            }
        }
        System.out.println(dp[h-1][w-1]);
    }
}