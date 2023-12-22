import java.util.*;
 
public class Main {
    private static final int INF = 1_000_000_001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[][] g = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    g[i][j] = 0;
                } else {
                    g[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            g[A-1][B-1] = C;
            g[B-1][A-1] = C;
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }

        int[][] l = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    l[i][j] = 0;
                } else if (g[i][j] <= L) {
                    l[i][j] = 1;
                } else {
                    l[i][j] = INF;
                }
            }
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    l[i][j] = Math.min(l[i][j], l[i][k] + l[k][j]);
                }
            }
        }


        int Q = sc.nextInt();
        long[] ans = new long[Q];
        for (int q = 0; q < Q; q++) {
            int s = sc.nextInt();
            s--;
            int t = sc.nextInt();
            t--;
            if (l[s][t] == INF) {
                ans[q] = -1;
            } else {
                ans[q] = l[s][t]-1;
            }
        }

        for (long a : ans) {
            System.out.println(a);
        }
    }
}
