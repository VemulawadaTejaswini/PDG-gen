
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Main {
    private static final int[] xMove = {-1, 0, 1, 0};
    private static final int[] yMove = {0, -1, 0, 1};

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final boolean[][] isSitting = new boolean[n + 1][n + 1];
        for (final boolean[] array : isSitting) {
            Arrays.fill(array, true);
        }

        final UnaryOperator<Integer> bfs = point -> {
            final int[][] distances = new int[n + 1][n + 1];
            for (final int[] array : distances) {
                Arrays.fill(array, -1);
            }
            final int x = (point - 1) / n;
            final int y = (point - 1) % n + 1;

            isSitting[x][y] = false;
            distances[x][y] = 0;
            final Deque<Integer> queue = new ArrayDeque<>();
            queue.add(point);

            while (!queue.isEmpty()) {
                final int poll = queue.pollFirst();
                final int tmpX = (poll - 1) / n;
                final int tmpY = (poll - 1) % n + 1;
                final int distance = distances[tmpX][tmpY];
                if (tmpX == 0 || tmpX == n - 1 || tmpY == 1 || tmpY == n) {
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    final int nextX = tmpX + xMove[i];
                    final int nextY = tmpY + yMove[i];
                    if (distances[nextX][nextY] != -1) {
                        continue;
                    }
                    queue.add(nextX * n + nextY);
                    distances[nextX][nextY] = distance + (isSitting[nextX][nextY] ? 1 : 0);
                }
            }

            return IntStream.concat(
                IntStream.concat(
                    IntStream.range(0, n).map(i -> distances[i][1]),
                    IntStream.range(0, n).map(i -> distances[i][n])
                ),
                IntStream.concat(
                    IntStream.rangeClosed(1, n).map(i -> distances[0][i]),
                    IntStream.rangeClosed(1, n).map(i -> distances[n - 1][i])
                )
            )
                .filter(value -> value != -1)
                .min()
                .orElse(Integer.MAX_VALUE);
        };

        final long count = IntStream.range(0, n * n)
            .map(i -> bfs.apply(scanner.nextInt()))
            .sum();

        System.out.println(count);
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }
    }
}
