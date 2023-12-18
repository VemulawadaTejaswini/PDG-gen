import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve((readInt())));
        pw.close();
    }

    static long exponentiation(long base, int exp) {
        long power = 1;
        while (exp > 0) {
            if (exp % 2 == 1) power = power * base % MOD;
            base = base * base % MOD;
            exp /= 2;
        }
        return power;
    }

    static final int MOD = 1_000_000_007;

    private static long solve(int N) {
        long res = exponentiation(10, N)
                - exponentiation(9, N) * 2
                + exponentiation(8, N);

        res = (res + 3L * MOD) % MOD;
        return res;
    }
}