import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        DFriends solver = new DFriends();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriends {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int M = Integer.parseInt(in.next());

            UnionFind G = new UnionFind(N);

            for (int i = 0; i < M; i++) {
                int a = Integer.parseInt(in.next()) - 1;
                int b = Integer.parseInt(in.next()) - 1;
                G.unite(a, b);
            }

            // 出力
            long ans = 0;
            for (int i = 0; i < N; i++) {
                long tmp = G.getSize(i);
                ans = Math.max(ans, tmp);
            }
            out.println(ans);

        }

        public class UnionFind {
            private int[] parent;
            private int[] rank;
            private int[] elmsize;

            public UnionFind(int size) {
                parent = new int[size];
                rank = new int[size];
                elmsize = new int[size];

                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parent[x] = x;
                rank[x] = 0;
                elmsize[x] = 1;
            }

            public void unite(int x, int y) {
                final int xRoot = root(x);
                final int yRoot = root(y);

                if (rank[xRoot] > rank[yRoot]) {
                    parent[yRoot] = xRoot;
                    elmsize[xRoot] += elmsize[yRoot];
                } else if (rank[xRoot] < rank[yRoot]) {
                    parent[xRoot] = yRoot;
                    elmsize[yRoot] += elmsize[xRoot];
                } else if (xRoot != yRoot) {
                    parent[yRoot] = xRoot;
                    rank[xRoot]++;
                    elmsize[xRoot] += elmsize[yRoot];
                }
            }

            public int root(int x) {
                if (x != parent[x]) {
                    parent[x] = root(parent[x]);
                }
                return parent[x];
            }

            public long getSize(int x) {
                return elmsize[root(x)];
            }

        }

    }
}

