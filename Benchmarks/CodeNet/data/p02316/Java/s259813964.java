import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int[] value = new int[N+1];
        int[] weight = new int[N+1];
        for(int i = 1; i <= N; i++){
            value[i] = Integer.parseInt(sc.next());
            weight[i] = Integer.parseInt(sc.next());
        }
    
        int[][] dp = new int[N+1][W+1];
        for(int i = 1; i <= N; i++){
            for(int w = 1; w <= W; w++){
                if(weight[i] <= w){
                    dp[i][w] = Math.max(dp[i][w - weight[i]] + value[i], dp[i-1][w]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
    
        System.out.println(dp[N][W]);
    }
}
