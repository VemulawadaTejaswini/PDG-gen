import java.util.*;

public class Main {
    private static final long INF = 1 << 60;
    private static long[][] dp = new long[110][100100];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int[] weight = new int[110];
        long[] value = new long[110];
        for(int i=0;i<N;i++){
            weight[i] = Integer.parseInt(sc.next());
            value[i] = Long.parseLong(sc.next());
        }
        for(int i=0;i<N;i++){
            for(int sumW=0;sumW<=W;sumW++){
                if(sumW - weight[i] >= 0){
                    dp[i+1][sumW] = Math.max(dp[i+1][sumW],dp[i][sumW - weight[i]] + value[i]);
                }
                dp[i+1][sumW] = Math.max(dp[i+1][sumW],dp[i][sumW]);
            }
        }
        System.out.println(dp[N][W]);
    }
}
