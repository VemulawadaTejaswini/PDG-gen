import java.util.Scanner;

class Main {
    private static boolean[] calcPrimeTable(int n) {
        boolean[] table = new boolean[n + 1];
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
        boolean[] table = calcPrimeTable(999983);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[][] pm = new int[n][2];
            for (int i = 0; i < n; i++) {
                pm[i][0] = scanner.nextInt();
                pm[i][1] = scanner.nextInt();
            }
            int counter = 0;
            for (int i = 0; i < n; i++) {
                int p = pm[i][0];
                int m = pm[i][1];
                for (int j = Math.max(p - m, 2); 
                        j <= p + m && j <= table.length - 1; j++) {
                    if (!table[j]) {
                        counter++;
                    }
                }
            }
            System.out.println(counter - n);
        }
    }

    public static void main(String... args) {
        solve();
    }
}