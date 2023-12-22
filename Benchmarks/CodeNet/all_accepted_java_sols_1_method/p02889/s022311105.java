import java.io.PrintWriter;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        final long INF = 1L << 60;
        long[][] G = new long[N][N];
        int[][] D = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(G[i], INF);
            Arrays.fill(D[i], 9999);
            G[i][i] = 0;
            D[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            int C = sc.nextInt();
            G[A][B] = G[B][A] = C;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    G[j][k] = Math.min(G[j][k], G[j][i] + G[i][k]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (G[i][j] <= L) {
                    D[i][j] = D[j][i] = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    D[j][k] = Math.min(D[j][k], D[j][i] + D[i][k]);
                }
            }
        }
        int Q = sc.nextInt();
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            int S = sc.nextInt() - 1;
            int T = sc.nextInt() - 1;
            writer.println(D[S][T] > 999 ? -1 : D[S][T] - 1);
        }
        writer.flush();
    }

}
