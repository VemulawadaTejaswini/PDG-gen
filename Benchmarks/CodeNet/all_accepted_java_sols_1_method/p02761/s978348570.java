
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] number = new int[n + 1];
        for (int i = 0; i < n + 1; ++i) {
            number[i] = -1;

        }
        for (int i = 0; i < m; ++i) {
            int c = scanner.nextInt();
            int digit = scanner.nextInt();
            if (number[c] == -1 || number[c] == digit) {
                number[c] = digit;
            } else {
                System.out.println(-1);
                return;
            }
        }
        if (number[1] == 0 && n > 1) {
            System.out.println(-1);
            return;
        }
        if (n == 1) {
            if (number[1] == -1) {
                System.out.print(0);
                return;
            } else {
                System.out.print(number[1]);
                return;
            }
        }
        boolean hasFirst = false;
        for (int i = 1; i <= n; ++i) {
            if (!hasFirst && number[i] == -1) {
                System.out.print(1);
                hasFirst = true;
                continue;
            }
            if (number[i] == -1) {
                System.out.print(0);
            } else {
                System.out.print(number[i]);
                hasFirst = true;
            }
        }
        System.out.println();
    }
}
