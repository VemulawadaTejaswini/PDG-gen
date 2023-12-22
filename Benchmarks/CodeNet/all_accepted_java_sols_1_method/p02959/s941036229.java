import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        long sum = 0;

        for (int i = 0; i < n + 1; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] <= b[i]) {
                sum += a[i];
                if (a[i+1] <= b[i] - a[i]) {
                    sum += a[i+1];
                    a[i+1] = 0;
                } else {
                    sum += b[i] - a[i];
                    a[i+1] -= b[i] - a[i];
                }
            } else {
                sum += b[i];
            }
        }
        System.out.println(sum);
    }
}

