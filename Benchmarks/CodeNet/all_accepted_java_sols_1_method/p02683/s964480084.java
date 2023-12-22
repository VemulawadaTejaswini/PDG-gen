import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INF = 1001001001;
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

        int ans = INF;
        for (int s = 0; s < (1<<n); s++) {
            int cost = 0;
            int[] d = new int[m];
            for (int i = 0; i < n; i++) {
                if ((s>>i&1) == 1) {
                    cost += c[i];
                    for (int j = 0; j < m; j++) {
                        d[j] += a[i][j];
                    }
                }
            }
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if (d[j] < x) ok = false;
            }
            if (ok) ans = Math.min(ans, cost);
        }
        if (ans == INF) System.out.println(-1);
        else System.out.println(ans);
        
    }

}