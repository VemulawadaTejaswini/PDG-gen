import java.util.*;

public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] seq = new int[N];
        for(int i = 0; i < N; i++){
            seq[i] = sc.nextInt();
        }
        long[][] dp = new long[N][21];
        dp[0][0] = 1;
        for(int i = 0; i < N-1; i++){
            for(int ii = 0; ii <= 20; ii++){
                if(ii + seq[i] <= 20){
                    dp[i+1][ii+seq[i]] += dp[i][ii];
                }
                if(ii - seq[i] >= 0){
                    dp[i+1][ii-seq[i]] += dp[i][ii];
                }
            }
        }
        /*
        for(long[] d: dp){
            System.out.println(Arrays.toString(d));
        }
        */
        System.out.println(dp[N-1][seq[N-1]]);
    }
    public static void main(String[] args){
        new Main().run();
    }
}