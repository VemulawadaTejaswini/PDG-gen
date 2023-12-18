import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.EnumMap;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.util.AbstractMap;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
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
        ITP_1_11 solver = new ITP_1_11();
        solver.solve(1, in, out);
        out.close();
    }

    static class ITP_1_11 {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            List<Dice<Integer>> dices = new ArrayList<>();
            int n = in.ints();
            for (int i = 0; i < n; i++) {
                dices.add(parse(in));
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dices.get(i).equalsIgnoreRotation(dices.get(j))) {
                        out.noln();
                        return;
                    }
                }
            }
            out.yesln();
        }

        private static Dice<Integer> parse(LightScanner in) {
            Map<Dice.Face, Integer> init = new EnumMap<>(Dice.Face.class);
            init.put(Dice.Face.TOP, in.ints());
            init.put(Dice.Face.FRONT, in.ints());
            init.put(Dice.Face.RIGHT, in.ints());
            init.put(Dice.Face.LEFT, in.ints());
            init.put(Dice.Face.BACK, in.ints());
            init.put(Dice.Face.BOTTOM, in.ints());
            Dice<Integer> dice = new Dice<>(init);
            return dice;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static class Dice<T> implements Cloneable {
        private final EnumMap<Dice.Face, T> map = new EnumMap<>(Dice.Face.class);

        public Dice(Map<Dice.Face, T> init) {
            map.putAll(init);
        }

        public void apply(Dice.Roll roll) {
            T tmp = map.get(roll.rot[0]);
            int n = roll.rot.length;
            for (int i = 1; i < n; i++) {
                map.put(roll.rot[i - 1], map.get(roll.rot[i]));
            }
            map.put(roll.rot[n - 1], tmp);
        }

        public boolean equalsIgnoreRotation(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dice<?> dice = (Dice<?>) o;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (map.equals(dice.map)) {
                        return true;
                    }
                    apply(Dice.Roll.FORWARD);
                }
                if (i % 2 == 0) {
                    apply(Dice.Roll.LEFT);
                } else {
                    apply(Dice.Roll.HORIZONTAL_LEFT);
                }
            }
            return false;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dice<?> dice = (Dice<?>) o;
            return Objects.equals(map, dice.map);
        }

        public int hashCode() {
            return Objects.hash(map);
        }

        public String toString() {
            return map.toString();
        }

        public enum Face {
            TOP,
            BOTTOM,
            LEFT,
            RIGHT,
            FRONT,
            BACK,
            ;
        }

        public enum Roll {
            FORWARD(Dice.Face.TOP, Dice.Face.BACK, Dice.Face.BOTTOM, Dice.Face.FRONT),
            BACKWARD(Dice.Face.FRONT, Dice.Face.BOTTOM, Dice.Face.BACK, Dice.Face.TOP),
            LEFT(Dice.Face.TOP, Dice.Face.RIGHT, Dice.Face.BOTTOM, Dice.Face.LEFT),
            RIGHT(Dice.Face.LEFT, Dice.Face.BOTTOM, Dice.Face.RIGHT, Dice.Face.TOP),
            HORIZONTAL_LEFT(Dice.Face.FRONT, Dice.Face.RIGHT, Dice.Face.BACK, Dice.Face.LEFT),
            HORIZONTAL_RIGHT(Dice.Face.LEFT, Dice.Face.BACK, Dice.Face.RIGHT, Dice.Face.FRONT),
            ;
            private final Dice.Face[] rot;

            Roll(Dice.Face... rot) {
                this.rot = rot;
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;
        private LightWriter.BoolLabel boolLabel = LightWriter.BoolLabel.YES_NO_FIRST_UP;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(boolean b) {
            return ans(boolLabel.transfer(b));
        }

        public LightWriter yesln() {
            return ans(true).ln();
        }

        public LightWriter noln() {
            return ans(false).ln();
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

        public enum BoolLabel {
            YES_NO_FIRST_UP("Yes", "No"),
            YES_NO_ALL_UP("YES", "NO"),
            YES_NO_ALL_DOWN("yes", "no"),
            POSSIBLE_IMPOSSIBLE_FIRST_UP("Possible", "Impossible"),
            POSSIBLE_IMPOSSIBLE_ALL_UP("POSSIBLE", "IMPOSSIBLE"),
            POSSIBLE_IMPOSSIBLE_ALL_DOWN("possible", "impossible"),
            FIRST_SECOND_FIRST_UP("First", "Second"),
            ;
            private final String positive;
            private final String negative;

            BoolLabel(String positive, String negative) {
                this.positive = positive;
                this.negative = negative;
            }

            private String transfer(boolean f) {
                return f ? positive : negative;
            }

        }

    }
}


