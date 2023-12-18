import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a[] = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
        IntStream.rangeClosed(-100, 100).map(i -> Arrays.stream(a).map(j -> (j - i) * (j - i)).sum()).min().ifPresent(System.out::println);
    }
}