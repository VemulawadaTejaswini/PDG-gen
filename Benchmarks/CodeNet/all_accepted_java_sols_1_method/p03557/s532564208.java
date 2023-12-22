import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextLong();
        for(int i = 0;i < n;i++) b[i] = sc.nextLong();
        for(int i = 0;i < n;i++) c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        long ans = 0;
        for(int i = 0;i < n;i++) {
            long bi = b[i];
            int left = -1;
            int right = n;
            while(right - left > 1) {
                int mid = (left + right) / 2;
                if(a[mid] < bi) left = mid;
                else if(a[mid] >= bi) right = mid;
            }
            long aCount = left + 1;

            left = -1;
            right = n;
            while(right - left > 1) {
                int mid = (left + right) / 2;
                if(c[mid] <= bi) left = mid;
                else if(c[mid] > bi) right = mid;
            }
            long bCount = n - left - 1;
            
            ans += aCount * bCount;
        }
        
        System.out.println(ans);
    }
}
