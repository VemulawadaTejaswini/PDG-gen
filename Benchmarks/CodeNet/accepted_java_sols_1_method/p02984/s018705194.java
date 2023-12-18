
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                sum += (long) a[i];
            } else {
                sum -= (long) a[i];
            }
        }

        sum /= 2;

        int A = (int) sum;
        int[] b = new int[n];
        b[0] = 2 * A;
        for (int i = 1 ; i < n ; i++) {
            b[i] = 2 *( a[i - 1] - b[i - 1] / 2);
        }

        for (int i = 0 ; i < n - 1 ; i++) {
            System.out.print(b[i]);
            System.out.print(" ");
        }


        System.out.println(b[n - 1]);
    }

}