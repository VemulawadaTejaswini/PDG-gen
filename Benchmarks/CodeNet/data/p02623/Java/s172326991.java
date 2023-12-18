import java.util.*;
import java.io.*;

public class Main {

    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = in.nextInt();

        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = in.nextInt();

        int res = 0, a = 0, b = 0;
        while (K > 0) {
            int t = 0;
            if (a < N && b < M) {
                t = A[a] <= B[b] ? A[a++] : B[b++];
            } else if (a < N) {
                t = A[a++];
            } else if (b < M) {
                t = B[b++];
            } else
                break;
            K -= t;
            if (K >= 0) res += 1;
        }
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
