import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        UnionFind graph1 = new UnionFind(n);

        int usedEdges = 0;
        for (int i = 0; i < m; i++) {
            if (graph1.union(readInt(), readInt())) {
                usedEdges++;
                n--;
            }
        }

        System.out.println(n - 1);
    }

    static class UnionFind {
        final int[] parent;
        final int[] rank;

        UnionFind(int n) {
            parent = IntStream.range(0, n + 1).toArray();
            rank = new int[n + 1];
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        public boolean union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return false;

            if (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
            else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            return true;
        }
    }
}

