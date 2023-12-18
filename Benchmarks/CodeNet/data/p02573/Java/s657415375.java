import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int m = sc.nextInt();
        UF dsu = new UF(n + 1);
        for (int i = 0; i < m; i++) {
            dsu.union(sc.nextInt(), sc.nextInt());
        }
        Set<Integer> seen = new HashSet<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int par = dsu.find(i);
            if (seen.contains(par)) continue;
            ans = Math.max(ans, dsu.size[par]);
            seen.add(par);
        }
        out.println(ans);
        out.close();
    }

    static class UF {
        private int[] parent;  // parent[i] = parent of i
        private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
        private int count;     // number of components
        private int[] size;
        public UF(int n) {
            if (n < 0) throw new IllegalArgumentException();
            count = n;
            parent = new int[n];
            rank = new byte[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        public int count() {
            return count;
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;

            // make root of smaller rank point to root of larger rank
            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
                size[rootQ] = size[rootQ] + size[rootP];
            }
            else if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] = size[rootP] + size[rootQ];
            }
            else {
                parent[rootQ] = rootP;
                size[rootP] = size[rootP] + size[rootQ];
                rank[rootP]++;
            }
            count--;
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}