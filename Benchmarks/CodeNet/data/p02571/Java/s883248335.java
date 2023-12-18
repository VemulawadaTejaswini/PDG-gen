import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int ans = t.length;
        for (int i = 0; i <= s.length - t.length; i++) {
            int tmp = 0;
            for (int j = 0; j < t.length; j++) {
                if (s[i+j] != t[j])
                    tmp++;
            }
            ans = Math.min(tmp, ans);

            if (ans == 0)
                break;
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