import java.util.*;
import java.io.*;
import java.math.*;

 class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader s = new Reader();
        int n = s.i();
        pair [] arr = new pair[n];
        for (int i=0;i<n;i++) {
            long x = s.l() , y = s.l();
            arr[i] = new pair(x,y);
        }
//        Arrays.sort(arr,new pair());
//        long ans = Math.abs(arr[n-1].first - arr[0].first) + Math.abs(arr[n-1].second - arr[0].second);
//        pairLong [] a = new pairLong[n];
//        for (int i=0;i<n;i++) {
//            a[i] = new pairLong(arr[i].first,arr[i].second);
//        }
//        Arrays.sort(a,new pairLong());
//        long val = Math.abs(a[n-1].first - a[0].first) + Math.abs(a[n-1].second - a[0].second);
//        ans = Math.max(ans,val);
//        out.println(ans);
        long first = arr[0].first , second = arr[0].second;
        long max = Long.MIN_VALUE;
        int in = -1;
        for (int i=1;i<n;i++) {
            long val = Math.abs(arr[i].first-first) + Math.abs(arr[i].second-second);
            if (val >= max) {
                max = val;
                in = i;
            }
        }
        if (in == -1) {
            out.println(0);
        } else {
            for (int i=0;i<n;i++) {
                long val = Math.abs(arr[i].first-arr[in].first) + Math.abs(arr[i].second-arr[in].second);
                if (val > max) {
                    max = val;
                }
            }
            out.println(max);
        }
        out.flush();
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
    static class pairLong implements Comparator<pairLong> {
        long first, second;

        pairLong() {
        }

        pairLong(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compare(pairLong p1, pairLong p2) {
            if (p1.first == p2.first) {
                if(p1.second > p2.second) return 1;
                else return -1;
            }
            if(p1.first > p2.first) return 1;
            else return -1;
        }
    }
    static class pair implements Comparator<pair> {
        long first, second;

        pair() {
        }

        pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compare(pair p1, pair p2) {
            if (p1.second == p2.second) {
                if(p1.first > p2.first) return 1;
                else return -1;
            }
            if(p1.second > p2.second) return 1;
            else return -1;
        }
    }
}
