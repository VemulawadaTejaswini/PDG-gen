import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.IntBinaryOperator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPondSkater solver = new FPondSkater();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPondSkater {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), k = in.nextInt();
            int x1 = in.nextInt(), y1 = in.nextInt();
            int x2 = in.nextInt(), y2 = in.nextInt();

            boolean[][] blocked = new boolean[h + 2][w + 2];
            for (int i = 1; i <= h; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 1; j <= w; j++) {
                    blocked[i][j] = row[j - 1] == '@';
                }
            }
            h += 2;
            w += 2;
            for (int i = 0; i < h; i++) {
                blocked[i][0] = blocked[i][w - 1] = true;
            }
            for (int j = 0; j < w; j++) {
                blocked[0][j] = blocked[h - 1][j] = true;
            }

            int[][] distance = new int[h][w];
            for (int[] row : distance)
                Arrays.fill(row, -1);
            distance[x1][y1] = 0;
            Queue<Pii> q = new ArrayDeque<>();
            q.add(Pii.of(x1, y1));

            boolean[][] horiz = new boolean[h][w];
            boolean[][] vert = new boolean[h][w];
            horiz[x1][y1] = vert[x1][y1] = true;

            TreeSet<Integer>[] rows = new TreeSet[h];
            TreeSet<Integer>[] cols = new TreeSet[w];
            for (int i = 0; i < h; i++) {
                rows[i] = new TreeSet<>();
                for (int j = 0; j <= w; j++) {
                    rows[i].add(j);
                }
            }
            for (int i = 0; i < w; i++) {
                cols[i] = new TreeSet<>();
                for (int j = 0; j <= h; j++) {
                    cols[i].add(j);
                }
            }

            while (!q.isEmpty()) {
                Pii cur = q.poll();

                int d = distance[cur.first][cur.second];

                IntBinaryOperator process = (x, y) -> {
                    distance[x][y] = d + 1;
                    rows[x].remove(y);
                    cols[y].remove(x);
                    q.add(Pii.of(x, y));
                    return 0;
                };

                for (int x = cur.first + 1, y = cur.second; Math.abs(cur.first - x) <= k; x = cols[y].higher(x)) {
                    if (blocked[x][y])
                        break;

                    if (distance[x][y] != -1)
                        continue;

                    process.applyAsInt(x, y);
                }
                for (int x = cur.first - 1, y = cur.second; Math.abs(cur.first - x) <= k; x = cols[y].lower(x)) {
                    if (blocked[x][y])
                        break;

                    if (distance[x][y] != -1)
                        continue;

                    process.applyAsInt(x, y);
                }
                for (int x = cur.first, y = cur.second + 1; Math.abs(cur.second - y) <= k; y = rows[x].higher(y)) {
                    if (blocked[x][y])
                        break;

                    if (distance[x][y] != -1)
                        continue;

                    process.applyAsInt(x, y);
                }
                for (int x = cur.first, y = cur.second - 1; Math.abs(cur.second - y) <= k; y = rows[x].lower(y)) {
                    if (blocked[x][y])
                        break;

                    if (distance[x][y] != -1)
                        continue;

                    process.applyAsInt(x, y);
                }
            }

            out.println(distance[x2][y2]);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class Pii {
        public final int first;
        public final int second;

        public Pii(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static Pii of(int first, int second) {
            return new Pii(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pii pair = (Pii) o;
            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{first, second});
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

    }
}

