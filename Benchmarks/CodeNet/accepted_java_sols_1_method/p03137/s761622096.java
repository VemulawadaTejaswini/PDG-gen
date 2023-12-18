import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> x = IntStream.range(0, m)
                .mapToObj(i -> scanner.nextInt())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(IntStream.range(0, x.size() - 1)
                .map(i -> x.get(i + 1) - x.get(i))
                .sorted()
                .limit(Math.max(0, m - n))
                .sum());
    }
}