
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n = 100;
    public static int N;
    public static int[] color = new int[n];
    public static int[] nt = new int[n];
    public static int[] d = new int[n];
    public static int[] f = new int[n];
    public static int[][] M = new int[n][n];
    public static int WHITE = -1;
    public static int GRAY = 0;
    public static int BLACK = 1;
    public static int t;

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                int b = sc.nextInt();
                M[u - 1][b - 1] = 1;
            }
        }

        //??????
        for(int i = 0; i < N; i++) {
            color[i] = WHITE;
            nt[i] = 0;
        }
        t = 0;
        for(int u = 0; u < N; u++) {
            if(color[u] == WHITE) dfs_visit(u);
        }
        for(int i = 0; i < N; i++) {
            System.out.printf("%d %d %d\n", i + 1, d[i], f[i]);
        }
    }

    public static int next(int u) {
        for(int v = nt[u]; v < n; v++) {
            nt[u] = v + 1;
            if(M[u][v] == 1) return v;
        }
        return -1;
    }

    public static void dfs_visit(int r) {
        Stack<Integer> S = new Stack<Integer>();
        S.push(r);
        color[r] = GRAY;
        d[r] = ++t;

        while(!S.empty()) {
            int u = S.peek();
            int v = next(u);
            if(v != -1 && color[v] == WHITE) {
                S.push(v);
                color[v] = GRAY;
                d[v] = ++t;
            }
            else {
                S.pop();
                color[u] = BLACK;
                f[u] = ++t;
            }
        }
    }
}