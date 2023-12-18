import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.io.BufferedOutputStream;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.EnumMap;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.AbstractMap;
import java.io.Writer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        private static final Dice.Roll[] ROLLS = {Dice.Roll.FORWARD, Dice.Roll.BACKWARD, Dice.Roll.RIGHT, Dice.Roll.LEFT};
        private static final int[] DC = {0, 0, 1, -1};
        private static final int[] DR = {1, -1, 0, 0};

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            out.setBoolLabel(LightWriter.BoolLabel.YES_NO_ALL_UP);
            int h = in.ints() + 2, w = in.ints() + 2;
            char[][] s = new char[h][];
            s[0] = s[h - 1] = new char[w];
            Arrays.fill(s[0], '#');
            for (int i = 1; i < h - 1; i++) s[i] = ("#" + in.string() + "#").toCharArray();
            if (h == 3 && w == 3) {
                out.yesln();
                return;
            }

            EnumMap<Dice.Face, Character> map = new EnumMap<>(Dice.Face.class);
            map.put(Dice.Face.TOP, '1');
            map.put(Dice.Face.FRONT, '2');
            map.put(Dice.Face.RIGHT, '3');
            map.put(Dice.Face.LEFT, '4');
            map.put(Dice.Face.BACK, '5');
            map.put(Dice.Face.BOTTOM, '6');


            Set<B.State> visited = new HashSet<>();
            Queue<B.State> q = new ArrayDeque<>();
            q.offer(new B.State(1, 1, new Dice<>(map)));
            while (!q.isEmpty()) {
                B.State now = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nr = now.r + DR[i], nc = now.c + DC[i];
                    Dice<Character> roll = new Dice<>(now.roll);
                    roll.apply(ROLLS[i]);
                    if (s[nr][nc] != roll.get(Dice.Face.BOTTOM)) continue;
                    if (nr == h - 2 && nc == w - 2) {
                        out.yesln();
                        return;
                    }
                    B.State next = new B.State(nr, nc, roll);
                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            out.noln();
        }

        private static class State {
            int r;
            int c;
            Dice<Character> roll;

            State(int r, int c, Dice<Character> roll) {
                this.r = r;
                this.c = c;
                this.roll = roll;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                B.State state = (B.State) o;
                if (r != state.r) return false;
                if (c != state.c) return false;
                return Objects.equals(roll, state.roll);
            }

            public int hashCode() {
                int result = r;
                result = 31 * result + c;
                result = 31 * result + (roll != null ? roll.hashCode() : 0);
                return result;
            }

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

    static class Dice<T> {
        private final EnumMap<Dice.Face, T> map = new EnumMap<>(Dice.Face.class);

        public Dice(Dice<T> init) {
            map.putAll(init.map);
        }

        public Dice(Map<Dice.Face, T> init) {
            map.putAll(init);
        }

        public T get(Dice.Face face) {
            return map.get(face);
        }

        public void apply(Dice.Roll roll) {
            T tmp = map.get(roll.rot[0]);
            int n = roll.rot.length;
            for (int i = 1; i < n; i++) {
                map.put(roll.rot[i - 1], map.get(roll.rot[i]));
            }
            map.put(roll.rot[n - 1], tmp);
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
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public void setBoolLabel(LightWriter.BoolLabel label) {
            this.boolLabel = Objects.requireNonNull(label);
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
            Y_N_ALL_UP("Y", "N"),
            POSSIBLE_IMPOSSIBLE_FIRST_UP("Possible", "Impossible"),
            POSSIBLE_IMPOSSIBLE_ALL_UP("POSSIBLE", "IMPOSSIBLE"),
            POSSIBLE_IMPOSSIBLE_ALL_DOWN("possible", "impossible"),
            FIRST_SECOND_FIRST_UP("First", "Second"),
            FIRST_SECOND_ALL_UP("FIRST", "SECOND"),
            FIRST_SECOND_ALL_DOWN("first", "second"),
            ALICE_BOB_FIRST_UP("Alice", "Bob"),
            ALICE_BOB_ALL_UP("ALICE", "BOB"),
            ALICE_BOB_ALL_DOWN("alice", "bob"),
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


