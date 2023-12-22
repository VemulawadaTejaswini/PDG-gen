import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> a.add(sc.nextInt()));

        Map<Integer, Integer> map = new HashMap<>();
        a.forEach(i -> map.merge(i, 1, (x, y) -> x + y));
        if (map.size() <= k) {
            System.out.println(0);
            return;
        }
        Integer sum = map.entrySet()
                .stream()
                .sorted(Entry.comparingByValue())
                .limit(map.size() - k)
                .mapToInt(Entry::getValue)
                .sum();

        System.out.println(sum);
    }

}
