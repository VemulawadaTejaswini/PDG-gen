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

        int ans = 0;
        long time = 0;
        for (int i = 0; i < n; i++) {
            time += a[i];
            long tmp = time;
            int cnt = i+1;
            for (int j : b) {
                if (tmp + j <= k) {
                    tmp += j;
                    cnt++;
                } else break;
            }

            if (tmp <= k)
                ans = Math.max(cnt, ans);
        }

        time = 0;
        for (int i = 0; i < m; i++) {
            time += b[i];
            if (time <= k)
                ans = Math.max(i+1, ans);
        }

        System.out.println(ans);
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