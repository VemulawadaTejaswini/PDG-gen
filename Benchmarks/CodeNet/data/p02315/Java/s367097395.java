import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] value = new int[N];
        int[] weight = new int[N];
        for(int i=0; i<N; i++){
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        //dp配列
        int[][] dp = new int[N+1][W+1];

        for(int i=0; i < N; i++){
            for(int w=0; w <= W; w++){
                if(w >= weight[i]){
                    dp[i+1][w] = Math.max(dp[i][w-weight[i]]+ value[i], dp[i][w]);
                }else{
                    dp[i+1][w] = dp[i][w];
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}
