import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * AtCoder Beginner Contest 1xx
 * <p>
 * https://atcoder.jp/contests/abc1xx/tasks/abc1xx_c
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(
                IntStream.range(0, n)
                        .mapToObj(m -> sc.nextLine().chars().sorted()
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                .toString()
                        )
                        .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
                        .values()
                        .stream()
                        .filter(count -> count > 1)
                        .mapToLong(count -> (count * (count - 1)) / 2)
                        .sum()
        );
    }
}
