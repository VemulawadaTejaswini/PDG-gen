import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    FastScanner sc;
    PrintWriter p;

    void solve() {
        int N = sc.nextInt();
        long mod = 1000000007;
        int A[] = sc.nextIntArray(N);

        long ans = 0;
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++)
                ans = (ans % mod + (A[i] % mod * A[j] % mod) % mod) % mod;
        }

        p.print(ans);
    }

    void run() {
        try {
            sc = new FastScanner(new File("SOP.in"));
            p = new PrintWriter(new File("SOP.out"));

            solve();

            p.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        sc = new FastScanner(System.in);
        p = new PrintWriter(System.out);

        solve();

        p.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int N) {
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            return A;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int N) {
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            return A;
        }

        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int N) {
            double[] A = new double[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextDouble();
            }
            return A;
        }

    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}


