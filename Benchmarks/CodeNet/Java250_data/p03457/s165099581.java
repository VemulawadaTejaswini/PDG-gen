import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] T, X, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        T = new int[N];
        X = new int[N];
        Y = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        System.out.println(solve() ? "Yes" : "No");
    }

    static boolean solve() {
        for (int i = 0; i < N; i++) {
            int pt = i == 0 ? 0 : T[i-1];
            int px = i == 0 ? 0 : X[i-1];
            int py = i == 0 ? 0 : Y[i-1];

            int dt = T[i] - pt;
            int dd = Math.abs(X[i] - px) + Math.abs(Y[i] - py);

            if( dd > dt ) return false;
            if( (dt - dd) % 2 == 1 ) return false;
        }
        return true;
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
