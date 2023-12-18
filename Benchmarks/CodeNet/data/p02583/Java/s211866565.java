import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (l[i] >= l[j]) continue;

                for (int k = 0; k < n; k++) {
                    if (l[i] >= l[k] || l[j] >= l[k]) continue;

                    if (l[i] + l[j] > l[k] &&
                        l[j] + l[k] > l[i] &&
                        l[k] + l[i] > l[j]) {
                        sum++;
                        System.out.println(l[i] + " " + l[j] + " " + l[k]);
                    }
                }
            }
        }
        System.out.println(sum);
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