
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Point> list = IntStream.range(0, n)
            .mapToObj(i -> new Point(scanner.nextInt(), scanner.nextInt()))
            .collect(Collectors.toList());

        final BiFunction<Function<Point, Long>, ToLongFunction<Point>, Long> calc = (f1, f2) -> {
            final Map<Long, List<Point>> groups = list.stream().collect(Collectors.groupingBy(f1));
            final List<Long> sortedKeys = groups.keySet().stream().sorted().collect(Collectors.toList());
            final long min = sortedKeys.get(0);
            final long max = sortedKeys.get(sortedKeys.size() - 1);

            final List<Point> minList = groups.get(min)
                .stream().sorted(Comparator.comparingLong(f2))
                .collect(Collectors.toList());
            final long minMin = f2.applyAsLong(minList.get(0));
            final long minMax = f2.applyAsLong(minList.get(minList.size() - 1));

            final List<Point> maxList = groups.get(max)
                .stream().sorted(Comparator.comparingLong(f2))
                .collect(Collectors.toList());
            final long maxMin = f2.applyAsLong(maxList.get(0));
            final long maxMax = f2.applyAsLong(maxList.get(maxList.size() - 1));

            return Math.max(max - min + maxMax - minMin, max - min + minMax - maxMin);
        };

        final long answer = Math.max(calc.apply(p -> p.x, p -> p.y), calc.apply(p -> p.y, p -> p.x));
        System.out.println(answer);
    }

    private static class Point {
        final long x;
        final long y;

        Point(final int x, final int y) {
            this.x = x;
            this.y = y;
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
