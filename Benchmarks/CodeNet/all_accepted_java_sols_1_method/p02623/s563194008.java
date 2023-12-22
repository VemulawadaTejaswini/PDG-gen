import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
        }
        int[] right = new int[m];
        for (int i = 0; i < m; i++) {
            right[i] = sc.nextInt();
        }
        
        long[] suml = new long[n+1];
        for (int i = 1; i <= n; i++) {
            suml[i] = suml[i-1] + left[i-1];
        }
        long[] sumr = new long[m+1];
        for (int i = 1; i <= m; i++) {
            sumr[i] = sumr[i-1] + right[i-1];
        }
        
        int max = 0;
        int j = m;
        for (int i = 0; i < n + 1; i++) {
            while (j > 0 && suml[i] + sumr[j] > k) {
                j--;
            }
            
            if (suml[i] + sumr[j] <= k) {
                max = Math.max(max, i + j);
            }
        }
        
        System.out.println(max);
    }
}