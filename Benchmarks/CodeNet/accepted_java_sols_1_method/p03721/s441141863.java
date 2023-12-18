import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            long b = Long.parseLong(sc.next());
            if (map.containsKey(a)) {
                long num = map.get(a) + b;
                map.put(a, num);
            } else {
                map.put(a, b);
            }
        }
        long temp = k;
        for (Map.Entry<Integer, Long> e : map.entrySet()) {
            temp = temp - e.getValue();
            if (temp <= 0) {
                System.out.println(e.getKey());
                return;
            }
        }
    }
}