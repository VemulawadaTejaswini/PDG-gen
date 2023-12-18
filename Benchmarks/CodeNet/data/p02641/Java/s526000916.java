import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int x = sc.nextInt()-1;
        int n = sc.nextInt();

        boolean[] isExist = new boolean[100];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt()-1;
            isExist[p] = true;
        }

        int ans = -1;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            if (!isExist[i]) {
                if (Math.abs(x-i) < dist) {
                    ans = i+1;
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