import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] s = new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (search(s, n, t) >= 0)
                ans++;
        }

        System.out.println(ans);
    }

    // 線形探索
    static int search(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;
        while (a[i] != key) i++;
        if (i != n)
            return i;
        else
            return -1;
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
