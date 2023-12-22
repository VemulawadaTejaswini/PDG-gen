import java.util.*;
import java.io.*;

public class Main {

    private static final int M = (int)1e9 + 7;
    private long[] fact, invfact;

    public Main(FastScanner in, PrintWriter out, int test) {
        int X = in.nextInt();
        int N = in.nextInt();
        boolean[] A = new boolean[201];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            A[a] = true;
        }
        int diff = 200, res = 0;
        for (int i = 0; i <= 200; i++) {
            if (!A[i] && Math.abs(i - X) < diff) {
                res = i;
                diff = Math.abs(i - X);
            }
        }
        out.println(res);
    }

    private void calcFact(int N) {
        fact = new long[N];
        invfact = new long[N];

        fact[0] = 1;
        for (int i = 1; i < N; i++)
            fact[i] = fact[i - 1] * i % M;

        invfact[0] = 1;
        for (int i = 1; i < N; i++) {
            long p = pow(i, M - 2);
            invfact[i] = invfact[i - 1] * p % M;
        }
    }

    private long pow(int x, int p) {
        long res = 1, a = x;
        while (p > 1) {
            if (p % 2 == 1)
                res = res * a % M;

            a = a * a % M;
            p /= 2;
        }
        res  = res * a % M;
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