import java.util.*;

public class Main {

    static final int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Map<Long, Integer>> emap = new HashMap<>();
        Map<Long, Map<Long, Integer>> omap = new HashMap<>();
        long[][] arr = new long[n][2];
        boolean[] odd = new boolean[n];
        for (int i = 0; i < n; i++) {
            boolean an = false, bn = false;
            long a = sc.nextLong();
            long b = sc.nextLong();
             if(a < 0){
                an = true; a *= -1;
            }
             if(b < 0){
                bn = true; b *= -1;
            }
            long x = gcd(a, b);
            a /= x; b /= x;
            if(an == bn){
                setMap(a, b, emap);
            }else{
                setMap(a, b, omap);
                odd[i] = true;
            }
            arr[i][0] = a; arr[i][1] = b;
        }
        long[] d = new long[n+1];
        d[0] = 1;
        for (int i = 1; i <= n; i++) {
            d[i] = (d[i-1] * 2) % mod;
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long a = arr[i][0], b = arr[i][1];
            long x = 0, y = 0;
            Map<Long, Map<Long, Integer>> m1, m2;
            if(odd[i]){
                m1 = omap; m2 = emap;
            }else{
                m1 = emap; m2 = omap;
            }
            if(!m1.get(a).containsKey(b)) continue;
            x = d[m1.get(a).get(b)]-1;
            m1.get(a).remove(b);
            if(m2.containsKey(b) && m2.get(b).containsKey(a)){
                y = d[m2.get(b).get(a)]-1;
                m2.get(b).remove(a);
            }
            ans = (ans * (x+y+1)%mod) % mod;

        }
        System.out.println(ans-1);
        sc.close();

    }

    private static void setMap(long a, long b, Map<Long, Map<Long, Integer>> map) {
        if(!map.containsKey(a)) map.put(a, new HashMap<>());
        if(!map.get(a).containsKey(b)) map.get(a).put(b, 0);
        map.get(a).put(b, map.get(a).get(b) + 1);
    }

    public static long gcd(long a, long b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
