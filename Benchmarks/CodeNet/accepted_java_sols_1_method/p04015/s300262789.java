import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        long[][] dp = new long[3000][N+1];
        dp[0][0] =1;
        for (int i=0;i<N;i++) {
            int x = sc.nextInt();
            long[][] arr = new long[3000][N+1];
            for (int k=0;k<N+1;k++) {
                for (int j=0;j<3000;j++) {
                    arr[j][k] = dp[j][k];
                }
            }
            for (int k=0;k<N;k++) {
                for (int j=0;j<2600;j++) {
                    // dp[j+x][k+1] += dp[j][k];
                    arr[j+x][k+1] += dp[j][k];
                }
            }
            for (int k=0;k<N+1;k++) {
                for (int j=0;j<3000;j++) {
                    dp[j][k] = arr[j][k];
                }
            }
            // long[] arr = new long[3000];
            // for (int j=0;j<2600;j++) {
            //     arr[j] += dp[j];
            //     arr[j+x] += dp[j];
            // }
            // for (int j=0;j<3000;j++) {
            //     dp[j] = arr[j];
            // }
        }
        long ans = 0L;
        for (int i=1;i<3000;i++) {
            // if (i%A==0) ans+=dp[i];
            for (int j=1;j<N+1;j++) {
                if (j*A==i) ans += dp[i][j];
            }
        }
        for (int i=0;i<30;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<N;j++) {
                sb.append(dp[i][j]);
                sb.append(" ");
            }
            // System.out.println(sb);
        }
        // System.out.println(Arrays.toString(Arrays.copyOf(dp, 50)));
        System.out.println(ans);
    }
}