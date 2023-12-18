
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            final long n = scanner.nextLong();
            final long a = scanner.nextInt();
            final long b = scanner.nextInt();
            final long c = scanner.nextInt();
            final long d = scanner.nextInt();
            final BigInteger bigD = BigInteger.valueOf(d);

            final Map<Long, Long> memo = new HashMap<>();
            memo.put(n, 0L);
            final Deque<Long> queue = new ArrayDeque<>();
            queue.add(n);
            while (!queue.isEmpty()) {
                final long key = queue.poll();
                if (key == 1) {
                    continue;
                }
                final long value = memo.get(key);

                if (key % 2 == 0) {
                    final long min = BigInteger.valueOf(a).min(BigInteger.valueOf(key / 2).multiply(bigD)).longValue();
                    if (!memo.containsKey(key / 2) || memo.get(key / 2) > value + min) {
                        memo.put(key / 2, value + min);
                        queue.add(key / 2);
                    }
                } else {
                    final long inc = key + 1;
                    long min = BigInteger.valueOf(a).min(BigInteger.valueOf(inc / 2).multiply(bigD)).longValue();
                    if (!memo.containsKey(inc / 2) || memo.get(inc / 2) > value + d + min) {
                        memo.put(inc / 2, value + d + min);
                        queue.add(inc / 2);
                    }

                    final long dec = key - 1;
                    min = BigInteger.valueOf(a).min(BigInteger.valueOf(dec / 2).multiply(bigD)).longValue();
                    if (dec != 0 && (!memo.containsKey(dec / 2) || memo.get(dec / 2) > value + d + min)) {
                        memo.put(dec / 2, value + d + min);
                        queue.add(dec / 2);
                    }
                }

                if (key % 3 == 0) {
                    final long min = BigInteger.valueOf(b).min(BigInteger.valueOf(key / 3 * 2).multiply(bigD)).longValue();
                    if (!memo.containsKey(key / 3) || memo.get(key / 3) > value + min) {
                        memo.put(key / 3, value + min);
                        queue.add(key / 3);
                    }
                } else {
                    final long mod = key % 3;
                    final long dec = key - mod;
                    long min = BigInteger.valueOf(b).min(BigInteger.valueOf(dec / 3 * 2).multiply(bigD)).longValue();
                    if (dec != 0 && (!memo.containsKey(dec / 3) || memo.get(dec / 3) > value + mod * d + min)) {
                        memo.put(dec / 3, value + mod * d + min);
                        queue.add(dec / 3);
                    }

                    final long reverseMod = 3 - mod;
                    final long inc = key + reverseMod;
                    min = BigInteger.valueOf(b).min(BigInteger.valueOf(inc / 3 * 2).multiply(bigD)).longValue();
                    if (!memo.containsKey(inc / 3) || memo.get(inc / 3) > value + reverseMod * d + min) {
                        memo.put(inc / 3, value + reverseMod * d + min);
                        queue.add(inc / 3);
                    }
                }

                if (key % 5 == 0) {
                    final long min = BigInteger.valueOf(c).min(BigInteger.valueOf(key / 5 * 4).multiply(bigD)).longValue();
                    if (!memo.containsKey(key / 5) || memo.get(key / 5) > value + min) {
                        memo.put(key / 5, value + min);
                        queue.add(key / 5);
                    }
                } else {
                    final long mod = key % 5;
                    final long dec = key - mod;
                    final long min1 = BigInteger.valueOf(c).min(BigInteger.valueOf(dec / 5 * 4).multiply(bigD)).longValue();
                    if (dec != 0 && (!memo.containsKey(dec / 5) || memo.get(dec / 5) > value + mod * d + min1)) {
                        memo.put(dec / 5, value + mod * d + min1);
                        queue.add(dec / 5);
                    }

                    final long reverseMod = 5 - mod;
                    final long inc = key + reverseMod;
                    final long min2 = BigInteger.valueOf(c).min(BigInteger.valueOf(inc / 5 * 4).multiply(bigD)).longValue();
                    if (!memo.containsKey(inc / 5) || memo.get(inc / 5) > value + reverseMod * d + min2) {
                        memo.put(inc / 5, value + reverseMod * d + min2);
                        queue.add(inc / 5);
                    }
                }
            }

            System.out.println(memo.get(1L) + d);
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

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
    