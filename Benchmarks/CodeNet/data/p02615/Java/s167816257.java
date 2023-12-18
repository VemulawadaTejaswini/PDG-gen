import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        Map<Long, Integer> sorted = map.entrySet()
                                       .stream()
                                       .sorted(Entry.<Long, Integer>comparingByKey().reversed())
                                       .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                                                 (e1, e2) -> e1, LinkedHashMap::new));
        long sum = 0;
        boolean first = true;
        int cnt = n - 1;
        for (Entry<Long, Integer> e : sorted.entrySet()) {
            if (first) {
                first = false;
                if (e.getValue() == 1) {
                    sum += e.getKey() * e.getValue();
                    cnt -= e.getValue();
                } else {
                    if (cnt < 2 *e.getValue()) {
                        sum += e.getKey() * cnt;
                        break;
                    } else {
                        sum += e.getKey() * (e.getValue() - 1) * 2;
                        sum += e.getKey();
                    }
                    cnt -= 2 * e.getValue();
                }
            } else {
                if (cnt <= 2 *e.getValue()) {
                    sum += e.getKey() * cnt;
                    break;
                }
                sum += e.getKey() * e.getValue() * 2;
                cnt -= 2 * e.getValue();
            }
        }
        System.out.println(sum);
    }

}
