import java.io.*;
import java.util.*;

public class Main {
    void run() {
        try {
            for (String line; (line = in.readLine()) != null; ) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                int[] init = new int[8];
                for (int i = 0; i < 8; i++) {
                    init[i] = Integer.parseInt(tokenizer.nextToken());
                }
//                sysout.println("init = " + Arrays.toString(init));
                HashMap<String, Integer> d = new HashMap<String, Integer>();
                d.put(Arrays.toString(init), 0);
                Queue<int[]> que = new ArrayDeque<int[]>();
                que.add(init);
                int[][] swap = {{1, 4}, {0, 2, 5}, {1, 3, 6}, {2, 7}, {0, 5}, {1, 4, 6}, {2, 5, 7}, {3, 6}};
                while (que.isEmpty() == false) {
                    int zeroPos = -1;
                    int[] cur = que.poll();

//                    sysout.println(Arrays.toString(cur) + " -> " + d.get(Arrays.toString(cur)));

                    for (int i = 0; i < 8; i++) {
                        if (cur[i] == 0) {
                            zeroPos = i;
                        }
                    }

                    for (int i = 0; i < swap[zeroPos].length; i++) {
                        int swapPos = swap[zeroPos][i];
                        int[] next = cur.clone();
                        int t = next[zeroPos];
                        next[zeroPos] = next[swapPos];
                        next[swapPos] = t;

                        String s = Arrays.toString(next);
                        if (d.containsKey(s) == false) {
                            d.put(s, d.get(Arrays.toString(cur)) + 1);
                            que.add(next);
                        }
                    }
                }

                sysout.println(d.get(Arrays.toString(new int[]{0, 1, 2, 3, 4, 5, 6, 7})));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
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