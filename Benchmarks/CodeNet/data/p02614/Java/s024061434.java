import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] isBlack = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                isBlack[i][j] = s[j] == '#';
            }
        }

        int ans = 0;
        for (int i = 0; i < (1 << h); i++) {
            for (int j = 0; j < (1 << w); j++) {
                int cnt = 0;

                for (int l = 0; l < h; l++) {
                    if ((i>>l & 1) == 1) continue;
                    for (int m = 0; m < w; m++) {
                        if ((j>>m & 1) == 1) continue;
                        if (isBlack[l][m]) cnt++;
                    }
                }

                if (cnt == k) ans++;
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