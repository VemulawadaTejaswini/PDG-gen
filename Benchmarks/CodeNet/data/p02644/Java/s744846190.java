
import java.util.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader s = new Reader();
        int n = s.i() , m = s.i() , k = s.i();
        int x1 = s.i() , y1 = s.i() , x2 = s.i() , y2 = s.i();
        char [][] arr = new char[n][m];
        int [][] dp = new int [n][m];
        for (int i=0;i<n;i++) Arrays.fill(dp[i],(int)1e7);
        boolean [][] vis = new boolean[n][m];
        for (int i=0;i<n;i++) {
            String str = s.s();
            for (int j=0;j<m;j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == '@') dp[i][j] = (int) 1e7;
            }
        }
        int val = dfs(arr,dp,x1-1,y1-1,x2-1,y2-1,n,m,'p',k,vis);
        if (val == (int)1e7) out.println(-1);
        else out.println(val);
        out.flush();
    }
    private static int dfs (char [][] arr , int [][] dp , int x1 , int y1 , int sx , int sy , int n , int m , char c , int k , boolean [][] vis) {
        if (x1 >= n || y1 >= m || x1 < 0 || y1 < 0 || arr[x1][y1] == '@' || vis[x1][y1]) return (int)1e7;
        if (x1 == sx && y1 == sy) return 0;
        if (dp[x1][y1] != (int)1e7) return dp[x1][y1];
        vis[x1][y1] = true;
        if (c != 'L') {
            for (int i=1;i<=k;i++) {
                if(x1+i < n && arr[x1+i][y1] !='@') {
                    dp[x1][y1] = Math.min(dp[x1][y1],dfs(arr,dp,x1+i,y1,sx,sy,n,m,'R',k,vis)+1);
                } else break;
            }
        }
        if (c != 'R') {
            for (int i=1;i<=k;i++) {
                if(x1-i >= 0 && arr[x1-i][y1] !='@') {
                    dp[x1][y1] = Math.min(dp[x1][y1], dfs(arr, dp, x1 - i, y1, sx, sy, n, m, 'L', k, vis) + 1);
                } else break;
            }
        }
        if (c != 'U') {
            for (int i=1;i<=k;i++) {
                if(y1+i < m && arr[x1][y1+i] !='@') {
                    dp[x1][y1] = Math.min(dp[x1][y1], dfs(arr, dp, x1, y1 + i, sx, sy, n, m, 'D', k, vis) + 1);
                } else break;
            }
        }
        if (c != 'D') {
            for (int i=1;i<=k;i++) {
                if(y1-i >=0 && arr[x1][y1-i] !='@') {
                    dp[x1][y1] = Math.min(dp[x1][y1], dfs(arr, dp, x1, y1 - i, sx, sy, n, m, 'U', k, vis) + 1);
                } else break;
            }
        }
        vis[x1][y1] = false;
        return dp[x1][y1];
    }
    private static int power(int a, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a);
                n /= 2;
            } else {
                result = (result * a);
                n--;
            }
        }
        return result;
    }

    private static int power(int a, int n, int p) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a) % p;
                n /= 2;
            } else {
                result = (result * a) % p;
                n--;
            }
        }
        return result;
    }

    static class Reader {
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;

        public Reader() {
            this(System.in);
        }

        public Reader(InputStream is) {
            mIs = is;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String s() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long l() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int i() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int[] arr(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = i();
            }
            return ret;
        }

        public long[] arrLong(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = l();
            }
            return ret;
        }
    }
    //    static class pairLong implements Comparator<pairLong> {
//        long first, second;
//
//        pairLong() {
//        }
//
//        pairLong(long first, long second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pairLong p1, pairLong p2) {
//            if (p1.first == p2.first) {
//                if(p1.second > p2.second) return 1;
//                else return -1;
//            }
//            if(p1.first > p2.first) return 1;
//            else return -1;
//        }
//    }
//    static class pair implements Comparator<pair> {
//        int first, second;
//
//        pair() {
//        }
//
//        pair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pair p1, pair p2) {
//            if (p1.first == p2.first) return p1.second - p2.second;
//            return p1.first - p2.first;
//        }
//    }
}
