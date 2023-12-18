
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final String PAIRWISE_COPRIME = "pairwise coprime";
    private static final String SETWISE_COPRIME = "setwise coprime";
    private static final String NOT_COPRIME = "not coprime";

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        final int gcd = list.stream()
            .mapToInt(Integer::intValue)
            .reduce(Main::euclideanAlgorithm)
            .orElseThrow();

        if (gcd > 1) {
            System.out.println(NOT_COPRIME);
            return;
        }

        final int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        final List<Integer> primes = sieveOfEratosthenes((int) Math.sqrt(max));
        for (final int prime : primes) {
            final long count = list.stream()
                .filter(i -> i % prime == 0)
                .count();
            if (count > 1) {
                System.out.println(SETWISE_COPRIME);
                return;
            }
        }
        System.out.println(PAIRWISE_COPRIME);
    }

    private static int euclideanAlgorithm(final int a, final int b) {
        if (b > a) {
            return euclideanAlgorithm(b, a);
        }

        if (b == 0) {
            return a;
        }

        return euclideanAlgorithm(b, a % b);
    }

    private static List<Integer> sieveOfEratosthenes(final int number) {
        List<Integer> numbers = IntStream.rangeClosed(2, number)
            .boxed()
            .collect(Collectors.toList());

        final int sqrt = (int) Math.sqrt(number);
        final List<Integer> primeNumbers = new ArrayList<>();
        int condition;

        do {
            final int prime = numbers.get(0);
            primeNumbers.add(prime);
            numbers = numbers.stream()
                .filter(i -> i % prime != 0)
                .collect(Collectors.toList());
            condition = prime;
        } while (condition < sqrt);

        primeNumbers.addAll(numbers);
        return primeNumbers;
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
