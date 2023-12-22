import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long,Long> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < n; i++) {
            Long key = sc.nextLong();
            ans += key;
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1l);
            }
        }
        int q = sc.nextInt();
        long[] b = new long[q];
        long[] c = new long[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            long key = b[i];
            long val = c[i];
            if(map.containsKey(key)) {
                long diff = map.get(key);
                map.remove(key);
                ans += (val - key) * diff;
                if(map.containsKey(val)) {
                    map.put(val, diff + map.get(val));
                } else {
                    map.put(val, diff);
                }
            }
            System.out.println(ans);
        }
    }
}