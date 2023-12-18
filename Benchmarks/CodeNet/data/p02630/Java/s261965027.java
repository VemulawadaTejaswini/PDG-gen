
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.next());
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        long ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans += entry.getKey() * entry.getValue();
        }

        int q = Integer.parseInt(scan.next());
        for (int i = 0; i < q; i++) {
            int b = Integer.parseInt(scan.next());
            int c = Integer.parseInt(scan.next());
            if (map.containsKey(b)) {
                int count = map.get(b);
                ans += (c - b) * count;

                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + count);
                } else {
                    map.put(c, count);
                }
                map.put(b, 0);
            }
            System.out.println(ans);
        }
        scan.close();

    }

}
