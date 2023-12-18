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

    void solve() {
        int n;
        long[] value;
        int[] weight;
        Map<IntPair, Long> memo1 = new HashMap<>();
        n = in.nextInt();
        value = new long[n];
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
            weight[i] = in.nextInt();
        }
        int k = Math.min(9, Integer.bitCount(Integer.highestOneBit(n) - 1) / 2);
        int m = 100001;
        long[][] dp = new long[1 << k][m + 1];
        for (int i = weight[0]; i < m; i++) {
            dp[0][i] = value[0];
        }
        for (int i = 1; i < 1 << k; i++) {
            int parent = (i + 1) / 2 - 1;
            for (int j = m; j >= 0; j--) {
                dp[i][j] = dp[parent][j];
                if (weight[i] <= j) {
                    dp[i][j] = Math.max(dp[i][j], dp[parent][j - weight[i]] + value[i]);
                }
            }
        }
        for (int i = 0; i < 1 << k; i++) {
            for (int j = 0; j <= m; j++) {
                memo1.put(new IntPair(i, j), dp[i][j]);
            }
        }
        Deque<IntPair> deque = new ArrayDeque<>();
        List<IntPair> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<IntPair> list3 = new ArrayList<>();
        Set<IntPair> set = new HashSet<>();
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int node = in.nextInt();
            int l = in.nextInt();
            deque.addLast(new IntPair(node, l));
            list3.add(new IntPair(node, l));
        }
        while (!deque.isEmpty()) {
            IntPair state = deque.pollFirst();
            int node = state.first;
            int l = state.second;
            if (set.contains(state)) {
                continue;
            }
            set.add(state);
            if (memo1.containsKey(state)) {
                continue;
            }
            if (node == 1) {
                long res = weight[node - 1] <= l ? value[node - 1] : 0;
                memo1.put(new IntPair(node, l), res);
                continue;
            }
            if (weight[node - 1] <= l) {
                IntPair next = new IntPair(node / 2, l - weight[node - 1]);
                deque.addLast(next);
                list.add(state);
                list2.add(0);
            }
            IntPair next = new IntPair(node / 2, l);
            deque.addLast(next);
            list.add(state);
            list2.add(1);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            IntPair state = list.get(i);
            Integer type = list2.get(i);
            int node = state.first;
            int l = state.second;
            if (type == 0) {
                IntPair next = new IntPair(node / 2, l - weight[node - 1]);
                long r = memo1.get(next) + value[node - 1];
                if (memo1.getOrDefault(state, 0L) <= r) {
                    memo1.put(state, r);
                }
            } else {
                IntPair next = new IntPair(node / 2, l);
                long r = memo1.get(next);
                if (memo1.getOrDefault(state, 0L) <= r) {
                    memo1.put(state, r);
                }
            }
        }
        for (IntPair state : list3) {
            out.println(memo1.get(state));
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class IntPair {
    int first;
    int second;

    IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntPair)) {
            return false;
        }
        IntPair that = (IntPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        int result = first;
        result = 31 * result + second;
        return result;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", first, second);
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
