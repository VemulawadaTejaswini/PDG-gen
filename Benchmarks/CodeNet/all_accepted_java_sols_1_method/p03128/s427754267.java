import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final int[] vol = new int[]{0,2,5,5,4,5,6,3,7,6};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }
        // dp[i]：ちょうどｉ本のマッチを使って作れる整数の最大の桁数
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i = 2; i <= N; i++) {
            for(int a : A){
                if(i >= vol[a]) dp[i] = Math.max(dp[i], dp[i - vol[a]] + 1);
            }
        }
        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        while(N > 0){
            for (int i = M-1; i >= 0; i--) {
                if(N - vol[A[i]] >= 0 && dp[N] - 1 == dp[N - vol[A[i]]]){
                    sb.append(A[i]);
                    N -= vol[A[i]];
                    break;
                }
            }
        }

        System.out.println(sb.toString());
        sc.close();

    }

}
