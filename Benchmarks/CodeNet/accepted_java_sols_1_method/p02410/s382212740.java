import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    List<Integer> n_m = Stream.of(sc.nextLine().split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());
        HashMap<Integer, List<Integer>> a = new HashMap<>();
        IntStream.rangeClosed(1, n_m.get(0))
                 .forEach(i -> {
                     List<Integer> an = Stream.of(sc.nextLine().split(" "))
                                              .map(Integer::parseInt)
                                              .collect(Collectors.toList());
                     a.put(i, an);
                 });
        HashMap<Integer, Integer> b = new HashMap<>();
        IntStream.rangeClosed(1, n_m.get(1))
                 .forEach(m -> {
                     b.put(m, Integer.parseInt(sc.nextLine()));
                 });
        IntStream.rangeClosed(1, a.size())
                 .forEach(n -> {
                     List<Integer> an = a.get(n);
                     int p = IntStream.rangeClosed(1, an.size())
                              .map(m -> {
                                  return an.get(m - 1) * b.get(m);
                              })
                              .sum();
                     System.out.println(p);
                 });
    }
}


