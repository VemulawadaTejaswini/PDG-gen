import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[]$) {
        List<Integer> list = IntStream.range(0, 5).map(i -> scanner.nextInt())
                .boxed()
                .sorted(Comparator.comparingInt(i -> (i - 1) % 10))
                .collect(Collectors.toList());
        System.out.println(list.get(0) + list.subList(1, list.size()).stream().mapToInt(i -> (i - 1) / 10 * 10 + 10).sum());
    }
}