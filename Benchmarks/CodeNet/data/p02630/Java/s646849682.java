
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author:26019
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long t;
            t = sc.nextInt();
            map.put(t, map.getOrDefault(t, 0L) + 1);
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            long b, c;
            b = sc.nextInt();
            c = sc.nextInt();
            if (map.containsKey(b)) {
                map.put(c, map.get(b) + map.getOrDefault(c, 0L));
                map.remove(b);
            }
            long res = 0L;
            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                res += entry.getKey() * entry.getValue();
            }
            System.out.println(res);
        }
    }
}
