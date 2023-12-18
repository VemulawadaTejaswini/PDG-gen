
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Point> list = IntStream.range(0, n)
            .mapToObj(i -> new Point(scanner.nextInt(), scanner.nextInt()))
            .collect(Collectors.toList());

        final Map<Long, List<Point>> xGroups = list.stream().collect(Collectors.groupingBy(p -> p.x));
        final List<Long> sortedX = xGroups.keySet().stream().sorted().collect(Collectors.toList());
        final long minX = sortedX.get(0);
        final List<Point> sortedMinX = xGroups.get(minX).stream().sorted(Comparator.comparingLong(p -> p.y)).collect(Collectors.toList());
        final Point minXMinY = sortedMinX.get(0);
        final Point minXMaxY = sortedMinX.get(sortedMinX.size() - 1);

        final long maxX = sortedX.get(sortedX.size() - 1);
        final List<Point> sortedMaxX = xGroups.get(maxX).stream().sorted(Comparator.comparingLong(p -> p.y)).collect(Collectors.toList());
        final Point maxXMinY = sortedMaxX.get(0);
        final Point maxXMaxY = sortedMaxX.get(sortedMaxX.size() - 1);

        final Map<Long, List<Point>> yGroups = list.stream().collect(Collectors.groupingBy(p -> p.y));
        final List<Long> sortedY = yGroups.keySet().stream().sorted().collect(Collectors.toList());
        final long minY = sortedY.get(0);
        final List<Point> sortedMinY = yGroups.get(minY).stream().sorted(Comparator.comparingLong(p -> p.x)).collect(Collectors.toList());
        final Point minYMinX = sortedMinY.get(0);
        final Point minYMaxX = sortedMinY.get(sortedMinY.size() - 1);

        final long maxY = sortedY.get(sortedY.size() - 1);
        final List<Point> sortedMaxY = yGroups.get(maxY).stream().sorted(Comparator.comparingLong(p -> p.x)).collect(Collectors.toList());
        final Point maxYMinX = sortedMaxY.get(0);
        final Point maxYMaxX = sortedMaxY.get(sortedMaxY.size() - 1);

        list.stream()
            .mapToLong(p -> max(distance(p, minXMinY), distance(p, minXMaxY), distance(p, maxXMinY), distance(p, maxXMaxY),
                distance(p, minYMinX), distance(p, minYMaxX), distance(p, maxYMinX), distance(p, maxYMaxX)))
            .max()
            .ifPresent(System.out::println);
    }

    private static long distance(final Point p1, final Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    private static long max(final long... l) {
        Arrays.sort(l);
        return l[l.length - 1];
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
