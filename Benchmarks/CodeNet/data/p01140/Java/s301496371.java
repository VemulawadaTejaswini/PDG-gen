import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            solve();
        }
    }
    
    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (n==0&&m==0) return;
        
        int[] h = new int[n+1];
        int[] w = new int[m+1];
        for (int i = 1;i <= n;i++) {
            h[i] = h[i-1]+sc.nextInt();
        }
        for (int i = 1;i <= m;i++) {
            w[i] = w[i-1]+sc.nextInt();
        }
        
        Map<Integer, Integer> mx = new HashMap<>();
        Map<Integer, Integer> my = new HashMap<>();
        
        for (int i = 0;i <= n;i++) {
            for (int j = i+1;j <= n;j++) {
                int d = h[j]-h[i];
                if (!mx.containsKey(d)) {
                    mx.put(d, 1);
                } else {
                    mx.put(d, mx.get(d)+1);
                }
            }
        }
        for (int i = 0;i <= m;i++) {
            for (int j = i+1;j <= m;j++) {
                int d = w[j]-w[i];
                if (!my.containsKey(d)) {
                    my.put(d, 1);
                } else {
                    my.put(d, my.get(d)+1);
                }
            }
        }
        
        long ret = 0;
        for (int i = 1;i <= 1500000;i++) {
            if (mx.containsKey(i)&&my.containsKey(i)) {
                ret += mx.get(i)*my.get(i);
            }
        }
        
        System.out.println(ret);
    }
}