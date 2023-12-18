import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            DGuessThePassword solver = new DGuessThePassword();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DGuessThePassword {
        char[] charset;
        int[] cnts;
        int L;
        StringBuilder query = new StringBuilder(128);
        FastInput in;
        FastOutput out;

        {
            StringBuilder charsetBuilder = new StringBuilder();
            for (char i = 'a'; i <= 'z'; i++) {
                charsetBuilder.append(i);
            }
            for (char i = 'A'; i <= 'Z'; i++) {
                charsetBuilder.append(i);
            }
            for (char i = '0'; i <= '9'; i++) {
                charsetBuilder.append(i);
            }
            charset = charsetBuilder.toString().toCharArray();
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            this.in = in;
            this.out = out;
            cnts = new int[charset.length];
            for (int i = 0; i < charset.length; i++) {
                query.setLength(0);
                for (int j = 0; j < 128; j++) {
                    query.append(charset[i]);
                }
                cnts[i] = 128 - ask(query);
                L += cnts[i];
            }

            String ans = dac(0, charset.length - 1);
            out.append("! ").println(ans).flush();
        }

        public String dac(int l, int r) {
            if (l == r) {
                query.setLength(0);
                for (int i = 0; i < cnts[l]; i++) {
                    query.append(charset[l]);
                }
                return query.toString();
            }

            int m = (l + r) / 2;
            String left = dac(l, m);
            String right = dac(m + 1, r);

            IntegerDeque ldq = new IntegerRange2DequeAdapter(i -> left.charAt(i), 0, left.length() - 1);
            IntegerDeque rdq = new IntegerRange2DequeAdapter(i -> right.charAt(i), 0, right.length() - 1);

            query.setLength(0);
            while (!ldq.isEmpty() && !rdq.isEmpty()) {
                int len = query.length();
                query.append((char) rdq.peekFirst());
                for (IntegerIterator iterator = ldq.iterator(); iterator.hasNext(); ) {
                    query.append((char) iterator.next());
                }
                if (ask(query) == L - query.length()) {
                    rdq.removeFirst();
                    query.setLength(len + 1);
                } else {
                    query.setLength(len);
                    query.append((char) ldq.removeFirst());
                }
            }

            while (!ldq.isEmpty()) {
                query.append((char) ldq.removeFirst());
            }
            while (!rdq.isEmpty()) {
                query.append((char) rdq.removeFirst());
            }
            return query.toString();
        }

        public int ask(Object s) {
            out.append("? ").println(s).flush();
            return in.readInt();
        }

    }

    static interface IntegerIterator {
        boolean hasNext();

        int next();

    }

    static class IntegerRange2DequeAdapter implements IntegerDeque {
        IntToIntegerFunction function;
        int l;
        int r;

        public IntegerRange2DequeAdapter(IntToIntegerFunction function, int l, int r) {
            this.function = function;
            this.l = l;
            this.r = r;
        }

        public boolean isEmpty() {
            return l > r;
        }

        public int peekFirst() {
            return function.apply(l);
        }

        public int removeFirst() {
            return function.apply(l++);
        }

        public IntegerIterator iterator() {
            return new IntegerIterator() {
                int iter = l;


                public boolean hasNext() {
                    return iter <= r;
                }


                public int next() {
                    return function.apply(iter++);
                }
            };
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(Object c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(String c) {
            return append(c).println();
        }

        public FastOutput println(Object c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static interface IntegerDeque extends IntegerStack {
        int removeFirst();

        int peekFirst();

        IntegerIterator iterator();

    }

    static interface IntToIntegerFunction {
        int apply(int x);

    }

    static interface IntegerStack {
        boolean isEmpty();

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
}

