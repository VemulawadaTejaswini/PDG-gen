import java.util.*;

public class Main {
    static int MOD = 1000000007;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            array[i] = i+1;
        }
        
        long[] sumcum = new long[n+2];
        for (int i = 1; i < n+2; i++) {
            sumcum[i] = sumcum[i-1] + array[i-1];
            //System.out.println(sumcum[i]);
        }
        
        long ans = 0;
        for (int i = k; i <= n+1; i++) {
            long num = (sumcum[n+1] - sumcum[n+1-i]) - sumcum[i] + 1;
            ans = (ans + num) % MOD;
        }
        System.out.println(ans);
    }
}
