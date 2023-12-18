import java.util.*;
import java.io.*;

public class Main {

    private static final int MOD = 998244353;

    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        int S = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        // dp[i][s] is the sum(f(T, s), T is a subset of [0:i], s is the target
        // sum)
        int[][] dp = new int[N + 1][S + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            for (int s = 0; s <= S; s++) {
                // for ith item, 2 choices: put into set T or not
                dp[i][s] = 2 * dp[i - 1][s];
                dp[i][s] %= MOD;
                // ith item can also contribute to the sum s
                if (A[i - 1] <= s) {
                    dp[i][s] += dp[i - 1][s - A[i - 1]];
                    dp[i][s] %= MOD;
                }
            }
        }

        out.println(dp[N][S]);
    }

    private int count(int x) {
        int i = 1, sum = 0, res = 0;
        while (i + sum <= x) {
            sum += i;
            i++;
            res++;
        }
        return res;
    }

    private long pow(int x, int p) {
        long res = 1, a = x;
        while (p > 1) {
            if (p % 2 == 1)
                res = res * a % MOD;

            a = a * a % MOD;
            p /= 2;
        }
        res  = res * a % MOD;
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        // int T = in.nextInt();
        for (int t = 1; t <= 1; t++) {
            Main sol = new Main(in, out, t);
        }

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}