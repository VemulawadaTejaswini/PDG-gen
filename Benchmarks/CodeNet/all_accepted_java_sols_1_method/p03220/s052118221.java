import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int A = scanner.nextInt();
        List<Integer> list = IntStream.range(0, N)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list.indexOf(list.stream()
                .min(Comparator.comparingDouble(d -> Math.abs(T - d * 0.006 - A)))
                .orElse(0)) + 1);
    }
}