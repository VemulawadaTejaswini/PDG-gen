import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while (true) {
            int N = readInt();
            if (N == 0) break;
            ArrayList<Score> scores = new ArrayList<Score>();
            for (int i = 0; i < N; i++) {
                String[] tokens = readLine().split(" ");
                int id = Integer.parseInt(tokens[0]);
                int[] p = new int[tokens.length - 1];
                for (int j = 1; j < tokens.length; j++) {
                    p[j - 1] = Integer.parseInt(tokens[j]);
                }
                scores.add(new Score(id, computeScore(p)));
            }
            Collections.sort(scores);
            for (Score s : scores) {
                sysout.println(s.id + " " + s.point);
            }
        }
    }

    int computeScore(int[] p) {
        int sum = 0;
        int ptr = 0;
        for (int i = 0; i < 9; ++i) {
            if (p[ptr] == 10) {
                sum += 10 + p[ptr + 1] + p[ptr + 2];
                ptr += 1;
            } else if (p[ptr] + p[ptr + 1] == 10) {
                sum += 10 + p[ptr + 2];
                ptr += 2;
            } else {
                sum += p[ptr] + p[ptr + 1];
                ptr += 2;
            }
        }
        if (p[ptr] == 10) {
            sum += 10 + p[ptr + 1] + p[ptr + 2];
        } else if (p[ptr] + p[ptr + 1] == 10) {
            sum += 10 + p[ptr + 2];
        } else {
            sum += p[ptr] + p[ptr + 1];
        }
        return sum;
    }

    class Score implements Comparable<Score> {
        public int id, point;

        public Score(int id, int point) {
            this.id = id;
            this.point = point;
        }

        @Override
        public int compareTo(Score o) {
            if (point != o.point) return o.point - point;
            return id - o.id;
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