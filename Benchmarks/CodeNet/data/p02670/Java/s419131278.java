
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
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
            final int[] distances = new int[n * n + 1];
            Arrays.fill(distances, Integer.MAX_VALUE);
            final int x = (point - 1) / n;
            final int y = (point - 1) % n + 1;

            isSitting[x][y] = false;
            distances[point] = 0;
            final PriorityQueue<Destination> queue = new PriorityQueue<>(Comparator.comparingInt(dest -> dest.cost));
            queue.add(new Destination(point, 0));

            while (!queue.isEmpty()) {
                final Destination current = queue.poll();
                final int currentX = (current.point - 1) / n;
                final int currentY = (current.point - 1) % n + 1;
                final int distance = distances[current.point];
                if (currentX == 0 || currentX == n - 1 || currentY == 1 || currentY == n) {
                    return distance;
                }

                if (current.cost > distance) {
                    continue;
                }

                distances[point] = current.cost;
                for (int i = 0; i < 4; i++) {
                    final int nextX = currentX + xMove[i];
                    final int nextY = currentY + yMove[i];
                    final int next = nextX * n + nextY;
                    final int nextCost = distances[point] + (isSitting[nextX][nextY] ? 1 : 0);
                    if (nextCost < distances[next]) {
                        queue.add(new Destination(next, nextCost));
                        distances[next] = nextCost;
                    }
                }
            }

            return -1;
        };

        final long count = IntStream.range(0, n * n)
            .map(i -> bfs.apply(scanner.nextInt()))
            .sum();

        System.out.println(count);
    }

    private static class Destination {
        final int point;
        final int cost;

        Destination(final int point, final int cost) {
            this.point = point;
            this.cost = cost;
        }
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
    }
}
