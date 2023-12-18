import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in))
                .lines()  // Stream<String> : each n
                .mapToInt(Integer::parseInt)  // IntStream : each n
                .mapToObj(n -> Stream.of(IntStream.iterate(n - 1, i -> i - 1), IntStream.iterate(n + 1, i -> i + 1))) // Stream<Stream<IntStream>> : [[n-1, n-2, ...], [n+1, n+2, ...]] for each n
                .map(ss -> ss.flatMap(s -> s.filter(x -> IntStream.rangeClosed(2, (int)Math.sqrt(x))
                                                                  .allMatch(y -> x % y != 0))  // prime numbers
                                            .limit(1)  // first one
                                            .mapToObj(String::valueOf))  // Stream<Stream<String>> : 2 prime numbers for each n
                             .collect(Collectors.joining(" ")))  // Stream<String> : output for each n
                .collect(Collectors.joining("\n")));  // String : output for all ns
    }
}