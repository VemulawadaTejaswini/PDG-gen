import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int k = nextInt();

        int result = 0;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            result += 1;
            sum += 1;
            if (sum == k) {
                System.out.println(result);
                return;
            }
        }
        for (int i = 0; i < b; i++) {
            result += 0;
            sum += 1;
            if (sum == k) {
                System.out.println(result);
                return;
            }
        }
        for (int i = 0; i < c; i++) {
            result -= 1;
            sum += 1;
            if (sum == k) {
                System.out.println(result);
                return;
            }
        }

    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int Char2Int(Character c) {
        return Character.getNumericValue(c);
    }

    static double Char2Double(Character c) {
        return (double) Char2Int(c);
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            a = a % b; // 残り部分
            return gcd(b, a); // 残り部分から最小の正方形を見つける
        }
    }
}