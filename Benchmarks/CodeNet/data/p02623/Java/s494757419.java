import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        int b_cnt = 0;
        long b_time = 0;
        for (int i = 0; i < m; i++) {
            if (b_time + b[i] <= k) {
                b_cnt++;
                b_time += b[i];
            } else break;
        }

        int a_cnt = 0;
        long a_time = 0;
        int max_cnt = b_cnt;
        for (int i = 0; i < n; i++) {
            if (a_time + a[i] <= k) {
                a_cnt++;
                a_time += a[i];

                while (a_time + b_time > k) {
                    if (b_cnt > 1)
                        b_time -= b[--b_cnt];
                    else
                        break;
                }

                if (a_time + b_time <= k)
                    max_cnt = Math.max(a_cnt+b_cnt, max_cnt);
            } else break;
        }

        System.out.println(max_cnt);
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