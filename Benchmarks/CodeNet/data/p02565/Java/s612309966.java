public class Main {
    public static void main(String[] args) {
        var sc = new FastScanner();
        var ps = new FastPrintStream();
        solve(sc, ps);
        sc.close();
        ps.flush();
        ps.close();
    }
    public static void solve(FastScanner sc, FastPrintStream ps) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        var x = new int[n];
        var y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        var twosat = new TwoSAT(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int d00 = Math.abs(x[i] - x[j]);
                int d01 = Math.abs(x[i] - y[j]);
                int d10 = Math.abs(y[i] - x[j]);
                int d11 = Math.abs(y[i] - y[j]);
                if (d00 < d) twosat.addImplication(i, false, j, true );
                if (d01 < d) twosat.addImplication(i, false, j, false);
                if (d10 < d) twosat.addImplication(i, true , j, true );
                if (d11 < d) twosat.addImplication(i, true , j, false);
            }
        }
        var bitset = twosat.solve();
        if (bitset == null) {
            ps.println("No");
            return;
        }
        ps.println("Yes");
        for (int i = 0; i < n; i++) {
            ps.println(bitset.get(i) ? y[i] : x[i]);
        }
    }

    static class TwoSAT {
        private final int n;
        private InternalSCC scc;
    
        public TwoSAT (int n) {
            this.n = n;
            this.scc = new InternalSCC(2 * n);
        }
    
        public void addCaluse(int x, boolean f, int y, boolean g) {
            scc.addEdge(x << 1 | (f ? 0 : 1), y << 1 | (g ? 1 : 0));
            scc.addEdge(y << 1 | (g ? 0 : 1), x << 1 | (f ? 1 : 0));
        }

        public void addImplication(int x, boolean f, int y, boolean g) {
            addCaluse(x, !f, y, g);
        }
    
        public java.util.BitSet solve() {
            int[] ids = scc.ids();
            java.util.BitSet answer = new java.util.BitSet(n);
            for (int i = 0; i < n; i++) {
                if (ids[i << 1 | 0] == ids[i << 1 | 1]) return null;
                answer.set(i, ids[i << 1 | 0] < ids[i << 1 | 1]);
            }
            return answer;
        }
    
        private static final class EdgeList {
            long[] a;
            int ptr = 0;
            EdgeList(int cap) {a = new long[cap];}
            void add(int upper, int lower) {
                if (ptr == a.length) grow();
                a[ptr++] = (long) upper << 32 | lower;
            }
            void grow() {
                long[] b = new long[a.length << 1];
                System.arraycopy(a, 0, b, 0, a.length);
                a = b;
            }
        }
    
        private static final class InternalSCC {
            final int n;
            int m;
            final EdgeList unorderedEdges;
            final int[] start;
            InternalSCC(int n) {
                this.n = n;
                this.unorderedEdges = new EdgeList(n);
                this.start = new int[n + 1];
            }
            void addEdge(int from, int to) {
                unorderedEdges.add(from, to);
                start[from + 1]++;
                this.m++;
            }
            private static final long mask = 0xffff_ffffl;
            int[] ids() {
                for (int i = 1; i <= n; i++) {
                    start[i] += start[i - 1];
                }
                int[] orderedEdges = new int[m];
                int[] count = new int[n + 1];
                System.arraycopy(start, 0, count, 0, n + 1);
                for (int i = 0; i < m; i++) {
                    long e = unorderedEdges.a[i];
                    orderedEdges[count[(int) (e >>> 32)]++] = (int) (e & mask);
                }
                int nowOrd = 0;
                int groupNum = 0;
                int k = 0;
                int[] par = new int[n];
                int[] visited = new int[n];
                int[] low = new int[n];
                int[] ord = new int[n];
                java.util.Arrays.fill(ord, -1);
                int[] ids = new int[n];
                long[] stack = new long[n];
                int ptr = 0;
                
                for (int i = 0; i < n; i++) {
                    if (ord[i] >= 0) continue;
                    par[i] = -1;
                    stack[ptr++] = i;
                    while (ptr > 0) {
                        long p = stack[--ptr];
                        int u = (int) (p & mask);
                        int j = (int) (p >>> 32);
                        if (j == 0) {
                            low[u] = ord[u] = nowOrd++;
                            visited[k++] = u;
                        }
                        if (start[u] + j < count[u]) {
                            int to = orderedEdges[start[u] + j];
                            stack[ptr++] += 1l << 32;
                            if (ord[to] == -1) {
                                stack[ptr++] = to;
                                par[to] = u;
                            } else {
                                low[u] = Math.min(low[u], ord[to]);
                            }
                        } else {
                            while (j --> 0) {
                                int to = orderedEdges[start[u] + j];
                                if (par[to] == u) low[u] = Math.min(low[u], low[to]);
                            }
                            if (low[u] == ord[u]) {
                                while (true) {
                                    int v = visited[--k];
                                    ord[v] = n;
                                    ids[v] = groupNum;
                                    if (v == u) break;
                                }
                                groupNum++;
                            }
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    ids[i] = groupNum - 1 - ids[i];
                }
                return ids;
            }
        }
    }

    static class FastScanner implements AutoCloseable {
        private static final int BUF_SIZE = 1 << 15;
        private final java.io.InputStream in;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr = 0;
        private int buflen = 0;
    
        public FastScanner(java.io.InputStream in) {
            this.in = in;
        }
    
        public FastScanner() {
            this(System.in);
        }
    
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {
                buflen = in.read(buf);
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
            return buflen > 0;
        }
    
        private int readByte() {
            return hasNextByte() ? buf[ptr++] : -1;
        }
    
        public boolean hasNext() {
            while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
            return hasNextByte();
        }
    
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
                sb.appendCodePoint(b);
            }
            return sb;
        }
    
        public String next() {
            return nextSequence().toString();
        }
    
        public String next(int len) {
            return new String(nextChars(len));
        }
    
        public char nextChar() {
            if (!hasNextByte()) throw new java.util.NoSuchElementException();
            return (char) readByte();
        }
    
        public char[] nextChars() {
            StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (32 < b && b < 127 && i < len) {
                s[i++] = (char) b; b = readByte();
            }
            if (i != len) {
                throw new java.util.NoSuchElementException(
                    String.format("Next token has smaller length than expected.", len)
                );
            }
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n = n * 10 + b - '0';
                } else if (b == -1 || !(32 < b && b < 127)) {
                    return minus ? -n : n;
                } else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            return Math.toIntExact(nextLong());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public void close() {
            try {
                in.close();
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class FastPrintStream implements AutoCloseable {
        private static final int BUF_SIZE = 1 << 15;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr = 0;
        private final java.lang.reflect.Field strField;
        private final java.nio.charset.CharsetEncoder encoder;
    
        private java.io.OutputStream out;
    
        public FastPrintStream(java.io.OutputStream out) {
            this.out = out;
            java.lang.reflect.Field f;
            try {
                f = java.lang.String.class.getDeclaredField("value");
                f.setAccessible(true);
            } catch (NoSuchFieldException | SecurityException e) {
                f = null;
            }
            this.strField = f;
            this.encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        }
    
        public FastPrintStream(java.io.File file) throws java.io.IOException {
            this(new java.io.FileOutputStream(file));
        }
    
        public FastPrintStream(java.lang.String filename) throws java.io.IOException {
            this(new java.io.File(filename));
        }
    
        public FastPrintStream() {
            this(System.out);
            try {
                java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
                f.setAccessible(true);
                f.set(System.out, false);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
                // ignore
            }
        }
    
        public FastPrintStream println() {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = (byte) '\n';
            return this;
        }
    
        public FastPrintStream println(java.lang.Object o) {
            return print(o).println();
        }
    
        public FastPrintStream println(java.lang.String s) {
            return print(s).println();
        }
    
        public FastPrintStream println(char[] s) {
            return print(s).println();
        }
    
        public FastPrintStream println(char c) {
            return print(c).println();
        }
    
        public FastPrintStream println(int x) {
            return print(x).println();
        }
    
        public FastPrintStream println(long x) {
            return print(x).println();
        }
    
        public FastPrintStream println(double d, int precision) {
            return print(d, precision).println();
        }
    
        private FastPrintStream print(byte[] bytes) {
            int n = bytes.length;
            if (ptr + n > BUF_SIZE) {
                internalFlush();
                try {
                    out.write(bytes);
                } catch (java.io.IOException e) {
                    throw new RuntimeException();
                }
            } else {
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
            }
            return this;
        }
    
        public FastPrintStream print(java.lang.Object o) {
            return print(o.toString());
        }
    
        public FastPrintStream print(java.lang.String s) {
            if (strField == null) {
                return print(s.getBytes());
            } else {
                try {
                    return print((byte[]) strField.get(s));
                } catch (IllegalAccessException e) {
                    return print(s.getBytes());
                }
            }
        }
    
        public FastPrintStream print(char[] s) {
            try {
                return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
            } catch (java.nio.charset.CharacterCodingException e) {
                byte[] bytes = new byte[s.length];
                for (int i = 0; 9 < s.length; i++) {
                    bytes[i] = (byte) s[i];
                }
                return print(bytes);
            }
        }
    
        public FastPrintStream print(char c) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = (byte) c;
            return this;
        }
    
        public FastPrintStream print(int x) {
            if (x == 0) {
                if (ptr == BUF_SIZE) internalFlush();
                buf[ptr++] = '0';
                return this;
            }
            int d = len(x);
            if (ptr + d > BUF_SIZE) internalFlush();
            if (x < 0) {
                buf[ptr++] = '-';
                x = -x;
                d--;
            }
            int j = ptr += d; 
            while (x > 0) {
                buf[--j] = (byte) ('0' + (x % 10));
                x /= 10;
            }
            return this;
        }
    
        public FastPrintStream print(long x) {
            if (x == 0) {
                if (ptr == BUF_SIZE) internalFlush();
                buf[ptr++] = '0';
                return this;
            }
            int d = len(x);
            if (ptr + d > BUF_SIZE) internalFlush();
            if (x < 0) {
                buf[ptr++] = '-';
                x = -x;
                d--;
            }
            int j = ptr += d; 
            while (x > 0) {
                buf[--j] = (byte) ('0' + (x % 10));
                x /= 10;
            }
            return this;
        }
    
        public FastPrintStream print(double d, int precision) {
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
    
        private void internalFlush() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }
    
        public void flush() {
            try {
                out.write(buf, 0, ptr);
                out.flush();
                ptr = 0;
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }
    
        public void close() {
            try {
                out.close();
            } catch (java.io.IOException e) {
                throw new RuntimeException(e);
            }
        }
    
        private static int len(int x) {
            int d = 1;
            if (x >= 0) {d = 0; x = -x;}
            int p = -10;
            for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
            return 10 + d;
        }
    
        private static int len(long x) {
            int d = 1;
            if (x >= 0) {d = 0; x = -x;}
            long p = -10;
            for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
            return 19 + d;
        }
    }

    static int[] nextInts(int n, FastScanner sc) {
        var dat = new int[n];
        java.util.Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n, FastScanner sc) {
        var dat = new long[n];
        java.util.Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
