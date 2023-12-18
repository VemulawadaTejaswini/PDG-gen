import java.util.Scanner;

class Main {
    private static boolean[] calcPrimeTable(int n) {
        boolean[] table = new boolean[n + 1];
        table[0] = table[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!table[i]) {
                for (int j = i + i; j <= n; j += i) {
                    table[j] = true;
                }
            }
        }
        return table;
    }
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        boolean[] table = calcPrimeTable(10000);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int counter = 0;
            for (int i = 1; i <= n; i++) {
                if (!table[i] && !table[n - i + 1]) {
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