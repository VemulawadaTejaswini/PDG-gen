import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>> bs = new HashMap<>();
        IntStream.rangeClosed(1, 4)
                 .forEach(b -> {
                     HashMap<Integer, HashMap<Integer, Integer>> fs = new HashMap<>();
                     IntStream.rangeClosed(1, 3)
                              .forEach(f -> {
                                  HashMap<Integer, Integer> rs = new HashMap<>();
                                  IntStream.rangeClosed(1, 10)
                                           .forEach(r -> {
                                               rs.put(r, 0);
                                           });
                                  fs.put(f, rs);
                              });
                     bs.put(b, fs);
                 });
        while(sc.hasNext()) {
            List<Integer> b_f_r_n = Stream.of(sc.nextLine().split(" "))
                                          .map(Integer::parseInt)
                                          .collect(Collectors.toList());
            int n = bs.get(b_f_r_n.get(0)).get(b_f_r_n.get(1)).get(b_f_r_n.get(2));
            bs.get(b_f_r_n.get(0)).get(b_f_r_n.get(1)).put(b_f_r_n.get(2), n + b_f_r_n.get(3));
        }
        bs.forEach((b, floors) -> {
            floors.forEach((f, rooms) -> {
                rooms.forEach((r, n) -> {
                    System.out.print(" " + n);
                });
                System.out.println();
            });
            if (b != 4) {
                System.out.println("####################");
            }
        });
    }
}


