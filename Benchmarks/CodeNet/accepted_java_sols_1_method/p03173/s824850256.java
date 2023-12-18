import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long INF = 1_000_000_000_000_000_000L;
        int N = sc.nextInt();
        int[] a = new int[N];
        long[] ruiseki = new long[N+1];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
            ruiseki[i+1] = ruiseki[i]+a[i];
        }

        long[][] dp = new long[N+1][N+1];
        for (int w=1;w<=N;w++) {
            for (int l=0;l<N;l++) {
                int r = l+w;
                if (r>N) continue;
                if (r==l+1) {
                    dp[l][r] = 0;
                } else {
                    long tmp = INF;
                    for (int mid=l+1;mid<r;mid++) {
                        tmp = Math.min(tmp, dp[l][mid]+dp[mid][r]+ruiseki[r]-ruiseki[l]);
                    }
                    dp[l][r] = tmp;
                }
            }
        }
        System.out.println(dp[0][N]);
    }
}