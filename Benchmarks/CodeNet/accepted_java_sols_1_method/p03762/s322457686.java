import java.util.*;

public class Main {
    static long MOD = 1000000007;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        n--;
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = array[i+1] - array[i];
        }
        
        array = new long[m];
        for (int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }
        m--;
        long[] y = new long[m];
        for (int i = 0; i < m; i++) {
            y[i] = array[i+1] - array[i];
        }
        
        long[] sumx = new long[n+1];
        for (int i = 0; i < n; i++) {
            sumx[i+1] = sumx[i] + x[i];
            sumx[i+1] %= MOD;
        }
        // System.out.println(Arrays.toString(sumx));
        long sum_x = 0;
        for (long num : sumx) {
            sum_x += num;
            sum_x %= MOD;
        }
        
        long ans_x = 0;
        for (int i = 0; i < n; i++) {
            ans_x += sum_x;
            ans_x %= MOD;
            
            sum_x -= x[i] * (n-i);
            sum_x %= MOD;
            if (sum_x < 0) sum_x += MOD;
        }
        // System.out.println(ans_x);
        
        sumx = new long[m+1];
        for (int i = 0; i < m; i++) {
            sumx[i+1] = sumx[i] + y[i];
            sumx[i+1] %= MOD;
        }
        // System.out.println(Arrays.toString(sumx));
        sum_x = 0;
        for (long num : sumx) {
            sum_x += num;
            sum_x %= MOD;
        }
        
        long ans_y = 0;
        for (int i = 0; i < m; i++) {
            ans_y += sum_x;
            ans_y %= MOD;
            
            sum_x -= y[i] * (m-i);
            sum_x %= MOD;
            if (sum_x < 0) sum_x += MOD;
        }
        // System.out.println(ans_y);
        
        long ans = (ans_x * ans_y) % MOD;
        System.out.println(ans);
    }
}
