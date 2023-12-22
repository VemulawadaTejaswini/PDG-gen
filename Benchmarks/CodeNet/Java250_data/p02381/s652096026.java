import java.util.*;
import java.lang.*;

/**
 * StandardDeviation
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0)
                break;

            int list[] = new int[n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
                sum += list[i];
            }

            sum /= n;
            double ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.pow((list[i] - sum), 2);
            }

            System.out.printf("%.8f\n", Math.sqrt((double) ans / n));
        }
    }
}
