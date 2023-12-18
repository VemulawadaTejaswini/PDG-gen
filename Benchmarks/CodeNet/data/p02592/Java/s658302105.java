import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        EProductSimulation solver = new EProductSimulation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EProductSimulation {
        private static long[] simulator = new long[200_000];

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            // out.setCaseLabel(LightWriter.CaseLabel.NONE);

        /*for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                Arrays.fill(simulator, 0);
                simulator[0] = x;
                simulator[1] = y;
                solve(out);
                if (simulator[2] != x * y) throw new RuntimeException();
            }
        }*/
            solve(out);


            //System.out.println(simulator[2]);
        }

        private static void solve(LightWriter out) {
            add(out, 0, 0, 100); // [100]=A+A
            add(out, 1, 1, 101); // [101]=B+B
            add(out, 100, 101, 102); // [102]=A+A+B+B
            cmp(out, 110, 102, 111); // [111] = 1 (A>0 or B>0)
            add(out, 111, 111, 112); //[112] = 2 (A>0 or B>0)

            //System.out.println("110: " + simulator[110]);
            //System.out.println("111: " + simulator[111]);
            //System.out.println("112: " + simulator[112]);

            for (int i = 0; i < 10; i++) {
                add(out, 110, 110, 11); // [11] = 0
                for (int j = 0; j < 10; j++) {
                    //System.out.println("itr@ " + simulator[10] + "/" + simulator[11]);

                    cmp(out, 10, 0, 20); // [20]c1 = [10]a < [0]A
                    cmp(out, 11, 1, 21); // [21]c2 = [11]b < [1]B

                    add(out, 110, 20, 200); // [200] = [20]
                    add(out, 200, 21, 200); // [200] += [21]
                    cmp(out, 111, 200, 201); // [201] = 1 < [200]
                    add(out, 2, 201, 2);

                    add(out, 11, 111, 11); // [11] += 1
                }
                add(out, 10, 111, 10); // [10] += 1
            }
        }

        private static void add(LightWriter out, int i, int j, int k) {
            out.ans('+').ans(i).ans(j).ans(k).ln();
            simulator[k] = simulator[i] + simulator[j];
        }

        private static void cmp(LightWriter out, int i, int j, int k) {
            out.ans('<').ans(i).ans(j).ans(k).ln();
            simulator[k] = simulator[i] < simulator[j] ? 1 : 0;
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(char c) {
            if (!breaked) {
                print(' ');
            }
            return print(c);
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
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

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

