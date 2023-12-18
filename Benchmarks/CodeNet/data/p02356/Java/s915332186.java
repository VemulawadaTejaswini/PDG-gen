import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];

        a[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();

            long cnt = 0;
            int right = 0;
            long sum = 0;
            for (int left = 0; left < n; left++) {
                while (right < n && sum + a[right] <= x)
                    sum += a[right++];

                cnt += right - left;

                if (right == left)
                    right++;
                else
                    sum -= a[left];
            }

            pw.println(cnt);
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
