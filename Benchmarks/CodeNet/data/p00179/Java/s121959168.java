import java.io.*;
import java.util.*;

public class Main {
    private void run() {
        while (true) {
            String S = read();
            if (S.equals("0")) break;
            if (sameAll(S)) {
                sysout.println(0);
                continue;
            }
            Queue<State> que = new ArrayDeque<State>();
            HashSet<String> hist = new HashSet<String>();
            que.add(new State(S, 0));
            hist.add(S);
            int ans = -1;
            while (!que.isEmpty()) {
                State state = que.poll();
//                sysout.println(state.cost + " " + state.str);
                char[] t = state.str.toCharArray();
                for (int i = 0; i < t.length - 1; i++) {
                    if (t[i] == t[i + 1]) continue;
                    char[] tmp = {t[i], t[i + 1]};

                    char n = next(tmp);
                    t[i] = n; t[i+1] = n;

                    String ts = new String(t);
                    if (!hist.contains(ts)) {
                        que.add(new State(ts, state.cost + 1));
                        hist.add(ts);
                        if (sameAll(ts) && ans == -1) ans = state.cost + 1;
                    }

                    t[i] = tmp[0];
                    t[i + 1] = tmp[1];
                }
            }
            if (ans == -1) sysout.println("NA");
            else sysout.println(ans);
        }
    }

    boolean sameAll(String str) {
        char c = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) return false;
        }
        return true;
    }

    char next(char[] now) {
        if (now[0] == 'r' && now[1] == 'g') return 'b';
        if (now[0] == 'r' && now[1] == 'b') return 'g';
        if (now[0] == 'g' && now[1] == 'r') return 'b';
        if (now[0] == 'g' && now[1] == 'b') return 'r';
        if (now[0] == 'b' && now[1] == 'r') return 'g';
        if (now[0] == 'b' && now[1] == 'g') return 'r';
        return '_';
    }

    class State implements Comparable<State> {
        public String str;
        public int cost;

        public State(String str, int cost) {
            this.str = str;
            this.cost = cost;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(cost, o.cost);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String readLine() {
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
            buffer = new StringTokenizer(readLine());
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }
}