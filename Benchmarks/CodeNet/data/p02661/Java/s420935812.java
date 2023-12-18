
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
            b[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Arrays.sort(a);
        Arrays.sort(b);

        if (n % 2 == 1) {
            System.out.println(b[(n - 1) / 2] - a[(n - 1) / 2] + 1);
        } else {
            int alow = a[n / 2 - 1];
            int ahigh = a[n / 2];
            int blow = b[n / 2 - 1];
            int bhigh = b[n / 2];
            System.out.println(blow + bhigh - alow - ahigh + 1);
        }

    }

}
