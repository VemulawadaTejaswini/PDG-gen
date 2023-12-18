
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, Integer> hCounts = new HashMap<>();
        final Map<Integer, Integer> wCounts = new HashMap<>();
        final Map<Integer, Set<Integer>> points = new HashMap<>();
        int maxH = 0;
        int maxW = 0;
        for (int i = 0; i < m; i++) {
            final int tmpH = scanner.nextInt();
            final int tmpW = scanner.nextInt();
            hCounts.compute(tmpH, (k, v) -> v == null ? 1 : v + 1);
            wCounts.compute(tmpW, (k, v) -> v == null ? 1 : v + 1);
            points.computeIfAbsent(tmpH, v -> new HashSet<>()).add(tmpW);
            maxH = Math.max(maxH, hCounts.get(tmpH));
            maxW = Math.max(maxW, wCounts.get(tmpW));
        }

        final int finalH = maxH;
        final int finalW = maxW;

        final Map<Integer, Integer> filteredH = hCounts.entrySet().stream()
            .filter(e -> e.getValue() == finalH)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        final Map<Integer, Integer> filteredW = wCounts.entrySet().stream()
            .filter(e -> e.getValue() == finalW)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if ((long) filteredH.size() * (long) filteredW.size() > m) {
            System.out.println(finalH + finalW);
            return;
        }

        for (final Map.Entry<Integer, Integer> entryH : filteredH.entrySet()) {
            for (final Map.Entry<Integer, Integer> entryW : filteredW.entrySet()) {
                if (points.containsKey(entryH.getKey()) && points.get(entryH.getKey()).contains(entryW.getKey())) {
                    continue;
                }

                System.out.println(finalH + finalW);
                return;
            }
        }

        System.out.println(finalH + finalW - 1);
    }

    private static class Pair {
        final int a;
        final int b;

        Pair(final int a, final int b) {
            this.a = a;
            this.b = b;
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
