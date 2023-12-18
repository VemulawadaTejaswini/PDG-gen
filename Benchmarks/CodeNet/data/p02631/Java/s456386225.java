import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] a = new int[n];

        int xor_All = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (i == 0)
                xor_All = a[i];
            else
                xor_All = xor_All ^ i;
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < n-1; i++) {
            pw.print(xor_All + " ");
        }
        pw.println(xor_All);
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