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
        long r = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i] - (double) a[n - 1] / 2) < Math.abs(r - (double) a[n - 1] / 2)) {
                r = a[i];
            }
        }
        System.out.println(a[n - 1] + " " + r);
    }

}
