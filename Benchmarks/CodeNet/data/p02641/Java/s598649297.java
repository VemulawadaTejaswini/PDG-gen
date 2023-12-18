import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int x = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isExist = new boolean[102];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            isExist[p] = true;
        }

        int ans = 0;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < 102; i++) {
            if (!isExist[i]) {
                if (Math.abs(x-i) < dist) {
                    ans = i;
                    dist = Math.abs(x-i);
                }
            }
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