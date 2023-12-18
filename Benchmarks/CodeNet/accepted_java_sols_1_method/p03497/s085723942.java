import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int e = sc.nextInt();
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }

        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue(), (s1, s2) -> s2,
                        LinkedHashMap::new));

        int ans = 0;
        for (Entry<Integer, Integer> ent : sorted.entrySet()) {
            if (K <= 0) {
                ans += ent.getValue();
            }

            K--;
        }

        System.out.println(ans);

    }
}
