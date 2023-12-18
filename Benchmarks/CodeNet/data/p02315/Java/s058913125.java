
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] v = new int[N+1];
        int[] w = new int[W+1];

        for(int i=1; i<N+1; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        int dp[][] = new int[N+1][W+1];
        for(int i=0; i<N+1; i++)
            Arrays.fill(dp[i], 0);

        for(int ni=1; ni<N+1; ni++) {
            for(int wi=1; wi<W+1; wi++) {
                dp[ni][wi] = dp[ni - 1][wi];
                if(wi-w[ni] >= 0)
                    dp[ni][wi] = Math.max(dp[ni][wi], dp[ni-1][wi-w[ni]] + v[ni]);
            }
         }

        System.out.println(dp[N][W]);
    }
}

