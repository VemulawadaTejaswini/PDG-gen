import java.util.*;
import java.lang.*;

/**
 * DrawingLots
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String list[] = str.split(",");
            a[i] = Integer.valueOf(list[0]);
            b[i] = Integer.valueOf(list[1]);
        }

        for (int i = 1; i <= w; i++) {
            int num = i;
            for (int j = n - 1; j >= 0; j--) {
                if (a[j] == num) {
                    num = b[j];
                } else if (b[j] == num) {
                    num = a[j];
                }
            }
            System.out.println(num);
        }
    }
}
