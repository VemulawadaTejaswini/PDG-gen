import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int w = s.nextInt();
        int []weight = new int[n];
        long []values = new long[n];
        for(int i = 0;i<n;i++){
            weight[i] = s.nextInt();
            values[i] = s.nextLong();
        }
        long dp[][] = new long[n+1][w+1];
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=w;j++){
                if(weight[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(values[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
