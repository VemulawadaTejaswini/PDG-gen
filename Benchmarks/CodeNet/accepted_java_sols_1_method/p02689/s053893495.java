import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        int[] a = new int[m];
        int[] b = new int[m];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            if (map.containsKey(a[i])) {
                l = map.get(a[i]);
            }
            l.add(b[i]);
            map.put(a[i], l);
            List<Integer> l2 = new ArrayList<>();
            if (map.containsKey(b[i])) {
                l2 = map.get(b[i]);
            }
            l2.add(a[i]);
            map.put(b[i], l2);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(i + 1)) {
                ans++;
                continue;
            }
            List<Integer> list = map.get(i + 1);
            boolean top = true;
            for (Integer l : list) {
                if (h[i] <= h[l - 1]) {
                    top = false;
                    break;
                }
            }
            if (top) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
