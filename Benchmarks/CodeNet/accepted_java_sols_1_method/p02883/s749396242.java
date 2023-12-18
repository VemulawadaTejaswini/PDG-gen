import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k  = sc.nextLong();

        long[] a = new long[n];
        long[] aa = new long[n];
        long[] f = new long[n];
        long asum = 0;
        long max = 0;
        for(int i=0; i<n; i++) {
            aa[i] = sc.nextInt();
            asum += aa[i];
        }
        for(int i=0; i<n; i++) {
            f[i] = sc.nextInt();
        }

        Arrays.sort(aa);
        Arrays.sort(f);

        for(int i=0; i<n; i++) {
            a[i] = aa[n-1-i];
        }
        if(asum <= k) {
            System.out.println(0);
            return;
        }

        for(int i=0; i<n; i++) {
            max = Math.max(max, a[i] * f[i]);
        }

        if(k == 0) {
            System.out.println(max);
            return;
        }

        long left = 0;
        long right = max;
        long mid = ((right + left) / 2);
        while(right - left > 1) {
            mid = ((right + left) / 2);
            long sum = 0;
            for(int i=0; i<n; i++) {
                if(a[i] * f[i] > mid) {
                    long c = mid / f[i];
                    sum += a[i] - c;
                }
            }
            if(sum <= k) {
                right = mid;
            } else {
                left = mid;
            }
        }

        System.out.println(right);


    }
}
