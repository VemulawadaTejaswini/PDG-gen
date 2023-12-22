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
        long[] sum = new long[n];
        sum[0] = a[0];
        for (int i = 1; i < n; i++) {
            sum[i] += sum[i - 1] + a[i];
        }
        int limit = 0;
        for (int i = 0; i < n - 1; i++) {
            if (2 * sum[i] < a[i + 1]) {
                limit = i + 1;
            }
        }
        System.out.println(n - limit);
    }

}
