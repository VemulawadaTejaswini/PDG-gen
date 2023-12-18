import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    static int d;
    static int[] c;
    static int[][] s;
    static int cs;
    void solve() {
        d = in.nextInt();
        c = in.nextIntArray(26);
        s = new int[d][];
        for (int i = 0; i < d; i++) {
            s[i] = in.nextIntArray(26);
        }
        for (int i = 0; i < 26; i++) {
            cs += c[i];
        }
        Marathon.State state = new Marathon().annealing(2000, 600, 1900);
        for (int day : state.days) {
            out.println(day + 1);
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Marathon {
    static Random rand = new Random();

    State annealing(double startTemperature, double endTemperature, long timeLimit) {
        timeLimit *= 1000000;
        long startTime = System.nanoTime();
        State state = State.initialState();
        State bestState = state;
        while (true) {
            long nowTime = System.nanoTime();
            if (nowTime - startTime >= timeLimit) {
                break;
            }
            State newState = state.neighbor();
            if (bestState.getScore() < newState.getScore()) {
                bestState = newState;
            }
            long diff = newState.getScore() - state.getScore();
            double temperature = startTemperature + (endTemperature - startTemperature) * (nowTime - startTime) / timeLimit;
            double p = diff > 0 ? 1 : Math.exp(diff / temperature);
            if (rand.nextDouble() < p) {
                state = newState;
            }
        }
        return bestState;
    }

    static class State implements Cloneable {
        int[] days;
        int cache = -1;

        public State(int[] days) {
            this.days = days;
        }

        static State initialState() {
            int[] days = new int[Main.d];
            int[] last = new int[26];
            for (int i = 0; i < Main.d; i++) {
                int mi = 0;
                int mv = -Main.iinf;
                for (int j = 0; j < 26; j++) {
                    int add = Main.s[i][j];
                    add += calcMinus(j, i, last) * 1.5;
                    if (mv < add) {
                        mv = add;
                        mi = j;
                    }
                }
                days[i] = mi;
                last[mi] = i + 1;
            }
            return new State(days);
        }

        static int calcMinus(int i, int day, int[] last) {
            return Main.c[i] * (day - last[i] + 1);
        }

        State neighbor() {
            return rand.nextDouble() < 0.5 ? change() : swap();
        }

        State change() {
            State nextState = clone();
            int d = rand.nextInt(Main.d);
            int q = rand.nextInt(26);
            int old = days[d];
            nextState.days[d] = q;
            return nextState;
        }

        State swap() {
            State nextState = clone();
            int d1 = rand.nextInt(Main.d - 1);
            int d2 = rand.nextInt(Math.min(d1 + 16, Main.d) - (d1 + 1)) + d1 + 1;
            int temp = nextState.days[d1];
            nextState.days[d1] = nextState.days[d2];
            nextState.days[d2] = temp;
            return nextState;
        }

        @Override
        protected State clone() {
            return new State(Arrays.copyOf(days, Main.d));
        }

        long getScore() {
            if (cache == -1) {
                int[] last = new int[26];
                int score = 0;
                int minus = 0;
                for (int i = 1; i <= Main.d; i++) {
                    int v = days[i - 1];
                    minus += Main.cs - Main.c[v] * (i - last[v]);
                    score += Main.s[i - 1][v] - minus;
                    last[v] = i;
                }
                cache =  Math.max(1000000 + score, 0);
            }
            return cache;
        }

        @Override
        public String toString() {
            return Arrays.toString(days);
        }
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
