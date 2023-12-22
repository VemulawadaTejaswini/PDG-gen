import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int rate_num = 8;
        boolean[] is_rate = new boolean[rate_num];
        int cnt_change = 0;

        for (int i : a) {
            if (i >= 3200) {
                cnt_change++;
            } else {
                is_rate[i / 400] = true;
            }
        }

        int min = 0;
        for (boolean i : is_rate) {
            if (i)
                min++;
        }

        int max = min+cnt_change;
        min = Math.max(1, min);
        System.out.println(min + " " + max);
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