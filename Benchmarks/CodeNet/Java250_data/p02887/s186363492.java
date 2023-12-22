import java.io.*;
import java.util.*;

/**
 * @author:26019
 */
public class Main {

    public static void main(String[] args) throws Exception {
        solve();
    }

    private static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    private static int cal(int x) {
        int res = 1;
        while (x != 1) {
            if ((x & 1) == 1) {
                x = x * 3 + 1;
            } else {
                x >>= 1;
            }
            res++;
        }
        return res;
    }

    private static void solve() throws Exception {
        FastScanner cin = new FastScanner();
        int n = cin.nextInt();
        String s = cin.next() + " ";
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                res++;
        }
        System.out.println(res);
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        FastScanner() throws IOException {
        }

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        private void close() {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
