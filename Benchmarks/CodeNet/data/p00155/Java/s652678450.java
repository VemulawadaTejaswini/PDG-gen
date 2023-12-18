import java.io.*;
import java.util.*;

public class Main {

    void run() {
        while (true) {
            int n = readInt();
            if (n == 0) break;
            int[] num = new int[n];
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = readInt();
                x[i] = readInt();
                y[i] = readInt();
            }
            int m = readInt();
            int[] start = new int[m];
            int[] goal = new int[m];
            for (int i = 0; i < m; i++) {
                start[i] = readInt();
                goal[i] = readInt();
                for (int j = 0; j < n; j++) {
                    if (start[i] == num[j]) {
                        start[i] = j;
                        break;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (goal[i] == num[j]) {
                        goal[i] = j;
                        break;
                    }
                }
            }
//            sysout.println("start[] = " + Arrays.toString(start));
//            sysout.println("goal[] = " + Arrays.toString(goal));
            for (int i = 0; i < m; i++) {
                PriorityQueue<State> que = new PriorityQueue<State>();
                que.add(new State(start[i], 0));
                double[] d = new double[n];
                int[] prev = new int[n];
                Arrays.fill(d, Double.MAX_VALUE);
                Arrays.fill(prev, -1);
                d[start[i]] = 0;
                while (!que.isEmpty()) {
                    State state = que.poll();
//                    sysout.println(state);
                    if (state.cost > d[state.pos]) {
                        continue;
                    }
                    for (int j = 0; j < n; j++) {
                        int dx = x[state.pos] - x[j];
                        int dy = y[state.pos] - y[j];
                        double l = Math.sqrt(dx*dx+dy*dy);
                        if (l <= 50 + 1e-8) {
                            if (d[j] > state.cost + l) {
                                d[j] = state.cost + l;
                                prev[j] = state.pos;
//                                sysout.println("add " + j);
                                que.add(new State(j, state.cost + l));
                            }
                        }
                    }
                }
                ArrayList<Integer> route = new ArrayList<Integer>();
                for (int p = goal[i]; p != -1; p = prev[p]) {
                    route.add(num[p]);
                }
                Collections.reverse(route);
                if (d[goal[i]] == Double.MAX_VALUE) {
                    sysout.println("NA");
                } else {
                    sysout.println(join(route, " "));
                }
            }
        }
    }

    class State implements Comparable<State> {
        public int pos;
        public double cost;

        @Override
        public String toString() {
            return "State{" +
                    "pos=" + pos +
                    ", cost=" + cost +
                    '}';
        }

        public State(int pos, double cost) {
            this.pos = pos;
            this.cost = cost;
        }

        @Override
        public int compareTo(State o) {
            return Double.compare(cost, o.cost);
        }
    }

    <T> String join(Collection<T> c, String delim) {
        StringBuilder bld = new StringBuilder();
        boolean first = true;
        for (T item : c) {
            if (!first) bld.append(delim);
            first = false;
            bld.append(item);
        }
        return bld.toString();
    }

    int joinCompare(int... c) {
        for (int item : c) {
            if (item != 0) return item;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}