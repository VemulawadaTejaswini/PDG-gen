import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        long aSum = 0;
        for (int i = 0; i < n; i++) {
            aSum += a[i] = scanner.nextInt();
        }
        long bSum = 0;
        long r = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            bSum += b[i];

            if (a[i] < b[i]) {
                count++;
                r += b[i] - a[i];
            }
            a[i] = Math.max(0, a[i] - b[i]);
        }

        if (aSum < bSum) {
            System.out.println(-1);
        } else {
            Arrays.sort(a);
            for (int i = n - 1; i >= 0 && a[i] != 0; i--) {
                if (r <= 0) {
                    break;
                }
                count++;
                r -= a[i];
            }
            System.out.println(count);
        }
    }
}