import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
            Map<Integer, Long> map
                = Arrays.stream(s.nextLine().split(" "))
                    .map(Integer::valueOf)
                    .collect(groupingBy(k -> k, counting()));
            long sum = map.entrySet().stream()
                        .mapToLong(e -> e.getKey() * e.getValue())
                        .sum();
            int q = Integer.parseInt(s.nextLine());
            for (int i = 0; i < q; i++) {
                int b = s.nextInt(), c = s.nextInt();
                Long t = map.remove(b);
                if (t != null) {
                    map.merge(c, t, Long::sum);
                    sum += (c - b) * t;
                }
                System.out.println(sum);
            }
        }
    }
}
