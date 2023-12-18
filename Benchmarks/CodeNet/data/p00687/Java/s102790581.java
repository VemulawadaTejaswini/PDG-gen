import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (n == 0 && a == 0 && b == 0) {
                break;
            }
            boolean[] table = new boolean[n + 1];
            for (int i = 0; a * i <= n; i++) {
                int ai = a * i;
                for (int j = 0; b * j <= n - ai; j++) {
                    table[ai + b * j] = true;
                }
            }

            int counter = 0;
            for (int i = 1; i <= n; i++) {
                if (!table[i]) {
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