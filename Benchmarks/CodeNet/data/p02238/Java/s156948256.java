

import java.util.Scanner;

public class Main {
    static int N = 100;
    static int WHITE = 0;
    static int GRAY = 1;
    static int BLACK = 2;

    static int n;
    static int[][] M = new int[N][N];
    static int[] color = new int[N];
    static int[] d = new int[N];
    static int[] f = new int[N];
    static int tt;

    // 再帰関数による深さ優先探索
    public static void dfsVisit(int u) {
        int v;
        color[u] = GRAY;
        d[u] = ++tt; // 最初の訪問
        for(v = 0; v < n; v++) {
            if(M[u][v] == 0) continue;
            if(color[v] == WHITE) {
                dfsVisit(v);
            }
        }
        color[u] = BLACK;
        f[u] = ++tt; // 訪問の終了
    }

    public static void dfs() {
        int u;
        // 初期化
        for(u = 0; u < n; u++) color[u] = WHITE;
        tt = 0;

        for(u = 0; u < n; u++) {
            // 未訪問のuを支店として深さ優先探索
            if(color[u] == WHITE) dfsVisit(u);
        }
        for(u = 0; u < n; u++) {
            System.out.println((u+1) + " " + d[u] + " " + f[u]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, v, k, i, j;
        n = sc.nextInt();
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) M[i][j] = 0;
        }
        for(i = 0; i < n; i++) {
            u = sc.nextInt();
            k = sc.nextInt();
            u--;
            for(j = 0; j < k; j++) {
                v = sc.nextInt();
                v--;
                M[u][v] = 1;
            }
        }
        dfs();
    }
}

