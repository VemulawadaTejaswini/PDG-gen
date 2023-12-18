import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        System.out.println(IntStream.range(0, n)
                .boxed()
                .collect(Collectors.groupingBy(i -> scanner.nextInt(), Collectors.reducing(0, i -> 1, Integer::sum)))
                .values().stream()
                .sorted(Comparator.reverseOrder())
                .skip(k)
                .mapToInt(Integer::intValue)
                .sum());
    }
}