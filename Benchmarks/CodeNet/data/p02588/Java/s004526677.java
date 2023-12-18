
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    @SuppressWarnings("ComparatorMethodParameterNotUsed")
    private static final Comparator<Integer> lowerBoundComparator = (x, y) -> x >= y ? 1 : -1;

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Long> base = IntStream.range(0, n)
            .mapToObj(i -> (long) (scanner.nextDouble() * 1_000_000_000L))
            .collect(Collectors.toList());

        final List<Integer> div2List = base.stream()
            .map(l -> divCount(l, 2, 0))
            .collect(Collectors.toList());

        final List<Integer> div5list = base.stream()
            .map(l -> divCount(l, 5, 0))
            .collect(Collectors.toList());

        @SuppressWarnings("unchecked") final List<Integer>[] array = new List[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            final int div2 = div2List.get(i);
            final int div5 = div5list.get(i);
            array[div5].add(div2);
        }

        array[14].sort(Comparator.naturalOrder());
        for (int i = 13; i >= 0; i--) {
            final List<Integer> tmp = array[i];
            tmp.addAll(array[i + 1]);
            tmp.sort(Comparator.naturalOrder());
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            final int div2 = div2List.get(i);
            final int div5 = div5list.get(i);
            if (div5 < 3) {
                continue;
            }

            final List<Integer> list = array[18 - div5];
            int index = Collections.binarySearch(list, 18 - div2, lowerBoundComparator);
            if (index < 0) {
                index = ~index;
            }
            sum += list.size() - index;
            if (div2 >= 9 && div5 >= 9) {
                sum--;
            }
        }

        System.out.println(sum / 2);
    }

    private static int divCount(final long value, final int div, final int count) {
        if (value % div > 0) {
            return count;
        } else {
            return divCount(value / div, div, count + 1);
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

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
