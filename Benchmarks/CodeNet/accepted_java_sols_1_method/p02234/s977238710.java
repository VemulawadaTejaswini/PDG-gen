import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long INF = 1_000_000_000_000_000L;
        int n = sc.nextInt();
        int[] row = new int[n];
        int[] c = new int[n];
        for (int i=0;i<n;i++) {
            row[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        long[][] dp = new long[n+1][n+1];
        for (int w=1;w<=n;w++) {
            for (int l=0;l<n;l++) {
                int r = l+w;
                if (r>n) continue;
                long tmp = INF;
                if (r-l==1) tmp = 0;
                for (int mid=l+1;mid<r;mid++) {
                    tmp = Math.min(tmp, dp[l][mid]+dp[mid][r]+(long)row[l]*c[mid-1]*c[r-1]);
                }
                dp[l][r] = tmp;
            }
        }
        System.out.println(dp[0][n]);
    }
}
