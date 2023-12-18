import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public int[] e;
        public int[][] m;
        public static int MAX = Integer.MAX_VALUE;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int rooms = in.nextInt();
            int loads = in.nextInt();

            e = new int[rooms];
            Arrays.fill(e, MAX);

            m = new int[rooms][rooms];

            for (int i = 0; i < loads; i++) {
                int src = in.nextInt() - 1;
                int dist = in.nextInt() - 1;

                m[src][dist] = 1;
                m[dist][src] = 1;
            }
            bfs(0);
            for (int i = 1; i < rooms; i++) {
                if (e[i] == MAX) {
                    out.append("No");
                    return;
                }
            }

            out.append("Yes\n");
            for (int i = 1; i < rooms; i++) {
                out.append(e[i] + "\n");
            }
        }

        public void bfs(int s) {

            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.push(s);
            e[s] = 0;
            int u;
            while (!q.isEmpty()) {
                u = q.poll();
                for (int v = 0; v < e.length; v++) {
                    if (m[u][v] == 0) {
                        continue;
                    }
                    if (e[v] != MAX) {
                        continue;
                    }
                    e[v] = u + 1;
                    q.offer(v);
                }
            }
        }

    }
}

