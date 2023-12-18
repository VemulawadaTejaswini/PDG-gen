import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] data = new int[120];

        for (int i = 0; i < n; ++i) {
            int b = scanner.nextInt() - 1, f = scanner.nextInt() - 1, r = scanner.nextInt() - 1, v = scanner.nextInt();
            int key = r + 10 * f + 30 * b;
            data[key] += v;
        }

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 10; ++k) {
                    int key = k + 10 * j + 30 * i;
                    System.out.print(" " + data[key]);
                }
                System.out.println();
            }
            if (i != 3) System.out.println("####################");
        }
    }
}
