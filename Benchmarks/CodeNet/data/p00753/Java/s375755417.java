import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static boolean[] calcPrimeTable(int n) {
        boolean[] table = new boolean[n + 1];
        Arrays.fill(table, true);
        table[0] = false;
        table[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (table[i]) {
                for (int j = i + i; j <= n; j += i) {
                    table[j] = false;
                }
            }
        }
        return table;
    }
    
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final boolean[] table = calcPrimeTable(123456 * 2);

        while (true) {
            final int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int counter = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (table[i]) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String... args) {
        solve();
    }
}