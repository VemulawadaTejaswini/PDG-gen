import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, Long> map = IntStream.range(0, n).mapToObj(m -> sc.nextInt()).collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        long sum = map.keySet().stream().mapToLong(v -> v * map.get(v)).sum();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int before = sc.nextInt();
            int after = sc.nextInt();
            if (map.containsKey(before)) {
                long count = map.get(before);
                sum += (after - before) * count;
                System.out.println(sum);
                map.remove(before);
                if (map.containsKey(after)) {
                    map.replace(after, map.get(after) + count);
                } else {
                    map.put(after, count);
                }
            } else {
                System.out.println(sum);
            }
        }
    }
}
