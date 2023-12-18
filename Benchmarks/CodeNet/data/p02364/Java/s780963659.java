import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;

import static java.lang.System.out;

public class Main {
    private static final int INF = (int)1e9;

    static class Vertex {
        int v;
        Set<Integer> vs;

        public Vertex(int v) {
            this.v = v;
            this.vs = new HashSet<>();
        }
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object other) {
            if (other != null && other instanceof Pair) {
                Pair p = (Pair)other;

                return p.first == first && p.second == second;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash += hash*31 + first;
            hash += hash*31 + second;

            return hash;
        }
    }

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            Vertex[] g = new Vertex[n];
            for (int i = 0; i < n; i++)
                g[i] = new Vertex(i);

            int m = in.nextInt();
            int[][] ws = new int[n][n];
            for (int i = 0;i < m; i++) {
                int f = in.nextInt();
                int t = in.nextInt();
                int w = in.nextInt();

                g[f].vs.add(t);
                g[t].vs.add(f);
                ws[f][t] = ws[t][f] = w;
            }

            prim(g, n, ws, 0);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

    private static void prim(Vertex[] g, int n, int[][] ws, int s) {
        int[][] d = new int[n][2];
        for (int i = 0; i < n; i++) {
            d[i][0] = INF;
            d[i][1] = -1;
        }

        d[s][0] = 0;
        d[s][1] = s;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.second, y.second));
        pq.add(new Pair(s, 0));

        int[] visited = new int[n];
        while (!pq.isEmpty()) {
            Pair v = pq.poll();

            if (visited[v.first] == 1)
                continue;

            visited[v.first] = 1;
            for (int vv : g[v.first].vs) {
                int nd = ws[v.first][vv];
                if (nd < d[vv][0] && d[v.first][1] != vv) {
                    Pair old = new Pair(vv, d[vv][0]);
                    d[vv][0] = nd;
                    d[vv][1] = v.first;
                    pq.remove(old);
                    pq.add(new Pair(vv, d[vv][0]));
                }
            }
        }

        long mc = 0L;
        for (int i = 0; i < n; i++)
            mc += d[i][0];

        out.printf("%d\n", mc);
    }
}