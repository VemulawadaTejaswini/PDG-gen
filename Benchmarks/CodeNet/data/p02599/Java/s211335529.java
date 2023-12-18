import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

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
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt() - 1;
            int N = 1;
            while (N < n)
                N <<= 1;
            int[] in = new int[N + 1];
            SegmentTree st = new SegmentTree(in);
            query[] queries = new query[q];
            for (int i = 0; i < queries.length; i++)
                queries[i] = new query(sc.nextInt(), sc.nextInt(), i);
            Arrays.sort(queries, (a, b) -> a.r == b.r ? a.l - b.l : a.r - b.r);
            int[] last = new int[n];
            int idx = 1;
          	int[] ans=new int[n];
            for (int i = 0; i < q; i++) {
                query temp = queries[i];
                while (idx <= temp.r) {
                    int l = last[arr[idx - 1]];
                    last[arr[idx - 1]] = idx;
                    st.update_range(l + 1, idx, 1);
                    idx++;
                }
                ans[temp.idx]=st.query(temp.l,temp.l);
            }
            for (int i = 0; i < q; i++)
                pw.println(ans[i]);
        }

        public class SegmentTree {
            int N;
            int[] array;
            int[] sTree;
            int[] lazy;

            SegmentTree(int[] in) {
                array = in;
                N = in.length - 1;
                sTree = new int[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
                lazy = new int[N << 1];
            }

            void update_range(int i, int j, int val) {
                update_range(1, 1, N, i, j, val);
            }

            void update_range(int node, int b, int e, int i, int j, int val) {
                if (i > e || j < b)
                    return;
                if (b >= i && e <= j) {
                    sTree[node] += (e - b + 1) * val;
                    lazy[node] += val;
                } else {
                    int mid = b + e >> 1;
                    propagate(node, b, mid, e);
                    update_range(node << 1, b, mid, i, j, val);
                    update_range(node << 1 | 1, mid + 1, e, i, j, val);
                    sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
                }

            }

            void propagate(int node, int b, int mid, int e) {
                lazy[node << 1] += lazy[node];
                lazy[node << 1 | 1] += lazy[node];
                sTree[node << 1] += (mid - b + 1) * lazy[node];
                sTree[node << 1 | 1] += (e - mid) * lazy[node];
                lazy[node] = 0;
            }

            int query(int i, int j) {
                return query(1, 1, N, i, j);
            }

            int query(int node, int b, int e, int i, int j) {
                if (i > e || j < b)
                    return 0;
                if (b >= i && e <= j)
                    return sTree[node];
                int mid = b + e >> 1;
                propagate(node, b, mid, e);
                int q1 = query(node << 1, b, mid, i, j);
                int q2 = query(node << 1 | 1, mid + 1, e, i, j);
                return q1 + q2;

            }

        }

        public class query {
            int l;
            int r;
            int idx;

            public query(int l, int r, int idx) {
                this.l = l;
                this.r = r;
                this.idx = idx;
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

