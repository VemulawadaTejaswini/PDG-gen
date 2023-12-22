import java.util.Arrays;
import java.util.Scanner;

public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        long[][] dp = new long[n][w+1];
        for(int i=0; i<n; i++){
            dp[i][0] = 0;
        }
        // Arrays.fill(dp, 0);
        for(int i=0; i<n; i++){
            for(int j=1; j<w+1; j++){
                if(j>=weight[i]){
                    if(i==0)
                        dp[i][j] = value[i];
                    else{
                        // System.out.println(j);
                        dp[i][j] = Math.max(value[i]+dp[i-1][j-weight[i]],dp[i-1][j]);
                    }
                }else if(i-1>=0 && j-1>=0){
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<w+1; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(dp[n-1][w]);
        sc.close();
    }
}