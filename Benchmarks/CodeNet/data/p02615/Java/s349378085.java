import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        if(n % 2 == 0) {
            long ans = 0;
            ans += a[n - 1];
            for(int i = 0; i < n / 2 - 1; i++) {
                ans += a[n - i - 2] * 2;
            }
            System.out.println(ans);
        }else {
            long ans = 0;
            ans += a[n - 1];
            for(int i = 0; i < n / 2 - 1; i++) {
                ans += a[n - i - 2] * 2;
            }
            ans += a[n - n / 2 - 1];
            System.out.println(ans);
        }
    }
}
