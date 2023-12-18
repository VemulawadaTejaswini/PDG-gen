import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in))
                .lines()  // Stream<String> : ???n
                .mapToInt(Integer::parseInt)  // IntStream : ???n
                .mapToObj(n -> Stream.of(IntStream.iterate(n - 1, i -> i - 1), IntStream.iterate(n + 1, i -> i + 1))) // Stream<Stream<IntStream>> : ???n???[[n-1, n-2, ...], [n+1, n+2, ...]]
                .map(ss -> ss.flatMap(s -> s.filter(x -> IntStream.rangeClosed(2, (int)Math.sqrt(x))
                                                                  .allMatch(y -> x % y != 0))  // ?´???°????????£??????????????°
                                            .limit(1)  // ?????????1???
                                            .mapToObj(String::valueOf))  // Stream<Stream<String>> : ???n?????????????´???°2???
                             .collect(Collectors.joining(" ")))  // Stream<String> : ???n?????????
                .collect(Collectors.joining("\n")));  // String : ??¨n?????????
    }
}