import java.util.*;
import java.io.*;

public class Main {

    private static final int MOD = (int)1e9 + 7;

    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        int K = in.nextInt();

        boolean allNegative =  true;
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            if (A[i] >= 0) allNegative = false;
        }
        Arrays.sort(A, Comparator.<Integer>comparingInt(i -> Math.abs(i)).reversed());

        // no positive number or has only K number
        if (allNegative || K == N) {
            long res = 1;
            for (int i = N - 1; i >= N - K; i--) {
                res = (res * A[i] % MOD + MOD) % MOD;
            }
            out.println(res);
            return;
        }

        // 0 is Kth largest element, return 0 directly
        if (A[K - 1] == 0) {
            out.println("0");
            return;
        }

        // A[0:K] has no 0s
        boolean neg = false;
        int idx = 0, lastPos = -1, lastNeg = -1;
        while (idx < K) {
            if (A[idx] < 0) {
                neg = !neg;
                lastNeg = idx;
            } else {
                lastPos = idx;
            }
            idx++;
        }

        if (neg) {
            // find index of next non-negative and negative number
            // swap it with A[j] where j < K to get positive product
            int nxt = -1, nxtNeg = 1;
            for (int i = idx; i < N; i++) if (A[i] >= 0) {
                nxt = i;
                break;
            }
            for (int i = idx; i < N; i++) if (A[i] < 0) {
                nxtNeg = i;
                break;
            }
            // neg == true, lastNeg must exists
            if (lastPos >= 0 && nxt >= idx && nxtNeg >= idx) {
                if (1L * A[lastPos] * A[nxt] >= 1L * A[lastNeg] * A[nxtNeg])
                    A[lastNeg] = A[nxt];
                else
                    A[lastPos] = A[nxtNeg];
            } else if (nxt >= idx) {
                A[lastNeg] = A[nxt];
            } else if (lastPos >= 0 && nxtNeg >= idx) {
                // no non-negative after K, not all elements are negative
                // ==> lastPos must exists
                A[lastPos] = A[nxtNeg];
            }
            out.printf("nxt=%d, nxtNeg=%d%n",nxt, nxtNeg);
        }

        out.println(Arrays.toString(A));
        out.printf("neg=%b, lastPos=%d, lastNeg=%d%n",neg, lastPos, lastNeg);

        long res = 1;
        for (int i = 0; i < K; i++)
            res = (res * A[i] % MOD + MOD) % MOD;

        out.println(res);
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