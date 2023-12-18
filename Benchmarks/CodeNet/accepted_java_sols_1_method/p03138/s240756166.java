import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long x = 0;
        int count = 0;
        while(Math.pow(2, count + 1) <= k) count++;
        while(count >= 0) {
            long tmp = x + (long) Math.pow(2, count);
            if(tmp > k) {
                count--;
                continue;
            }
            long sum1 = 0;
            long sum2 = 0;
            for(int i = 0; i < n; i++) {
                sum1 += tmp ^ a[i];
                sum2 += x ^ a[i];
            }
            if(sum1 > sum2) {
                x = tmp;
            }
            count--;
        }
        long ans = 0;
        for(int i = 0; i < n; i++) {
            ans += x ^ a[i];
        }
        System.out.println(ans);
    }
}
