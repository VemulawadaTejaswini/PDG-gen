import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[1<<n + 1][1<<m +1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= 1<<n; i++) {
            int[] sum = new int[m];
            int b = 0;
            for (int j = 0; j < n; j++) {
                if((i>>j & 1) == 1){
                    b += c[j];
                    for (int k = 0; k < m; k++) {
                        sum[k] += a[j][k];
                    }
                }
            }
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if(sum[j] < x){
                    ok = false;
                    break;
                }
            }
            if(ok){
                ans = Math.min(ans, b);
            }
        }
        if(ans == Integer.MAX_VALUE) ans = -1;
        System.out.println(ans);
        sc.close();

    }

}
