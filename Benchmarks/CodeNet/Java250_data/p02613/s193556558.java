import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] ans = new int[4]; // AC, WA, TLE, RE

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "AC":  ans[0]++; break;
                case "WA":  ans[1]++; break;
                case "TLE": ans[2]++; break;
                case "RE":  ans[3]++; break;
            }
        }

        System.out.println("AC x " + ans[0]);
        System.out.println("WA x " + ans[1]);
        System.out.println("TLE x " + ans[2]);
        System.out.println("RE  x " + ans[3]);
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