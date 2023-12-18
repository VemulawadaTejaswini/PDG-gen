import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int[] w;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        n = sc.nextInt();
        k = sc.nextInt();
        w = new int[n];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sum += w[i];
        }

        System.out.println(solve(sum));
    }

    static int check(long x) {
        int i = 0;
        for (int j = 0; j < k; j++) {
            long sum = 0;
            while (sum + w[i] <= x) {
                sum += w[i];
                i++;
                if (i == n) return n;
            }
        }
        return i;
    }

    static long solve(long sum) {
        long left = 0;
        long right = sum;
        long mid = 0;
        while (left != right-1) {
            mid = (left + right) / 2;
            int cnt = check(mid);
            if (cnt >= n)
                right = mid;
            else
                left = mid;
        }
        return right;
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
