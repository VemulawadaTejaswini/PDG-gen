import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    public static long[] readArray(FastReader in, int n) {
        String[] tokens = in.nextLine().split(" ");
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(tokens[i]);
        }
        return a;
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int n = in.nextInt();
        int m = in.nextInt();
        long k = in.nextInt();

        long[] a = readArray(in, n);
        long[] b = readArray(in, m);

        int ai = 0;
        int bi = 0;

        while (k > 0) {
            if (ai < n && bi < m) {
                if (a[ai] <= b[bi] && a[ai] <= k) {
                    k -= a[ai++];
                } else if (b[bi] <= k) {
                    k -= b[bi++];
                } else {
                    break;
                }
            } else if (bi == m) {
                if (a[ai] <= k) {
                    k -= a[ai++];
                } else {
                    break;
                }
            } else {
                if (b[bi] <= k) {
                    k -= b[bi++];
                }
            }
        }
        out.println(ai + bi);
    }
}
