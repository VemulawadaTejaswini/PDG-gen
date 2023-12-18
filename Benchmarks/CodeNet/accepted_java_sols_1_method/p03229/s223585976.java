import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long sum1 = Math.abs(a[(n - 1) / 2] - a[n - 1]);
        for (int i = 1; i <= (n - 1) / 2; i++) {
            sum1 += Math.abs(a[n - i] - a[i - 1]);
            if (n - 1 - i == (n - 1) / 2) {
                break;
            }
            sum1 += Math.abs(a[i - 1] - a[n - 1 - i]);
        }
        long sum2 = Math.abs(a[(n - 1) / 2] - a[0]);
        for (int i = 1; i <= n / 2; i++) {
            sum2 += Math.abs(a[i - 1] - a[n - i]);
            if (i == n / 2) {
                break;
            }
            sum2 += Math.abs(a[n - i] - a[i]);
        }
        System.out.println(Math.max(sum1, sum2));
    }

}
