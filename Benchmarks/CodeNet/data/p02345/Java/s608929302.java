import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N, Q;
    static int[] C, X, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();

        C = new int[Q];
        X = new int[Q];
        Y = new int[Q];
        for (int i = 0; i < Q; i++) {
            C[i] = sc.nextInt();
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : solve()) {
            pw.println(i);
        }
        pw.flush();
    }

    static class RangeMinimumQuery {

        static final int INF = (1 << 31) - 1;

        private int n;
        private int[] dat;

        RangeMinimumQuery(int n_) {
            n = 1;
            while( n < n_ ) n *= 2;
            dat = new int[n*2];
            Arrays.fill(dat, INF);
        }

        void update(int k, int a) {
            k += n;
            dat[k] = a;

            while(k > 0) {
                k /= 2;
                dat[k] = Math.min(dat[k*2], dat[k*2+1]);
            }
        }

        int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) return INF;

            if (a <= l && r <= b) {
                return dat[k];

            } else {
                int vl = query(a, b, k * 2, l, (l + r) / 2);
                int vr = query(a, b, k * 2 + 1, (l + r) / 2, r);
                return Math.min(vl, vr);
            }
        }

        int query(int a, int b) {
            return query(a, b, 1, 0, n);
        }
    }

    static List<Integer> solve() {
        RangeMinimumQuery rmq = new RangeMinimumQuery(N+10);

        List<Integer> ans = new ArrayList<>();
        int q = 0;
        for (int i = 0; i < Q; i++) {
            if( C[i] == 0 ) {
                rmq.update(X[i], Y[i]);
            } else {
                ans.add(rmq.query(X[i], Y[i]+1));
            }
        }
        return ans;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

