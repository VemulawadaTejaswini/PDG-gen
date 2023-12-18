import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.util.Set;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper reloaded plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter2 out = new LightWriter2(outputStream);
        ECoprime solver = new ECoprime();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoprime {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints();
            int[] a = in.ints(n);
            long g = IntMath.gcd(a);
            if (g != 1) {
                out.ans("not coprime").ln();
                return;
            }
            PrimeTable table = new PrimeTable(1_000_001);
            int[] counts = new int[1_000_001];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int e : table.primeFactorize(a[i]).keySet()) counts[e]++;
            }
            for (int i = 0; i <= 1_000_000; i++) {
                if (counts[i] >= 2) {
                    out.ans("setwise coprime").ln();
                    return;
                }
            }
            out.ans("pairwise coprime").ln();
        }

    }

    static class PrimeTable {
        private final int[] divisor;
        private final List<Integer> primes = new ArrayList<>();

        public PrimeTable(int n) {
            this.divisor = new int[n];
            for (int i = 2; i < n; i++) {
                if (divisor[i] != 0) continue;
                divisor[i] = i;
                primes.add(i);
                for (int j = i + i; j < n; j += i) {
                    if (divisor[j] == 0) divisor[j] = i;
                }
            }
        }

        public Map<Integer, Integer> primeFactorize(int x) {
            Map<Integer, Integer> res = new HashMap<>();
            while (divisor[x] != 0) {
                res.merge(divisor[x], 1, Integer::sum);
                x /= divisor[x];
            }
            return res;
        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 32 * 1024;
        private final InputStream stream;
        private final StringBuilder builder = new StringBuilder();
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            int b;
            while (isTokenSeparator(b = read()) && b != -1) ;
            if (b == -1) throw new NoSuchElementException("EOF");
            ptr--;
        }

        private void loadToken() {
            builder.setLength(0);
            skip();
            for (int b = read(); !isTokenSeparator(b); b = read()) {
                builder.appendCodePoint(b);
            }
        }

        public String string() {
            loadToken();
            return builder.toString();
        }

        public int ints() {
            return (int) longs();
        }

        public long longs() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            long x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static int gcd(int a, int b) {
            int t;
            if (a == 0) return b;
            if (b == 0) return a;
            while (a % b > 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return b;
        }

        public static int gcd(int... a) {
            int t = a[0];
            for (int i = 1; i < a.length; i++) {
                t = gcd(t, a[i]);
            }
            return t;
        }

    }

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 32 * 1024;
        private static final int BUF_THRESHOLD = 1024;
        private final OutputStream out;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private final Field fastStringAccess;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter2(OutputStream out) {
            this.out = out;
            Field f;
            try {
                f = String.class.getDeclaredField("value");
                f.setAccessible(true);
            } catch (ReflectiveOperationException ignored) {
                f = null;
            }
            this.fastStringAccess = f;
        }

        public LightWriter2(Writer out) {
            this.out = new LightWriter2.WriterOutputStream(out);
            this.fastStringAccess = null;
        }

        private void allocate(int n) {
            if (ptr + n <= BUF_SIZE) return;
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (BUF_SIZE < n) throw new IllegalArgumentException("Internal buffer exceeded");
        }

        public void close() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.flush();
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

        public LightWriter2 print(char c) {
            allocate(1);
            buf[ptr++] = (byte) c;
            breaked = false;
            return this;
        }

        public LightWriter2 print(String s) {
            byte[] bytes;
            if (this.fastStringAccess == null) bytes = s.getBytes();
            else {
                try {
                    bytes = (byte[]) fastStringAccess.get(s);
                } catch (IllegalAccessException ignored) {
                    bytes = s.getBytes();
                }
            }
            int n = bytes.length;
            if (n <= BUF_THRESHOLD) {
                allocate(n);
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
                return this;
            }
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.write(bytes);
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter2 ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter2 ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        private static class WriterOutputStream extends OutputStream {
            final Writer writer;
            final CharsetDecoder decoder;

            WriterOutputStream(Writer writer) {
                this.writer = writer;
                this.decoder = StandardCharsets.UTF_8.newDecoder();
            }

            public void write(int b) throws IOException {
                writer.write(b);
            }

            public void write(byte[] b) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b)).array());
            }

            public void write(byte[] b, int off, int len) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b, off, len)).array());
            }

            public void flush() throws IOException {
                writer.flush();
            }

            public void close() throws IOException {
                writer.close();
            }

        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract String string();

        public int ints() {
            return Integer.parseInt(string());
        }

        public final int[] ints(int length) {
            int[] res = new int[length];
            Arrays.setAll(res, ignored -> ints());
            return res;
        }

        public abstract void close();

    }
}

