
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            final int a = list.get(i);
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                final int b = list.get(j);
                if (a % b == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static Map<Integer, Long> merge(final Map<Integer, Long> a, final Map<Integer, Long> b) {
        for (final Map.Entry<Integer, Long> entry : b.entrySet()) {
            a.compute(entry.getKey(), (k, v) -> v == null ? entry.getValue() : a.get(entry.getKey()) + entry.getValue());
        }
        return a;
    }

    private static Map<Integer, Long> primeFactorization(int n) {
        final double sqrt = Math.sqrt(n);
        final Map<Integer, Long> countMap = new HashMap<>();
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                countMap.compute(i, (k, v) -> v = v == null ? 1 : v + 1);
                n /= i;
                i--;
            }
        }

        if (n != 1) {
            countMap.compute(n, (k, v) -> v = v == null ? 1 : v + 1);
        }

        return countMap;
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
