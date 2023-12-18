
import java.util.Scanner;

/**
 * Created by oka on 2018/06/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == k) {
            System.out.println(1);
            return;
        }

        System.out.println((n - k - 1) / (k - 1) + 2);
    }
}
