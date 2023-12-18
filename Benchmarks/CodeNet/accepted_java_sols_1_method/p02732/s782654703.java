import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1L);
            }
        }
        long ans = 0;
        for (Map.Entry<Long, Long> e : map.entrySet()) {
            ans += e.getValue() * (e.getValue() - 1) / 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans - (map.get(a[i]) - 1));
        }
    }
}