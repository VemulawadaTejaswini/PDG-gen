import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int v = map.getOrDefault(a, 0);
            v++;
            map.put(a, v);
        }
        System.out.println(map.values().stream().mapToInt(Integer::intValue).sorted().limit(Math.max(map.size() - k, 0)).sum());
    }
}
