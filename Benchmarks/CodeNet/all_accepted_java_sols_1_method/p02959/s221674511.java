
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];

        for (int i = 0; i < n + 1; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        long totalDefeated = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] > a[i]) {
                totalDefeated += a[i];
                b[i] -= a[i];
                totalDefeated += Math.min(b[i], a[i + 1]);
                a[i + 1] = Math.max(0, a[i + 1] - b[i]);
            } else {
                totalDefeated += b[i];
            }
        }

        System.out.println(totalDefeated);

    }
}