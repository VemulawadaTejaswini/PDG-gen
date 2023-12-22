import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {
    private static void solve() throws Exception {
        char[] s = fs.next().toCharArray();
        int sum = 0;
        for (char c : s) {
            sum += (c-'0');
        }
        out.println(sum % 9 == 0 ? "Yes" : "No" );
    }

    private static FastScanner fs = new FastScanner();
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int T = 1;
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    static void debug(Object... O) {
        System.err.print("DEBUG ");
        System.err.println(Arrays.deepToString(O));
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return next();
        }
    }
}
