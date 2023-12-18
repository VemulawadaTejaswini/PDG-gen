import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DarkRoom solver = new DarkRoom();
        solver.solve(1, in, out);
        out.close();
    }

    static class DarkRoom {
        int[] D;
        int[] Dark;
        int[][] v;
        int N;
        int M;
        int K;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            K = in.nextInt();
            D = new int[M];
            Dark = new int[N];
            Arrays.fill(Dark, -1);
            for (int i = 0; i < M; i++) {
                D[i] = in.nextInt() - 1;
                Dark[D[i]] = i;
            }
            v = new int[N][K];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < K; j++) {
                    v[i][j] = in.nextInt() - 1;
                }
            }
            final int INF = (int) 1e9;
            int[] minDist = new int[1 << M];
            Arrays.fill(minDist, INF);
            minDist[(1 << M) - 1] = 0;
            Queue<Integer> que = new ArrayDeque<>();
            que.add((1 << M) - 1);
            while (!que.isEmpty()) {
                int now = que.poll();
                for (int i = 0; i < K; i++) {
                    int nxtBit = 0;
                    for (int j = 0; j < M; j++) {
                        if ((now & (1 << j)) != 0 && Dark[v[D[j]][i]] != -1) {
                            nxtBit |= (1 << Dark[v[D[j]][i]]);
                        }
                    }
                    if (minDist[now] + 1 < minDist[nxtBit]) {
                        minDist[nxtBit] = minDist[now] + 1;
                        que.add((nxtBit));
                    }
                }
            }
            out.println(minDist[0]);
        }

    }
}


