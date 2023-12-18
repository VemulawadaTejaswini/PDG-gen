import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();

        long[] cnt = new long[100100];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            cnt[a]++;
            sum += a;
        }

        PrintWriter pw = new PrintWriter(System.out);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            sum -= b * cnt[b];
            sum += c * cnt[b];
            pw.println(sum);

            cnt[c] += cnt[b];
            cnt[b] = 0;
        }

        pw.flush();
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}