import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Reader in = new Reader();
    public static void main(String[] args) throws IOException {
        Main solver = new Main();
        solver.solve();
        out.flush();
        out.close();
 
    }
 
    static int INF = (int)1e9;
    static int maxn = (int)2e4+5;
    static int mod  = 1000*1000*1000+7;
    static int n,m,q,k,t;
    
    void solve() throws IOException{
        n = in.nextInt();
        
        long ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = in.nextInt();
            ans += tmp;
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }
        
        q = in.nextInt();
        int u, v, first, second;
        for (int i = 0; i < q; i++) {
            u = in.nextInt();
            v = in.nextInt();
            first = map.getOrDefault(u, 0);
            second = map.getOrDefault(v, 0);
            if (first == 0) {
                out.println(ans);
                continue;
            } else {
                map.put(v, second+first);
                map.put(u, 0);
                ans += (long)first*v-(long)first*u;
            }
            out.println(ans);
        }
    }
    
    //<>
    
    
    static class Reader {
 
    private InputStream mIs;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
 
    public Reader() {
        this(System.in);
    }
 
    public Reader(InputStream is) {
        mIs = is;
    }
 
    public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
 
    }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = mIs.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }
 
    public String nextLine() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndOfLine(c));
        return res.toString();
    }
 
    public String next() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
 
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    public boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }
 
    }
}