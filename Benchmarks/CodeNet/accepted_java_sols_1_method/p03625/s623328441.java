import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long side = 0;
        for (int i = n - 1; i > 0; i--) {
            if (a[i] != a[i - 1]) {
                continue;
            }
            if (side != 0) {
                System.out.println(a[i] * side);
                return;
            }
            side = a[i--];
        }
        System.out.println(0);
    }

}
