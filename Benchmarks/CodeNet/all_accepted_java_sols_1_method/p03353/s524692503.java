import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        int k = scanner.nextInt(), n = s.length();
        System.out.println(new ArrayList<>(IntStream.range(0, n)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, Math.min(i + k, n))
                        .mapToObj(j -> s.substring(i, j)))
                .collect(Collectors.toCollection(TreeSet::new))).get(k - 1));
    }
}