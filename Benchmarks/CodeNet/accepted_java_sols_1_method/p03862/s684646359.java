import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long count = 0;
        if (a[0] > x) {
            count += a[0] - x;
            a[0] -= count;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] <= x) {
                continue;
            }
            long diff = a[i] + a[i + 1] - x;
            count += diff;
            a[i + 1] -= diff;
        }
        System.out.println(count);
    }

}
