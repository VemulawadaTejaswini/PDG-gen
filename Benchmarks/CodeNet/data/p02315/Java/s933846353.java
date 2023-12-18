import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];

        for(int i = 0; i < n; i++){
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][w + 1];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= w; j++){
                if(j >= weight[i]){
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - weight[i]] + value[i]);
                }else{
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }

        System.out.println(dp[n][w]);
    }
}

