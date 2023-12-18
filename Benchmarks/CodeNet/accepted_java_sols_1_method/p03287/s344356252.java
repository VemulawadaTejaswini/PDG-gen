import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        Long[] a = new Long[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            if(i != 0) {
                a[i] += a[i - 1];
            }
        }
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for(long num: a) {
            Long val = num % m;
            map.put(val, map.getOrDefault(val, 0L) + 1L);
        }
        long ans = 0;
        for(Long val : map.values()) {
            ans += val * (val - 1) / 2;
        }
        System.out.println(ans);
    }
}
