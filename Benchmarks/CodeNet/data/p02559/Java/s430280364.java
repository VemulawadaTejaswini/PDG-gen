import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        var sc = new FastScanner();
        var pw = new FastPrintWriter();
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        final var A = new long[N];
        java.util.Arrays.setAll(A, i -> sc.nextInt());
        var t = new FenwickTree(A);
        for (int $ = 0; $ < Q; $++) {
            int query = sc.nextInt();
            if (query == 0) {
                int p = sc.nextInt();
                int x = sc.nextInt();
                t.add(p, x);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                pw.println(t.sum(l, r));
            }
        }
        pw.flush();
        pw.close();
    }

    static class FastPrintWriter {
        private static final long[] pow10l = new long[19];
        private static final int[] pow10i = new int[10];
        static {
            long ten = 1;
            for (int i = 0; i <= 9; i++) {
                pow10i[i] = (int) ten;
                pow10l[i] = ten;
                ten *= 10;
            }
            for (int i = 10; i <= 18; i++) {
                pow10l[i] = ten;
                ten *= 10;
            }
        }

        private static final int BUF_SIZE = 1024;
        private char[] charbuf = new char[BUF_SIZE];
        private int ptr = 0;

        private java.io.Writer w;

        public FastPrintWriter(java.io.Writer out) {
            this.w = out;
        }

        public FastPrintWriter(java.io.File file) throws java.io.IOException {
            this(new java.io.FileWriter(file));
        }

        public FastPrintWriter(String filename) throws java.io.FileNotFoundException, java.io.IOException {
            this(new java.io.File(filename));
        }

        public FastPrintWriter() {
            this(new java.io.PrintWriter(System.out));
        }

        public FastPrintWriter println() {
            if (ptr == BUF_SIZE) flush();
            charbuf[ptr++] = '\n';
            return this;
        }

        public FastPrintWriter println(String s) {
            return print(s).println();
        }

        public FastPrintWriter println(char[] s) {
            return print(s).println();
        }

        public FastPrintWriter println(char c) {
            return print(c).println();
        }

        public FastPrintWriter println(int x) {
            return print(x).println();
        }

        public FastPrintWriter println(long x) {
            return print(x).println();
        }

        public FastPrintWriter println(double d, int precision) {
            return print(d, precision).println();
        }

        public FastPrintWriter print(String s) {
            int n = s.length();
            if (ptr + n > BUF_SIZE) {
                flush();
                try {
                    w.write(s);
                } catch (java.io.IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    charbuf[ptr++] = s.charAt(i);
                }
            }
            return this;
        }

        public FastPrintWriter print(char[] s) {
            int n = s.length;
            if (ptr + n > BUF_SIZE) {
                flush();
                try {
                    w.write(s);
                } catch (java.io.IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.arraycopy(s, 0, charbuf, ptr, n);
                ptr += n;
            }
            return this;
        }

        public FastPrintWriter print(char c) {
            if (ptr == BUF_SIZE) flush();
            charbuf[ptr++] = c;
            return this;
        }

        public FastPrintWriter print(int x) {
            if (x == 0) {
                if (ptr == BUF_SIZE) flush();
                charbuf[ptr++] = '0';
                return this;
            }
            int d = stringSize(x);
            if (ptr + d > BUF_SIZE) flush();
            if (x < 0) {
                charbuf[ptr++] = '-';
                x = -x;
                d--;
            }
            for (int j = d - 1; j >= 0; j--) {
                int p = x / pow10i[j];
                charbuf[ptr++] = (char) ('0' + p);
                x -= p * pow10i[j];
            }
            return this;
        }

        public FastPrintWriter print(long x) {
            if (x == 0) {
                if (ptr == BUF_SIZE) flush();
                charbuf[ptr++] = '0';
                return this;
            }
            int d = stringSize(x);
            if (ptr + d > BUF_SIZE) flush();
            if (x < 0) {
                charbuf[ptr++] = '-';
                x = -x;
                d--;
            }
            for (int j = d - 1; j >= 0; j--) {
                long p = x / pow10l[j];
                charbuf[ptr++] = (char) ('0' + p);
                x -= p * pow10l[j];
            }
            return this;
        }

        public FastPrintWriter print(double d, int precision) {
            if (d < 0) {
                print('-');
                d = -d;
            }
            d += Math.pow(10, -d) / 2;
            print((long) d).print('.');
            d -= (long) d;
            for(int i = 0; i < precision; i++){
                d *= 10;
                print((int) d);
                d -= (int) d;
            }
            return this;
        }

        public void flush() {
            try {
                w.write(charbuf, 0, ptr);
                w.flush();
                ptr = 0;
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                w.close();
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static int stringSize(int x) {
            int d = 1;
            if (x >= 0) {d = 0; x = -x;}
            int p = -10;
            for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
            return 10 + d;
        }

        private static int stringSize(long x) {
            int d = 1;
            if (x >= 0) {d = 0; x = -x;}
            long p = -10;
            for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
            return 19 + d;
        }
    }

    static class FenwickTree {
        final int N;
        final long[] Dat;
    
        public FenwickTree(int n) {
            this.N = n;
            this.Dat = new long[N + 1];
        }
    
        public FenwickTree(long[] dat) {
            this(dat.length);
            System.arraycopy(dat, 0, Dat, 1, N);
            for (int i = 1; i <= N; i++) {
                int p = i + (i & -i);
                if (p <= N) Dat[p] += Dat[i];
            }
        }
    
        public void add(int p, long x) {
            p++;
            while (p <= N) {
                Dat[p] += x;
                p += p & -p;
            }
        }
    
        public long sum(int l, int r) {
            return sum(r) - sum(l);
        }
    
        private long sum(int r) {
            long s = 0;
            while (r > 0) {
                s += Dat[r];
                r -= r & -r;
            }
            return s;
        }
    }

    static class FastScanner {
        private final java.io.InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(java.io.InputStream in) {this.in = in;}
        public FastScanner() {this(System.in);}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (java.io.IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }
}
