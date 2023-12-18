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
    static int maxn = 200005;
    static int mod=(int)1e9+7 ;
    static int n, m, t, q, k;
    // read the editorial of the last problem (K).

    void solve() throws IOException{
        n = in.nextInt();
        String s = in.next();

        int[] dp = new int[maxn];
        dp[0] = 0;
        dp[1] = 1;
        int cnt = 0;
        for (int i = 2; i < maxn; i++) {
            cnt = 0;
            for (int j = 0; j <= 20; j++) {
                if ((i&(1<<j)) != 0) cnt++;
            }

            dp[i] = dp[i%cnt]+1;
        }

        cnt = 0;
        for (int i = 0; i < n; i++) cnt += s.charAt(i)-'0';

        if (cnt == 1) {
            // deal with this alone!!!!
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) =='0') {
                    if (i == n-1 || s.charAt(n-1) == '1') out.println(2);
                    else out.println(1);
                } else out.println(0);
            }
            return;
        }

        int[][] pre = new int[maxn][2];
        int curmod0 = 1, curmod1 = 1;
        for (int i = 0; i < n; i++) {
            curmod0 %= (cnt-1);
            curmod1 %= (cnt+1);
            pre[i][0] = curmod0;
            pre[i][1] = curmod1;
            curmod0 = (curmod0*2)%(cnt-1);
            curmod1 = (curmod1*2)%(cnt+1);
        }

        int ans0 = 0, ans1 = 0;
        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans0 = (ans0+pre[n-1-i][0])%(cnt-1);
                ans1 = (ans1+pre[n-1-i][1])%(cnt+1);
            }
        }

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                tmp = (ans1+pre[n-1-i][1])%(cnt+1);
                out.println(1+dp[tmp]);
            } else {
                tmp = (ans0-pre[n-1-i][0]+cnt-1)%(cnt-1);
                out.println(1+dp[tmp]);
            }
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