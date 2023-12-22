import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> x = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.toList());

        List<Integer> xSorted = new ArrayList<>(x);
        Collections.sort(xSorted);

        int m1 = xSorted.get(n / 2 - 1), m2 = xSorted.get(n / 2);
        for (Integer i : x)
            System.out.println(i > m1 ? m1 : m2);
    }
}