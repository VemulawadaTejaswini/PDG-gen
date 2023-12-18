import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double angH = 30 * h + 0.5 * m;
        double angM = 6 * m;
        double disAng = Math.abs(angH - angM);

        if (disAng == 0) {
            System.out.println(Math.abs(a - b));
            return;
        }

        double angC = disAng;
        if (disAng > 180)
            angC = 360 - disAng;
        double cosC = Math.cos(Math.toRadians(angC));
        double c = a * a + b * b - 2 * a * b * cosC;

        System.out.println(Math.sqrt(c));
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
