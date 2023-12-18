import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            final int n = scanner.nextInt();
            final int k = scanner.nextInt();
            final int[] distances = new int[n - 1];
            int previous = scanner.nextInt();
            for (int j = 0; j < n - 1; j++) {
                final int current = scanner.nextInt();
                distances[j] = current - previous;
                previous = current;
            }
            Arrays.sort(distances);
            int total = 0;
            for (int j = 0; j < n - k; j++) {
                total += distances[j];
            }
            System.out.println(total);
        }
    }

    public static void main(String... args) {
        solve();
    }
}