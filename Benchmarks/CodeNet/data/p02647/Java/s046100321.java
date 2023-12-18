import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n+2];

        for (int i = 0; i < n; i++) {
            a[i+1] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int[] b = new int[n+2];
            for (int j = 1; j <= n; j++) {
                int max = Math.min(j+a[j]+1, n+1);
                int min = Math.max(j-a[j], 0);
                b[max]--; b[min]++;
            }

            int tmp = b[0];
            boolean isLoop = true;
            for (int j = 1; j <= n; j++) {
                tmp += b[j];
                if (a[j] != tmp) {
                    isLoop = false;
                    a[j] = tmp;
                }
            }

            if (isLoop)
                break;
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 1; i <= n; i++)
            pw.print(a[i] + " ");
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