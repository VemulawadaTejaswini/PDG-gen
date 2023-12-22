import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a[] = IntStream.range(0, n).map(i -> scanner.nextInt() - i - 1).sorted().toArray();
        System.out.println(Arrays.stream(a).mapToLong(i -> Math.abs(i - a[n / 2])).sum());
    }
}