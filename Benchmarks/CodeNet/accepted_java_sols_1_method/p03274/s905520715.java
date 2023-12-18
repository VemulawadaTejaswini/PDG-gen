import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] x = new long[n];
        for(int i = 0; i < n; ++i) x[i] = sc.nextLong();
        
        long ans = Long.MAX_VALUE;
        for(int i = k - 1; i < n; ++i) {
            long lr = Math.abs(x[i - k + 1]) + Math.abs(x[i - k + 1] - x[i]);
            long rl = Math.abs(x[i]) + Math.abs(x[i - k + 1] - x[i]);
            ans = Math.min(ans, Math.min(lr, rl));
        }
        
        System.out.println(ans);
    }
}
