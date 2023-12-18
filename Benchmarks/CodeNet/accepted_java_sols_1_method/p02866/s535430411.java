import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0 ; i < n ; i++) {
            d[i] = sc.nextInt();
        }
        if (d[0] != 0) {
            System.out.println(0);
            return;
        }
        for (int i = 1 ; i < n ; i++) {
            if (d[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 1 ; i < n ; i++) {
            if (map.containsKey(d[i])) {
                map.put(d[i], map.get(d[i]) + 1);
            } else {
                map.put(d[i], 1);
            }
        }
        int[] a = new int[map.size()];
        Set<Integer> set = new TreeSet<>();
        int b = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            a[b] = entry.getValue();
            set.add(entry.getKey());
            b++;
        }

        int [] c = new int[set.size()];
        int f = 0;
        for (Iterator<Integer> i = set.iterator() ; i.hasNext();) {
            c[f] = i.next();
            f++;
        }

        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] != i + 1) {
                System.out.println(0);
                return;

            }
        }





        long ans = 1;
        long mod = 998244353;
        for (int i = 0 ; i < a.length - 1; i++) {
            int a1 = a[i];
            int a2 = a[i + 1];
            for (int j = 0 ; j < a2 ; j++) {
                ans *= (long) a1;
                ans %= mod;
            }
        }

        System.out.println(ans % mod);

    }

}
