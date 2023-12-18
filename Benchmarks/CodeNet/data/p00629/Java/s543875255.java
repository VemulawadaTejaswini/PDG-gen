import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while (true) {
            int N = readInt();
            if (N == 0) break;
            ArrayList<Rank> ranks = new ArrayList<Rank>();
            for (int i = 0; i < N; i++) {
                int id = readInt();
                int univ = readInt();
                int solve = readInt();
                int penalty = readInt();
                ranks.add(new Rank(id, univ, solve, penalty));
            }
            Collections.sort(ranks);
            HashMap<Integer, Integer> univCount = new HashMap<Integer, Integer>();
            int assign = 0;
            for (int i = 0; i < N; i++) {
                Rank r = ranks.get(i);
                Integer uao = univCount.get(r.univ);
                int ua = uao != null ? uao : 0;
                if ((assign < 10 && ua < 3) ||
                        (assign < 20 && ua < 2) ||
                        (assign < 26 && ua < 1)) {
                    sysout.println(r.id);
                    assign++;
                    univCount.put(r.univ, ua + 1);
                }
            }
        }
    }

    class Rank implements Comparable<Rank> {
        int id;
        int univ;
        int solve;
        int penalty;

        public Rank(int id, int univ, int solve, int penalty) {
            this.id = id;
            this.univ = univ;
            this.solve = solve;
            this.penalty = penalty;
        }

        @Override
        public int compareTo(Rank o) {
            if (solve != o.solve) return o.solve - solve;
            if (penalty != o.penalty) return penalty - o.penalty;
            return id - o.id;
        }
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