import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            array[i] = sc.nextInt();
        }
        
        if (n == 0) {
            if (array[0] == 1) {
                System.out.println(1);
                return;
            } else {
                System.out.println(-1);
                return;
            }
        } else {
            if (array[0] != 0) {
                System.out.println(-1);
                return;
            }
        }
        
        long[] sum = new long[n+1];
        sum[n] = array[n];
        for (int i = n-1; i >= 0; i--) {
            sum[i] = sum[i+1] + array[i];
            
        }
        // System.out.println(Arrays.toString(sum));
        
        long[] ans = new long[n+1];
        long now = 1;
        ans[0] = 1;
        now -= array[0];
        if (now < 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 1; i < n+1; i++) {
            now *= 2;
            ans[i] = Math.min(sum[i], now);
            now = ans[i] - array[i];
            if (now < 0) {
                System.out.println(-1);
                return;
            }
        }
        
        long count = 0;
        for (int i = 0; i < n+1; i++) {
            count += ans[i];
        }
        System.out.println(count);
        
    }
}
