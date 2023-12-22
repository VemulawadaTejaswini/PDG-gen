import java.util.*;
public class Main{
    static long[][] dp = new long[110][100100];
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[][] a = new long[1000000][3];
        int n = sc.nextInt();
        int w = sc.nextInt();
        int weight[] = new int[110];
        int value[] = new int[110];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int sum_w=0; sum_w<=w; sum_w++){

                //i番目の品をナップサックに入れる場合
                if(sum_w - weight[i]>=0){
                    dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w - weight[i]]+value[i]);
                }
                //i番目の品を入れない場合
                dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w]);
            }
        }
        System.out.println(dp[n][w]);
    }
}
