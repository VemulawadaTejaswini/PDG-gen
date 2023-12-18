import java.util.*;
import java.io.*;

public class Main {


    public Main(FastScanner in, PrintWriter out, int test) {
        int H = in.nextInt();
        int W = in.nextInt();
        int K = in.nextInt();

        int black = 0;
        String[] A = new String[H];
        for (int i = 0; i < H; i++) {
            A[i] = in.next();
            for (int j = 0; j < W; j++) if (A[i].charAt(j) == '#') {
                black++;
            }
        }

        if (black < K) {
            out.println("0");
            return;
        }

        int res = 0;
        for (int r = 0; r < (1 << H); r++) {
            for (int c = 0; c < (1 << W); c++) {
                int cnt = count(A, r, c);
                if (black - cnt == K)
                    res++;
            }
        }
        out.println(res);
    }

    private int count(String[] A, int rid, int cid) {
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length(); j++) {
                if (A[i].charAt(j) == '#' && (((1 << i) & rid) != 0 || ((1 << j) & cid) != 0))
                    cnt++;
            }
        }
        return cnt;
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