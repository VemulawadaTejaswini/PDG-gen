import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int INF = 2000000000;
        int[] h = new int[N];
        long[] dp = new long[N + 1];
        for(int i=0;i<N;i++) {
            h[i] = sc.nextInt();
            dp[i] = INF;
        }
        dp[1] = 0;
        long reg;
        for(int i=2;i<N+1;i++){
            reg = INF;
            for(int j=1;j<Math.min(i, K+1);j++){
                reg = Math.min(reg, dp[i - j] + Math.abs(h[i - 1] - h[i - j - 1]));
            }
            dp[i] = reg;
        }
        System.out.println(dp[N]);
    }
}
