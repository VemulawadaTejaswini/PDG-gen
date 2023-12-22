import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Map<Integer, Long> m = new TreeMap<Integer, Long>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if (m.containsKey(a)) {
                m.put(a, m.get(a) + b);
            } else {
                m.put(a, b);
            }
        }
        long t = 0;
        for (Integer ans : m.keySet()) {
            t += m.get(ans);
            if (t >= k) {
                System.out.println(ans);
                return;
            }
        }
    }

}