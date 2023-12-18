
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final long MOD = 998244353;

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        final long[][] addedRow = new long[c + 1][d + 1];
        addedRow[a][b] = 1;
        for (int i = b + 1; i <= d; i++) {
            addedRow[a][i] = addedRow[a][i - 1] * a % MOD;
        }

        final long[][] addedCol = new long[c + 1][d + 1];
        addedCol[a][b] = 1;
        for (int i = a + 1; i <= c; i++) {
            addedCol[i][b] = addedCol[i - 1][b] * b % MOD;
        }

        for (int i = a + 1; i <= c; i++) {
            for (int j = b + 1; j <= d; j++) {
                addedCol[i][j] = (addedCol[i - 1][j] + addedRow[i - 1][j]) * j % MOD;
                addedRow[i][j] = (addedCol[i][j - 1] + addedRow[i][j - 1] * i) % MOD;
            }
        }

        System.out.println(addedCol[c][d] + addedRow[c][d] % MOD);
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
    