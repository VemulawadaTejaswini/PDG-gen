import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        long z = 0;
        final long MAX = 1000000000000000000l;
        boolean isZero = false;
        int cntZero = 0;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();

            if (i == 0) {
                z = a;
            } else {
                if (a == 0)
                    isZero = true;

                if (z > 0) {
                    z *= a;
                    if (z > MAX || z < 0)
                        z = -1;
                }
            }

            while (a >= 10) {
                cntZero++;
                a /= 10;
            }
        }

        if (isZero)
            z = 0;
        else if (cntZero > 18)
            z = -1;
        System.out.println(z);
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