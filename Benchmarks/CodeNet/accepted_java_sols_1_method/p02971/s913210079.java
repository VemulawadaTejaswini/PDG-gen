
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max1 = 0;
        int max2 = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        max1 = Math.max(a[0], a[1]);
        max2 = Math.min(a[0], a[1]);
        for (int i = 2; i < n; ++i) {
            if (a[i] >= max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        for (int i = 0; i < n; ++i) {
            if (max1 == a[i]) {
                System.out.println(max2);
            } else {
                System.out.println(max1);
            }
        }
    }

}
