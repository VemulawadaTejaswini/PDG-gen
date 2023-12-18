import java.util.Random;
import java.util.Scanner;

public class Main {
    static void cut(int[] v, int p, int c) {
        int[] tmp = new int[p + c];
        for (int i = 0, j = p - 1; i < c; ++i, ++j) {
            tmp[i] = v[j];
        }

        for (int i = c, j = 0; j < p - 1; ++i, ++j) {
            tmp[i] = v[j];
        }

        for (int i = 0; i < p + c - 1; i++) {
            v[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(), r = scanner.nextInt();
            if (n == 0 && r == 0) break;

            int[] v = new int[n];

            for (int i = n - 1; i >= 0; --i) v[i] = n - i;

            for (int i = 0; i < r; ++i) {
                int p = scanner.nextInt(), c = scanner.nextInt();
                cut(v, p, c);
            }
            System.out.println(v[0]);
        }
    }
}
