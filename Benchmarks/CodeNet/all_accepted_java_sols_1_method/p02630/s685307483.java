import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Long, Integer> noMap = new HashMap<>();
        for (int i=1;i<=n;i++) {
            long x = sc.nextLong();
            if (!noMap.containsKey(x)) {
                noMap.put(x,1);
            } else {
                int a = noMap.get(x);
                noMap.put(x,a+1);
            }
        }

        int q = sc.nextInt();
        long ans = 0;
        for (long key : noMap.keySet()) {
            int sub = noMap.get(key);
            ans+=key*sub;
        }
        for (int i=1;i<=q;i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (noMap.containsKey(x)) {
                int a = noMap.get(x);
                int b = 0;
                if (noMap.containsKey(y)) {
                    b = noMap.get(y);
                }
                noMap.put(y,a+b);
                noMap.remove(x);
                long z = y-x;
                ans += z*a;
            }

            System.out.println(ans);
        }
    }
}
