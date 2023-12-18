
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.next());
            map.put(a, 1);
            if (set.contains(a)) {
                map.put(a, 0);
            } else {
                set.add(a);
            }
        }
        scan.close();

        int ans = 0;
        for (int a : set) {
            if (map.get(a) == 0) {
                continue;
            }
            if (a == 1) {
                ans++;
                continue;
            }
            if (set.contains(1)) {
                continue;
            }

            boolean isOK = true;
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    if (set.contains(j) || set.contains(a / j)) {
                        isOK = false;
                        break;
                    }
                }
            }
            if (isOK) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
