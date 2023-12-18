import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    static PrintWriter out;
    static Reader in;
    public static void main(String[] args) throws IOException {
        //out = new PrintWriter(new File("out.txt"));
        //PrintWriter out = new PrintWriter(System.out);
        //in = new Reader(new FileInputStream("in.txt"));
        //Reader in = new Reader();
        input_output();
        Main solver = new Main();
        solver.solve();
        out.flush();
        out.close();
 
    }
 
    static int INF = (int)2e9+5;
    static int maxn = (int)1e5+5;
    static int mod=(int)1e9+7 ;
    static int n, m, t, q, k;

    void solve() throws IOException{
        n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int[] suf = new int[n];
        suf[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) suf[i] = Math.max(suf[i+1], arr[i]);

        int ans = 1000, thing = 0, tmp = 0;
        int cur = 0, buy = 1;
        while (cur < n) {
            if (buy == 1) {
                if (cur == n-1) break;
                while (cur != n-1 && arr[cur] >= arr[cur+1]) {
                    cur++;
                }
                if (cur != n-1) {
                    tmp = ans/arr[cur];
                    ans -= tmp*arr[cur];
                    thing += tmp;
                } else break;
            } else {
                if (cur == n-1) {
                    ans += thing*arr[cur];
                    thing = 0;
                    break;
                } else {
                    while (cur != n-1 && arr[cur] <= arr[cur+1]) {
                        cur++;
                    }
                    ans += thing*arr[cur];
                    thing = 0;
                }
            }

            cur++;
            buy^=1;
        }

        out.println(ans);
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
    static void input_output() throws IOException {
        File f = new File("in.txt");
        if(f.exists() && !f.isDirectory()) { 
            in = new Reader(new FileInputStream("in.txt"));
        } else in = new Reader();
        f = new File("out.txt");
        if(f.exists() && !f.isDirectory()) {
            out = new PrintWriter(new File("out.txt"));
        } else out = new PrintWriter(System.out);
    }
}