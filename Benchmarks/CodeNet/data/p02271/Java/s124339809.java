import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] a = new int[20];

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        for (int i : m) {
            System.out.println(solve(0, i) ? "yes" : "no");
        }
    }

    static boolean solve(int i, int m) {
        if (m == 0) return true;
        if (i >= n) return false;
        return solve(i + 1, m) || solve(i + 1, m - a[i]);
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
