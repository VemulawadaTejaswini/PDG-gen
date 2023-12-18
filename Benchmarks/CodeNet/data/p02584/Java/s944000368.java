import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        long x = in.nextLong();
        long k = in.nextLong();
        long d = in.nextLong();

        long rem = ((x % d) + d) % d; // >= 0, < d
        long q = Math.abs(x - rem) / d;
//        out.println("rem: " + rem);
//        out.println("q: " + q);

        if (x > rem) {
            // have to move q times to get to rem
            if (k >= q) {
                // can move to rem
                if ((k - q) % 2 == 0) {
                    out.println(rem);
                } else {
                    out.println(Math.abs(d - rem));
                }
            } else {
                // cannot get to rem
                out.println(x - k * d);
            }
        } else if (x == rem) {
            if ((k - q) % 2 == 0) {
                out.println(rem);
            } else {
                out.println(Math.abs(d - rem));
            }
        } else {
            // x is less than rem
            // have to move q times to get to rem
            if (k >= q) {
                // can move to rem
                if ((k - q) % 2 == 0) {
                    out.println(rem);
                } else {
                    out.println(Math.abs(d - rem));
                }
            } else {
                // cannot get to rem
                out.println(x - k * d);
            }
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
