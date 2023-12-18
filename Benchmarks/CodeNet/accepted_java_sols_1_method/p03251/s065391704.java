
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int amin = a[0];
        int aMax = a[n - 1];

        for (int i = 0 ; i < m ; i++) {
            b[i] = sc.nextInt();

        }
        Arrays.sort(b);

        int bmin = b[0];
        int bmax = b[m - 1];
        if (aMax < bmin && bmin > x && aMax < y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }


    }
}
