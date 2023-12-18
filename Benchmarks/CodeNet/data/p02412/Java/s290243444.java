import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        AtomicInteger count = new AtomicInteger(0);
        List<String> used = new ArrayList<>();
        IntStream.range(1, a + 1)
                 .forEach(x -> {
            IntStream.range(1, a + 1)
                     .filter(y -> y != x)
                     .forEach(y -> {
                IntStream.range(1, a + 1)
                         .filter(z -> z != x && z != y)
                         .filter(z -> x + y + z == b)
                         .forEach(z -> {
                    String sorted = Arrays.asList(x, y, z)
                                          .stream()
                                          .sorted()
                                          .collect(Collectors.toList())
                                          .toString();
                    if (used.contains(sorted)) {
                        return;
                    }
                    used.add(sorted);
                    count.getAndAdd(1);
                });
            });
        });
        System.out.println(count.get());
    }
}

