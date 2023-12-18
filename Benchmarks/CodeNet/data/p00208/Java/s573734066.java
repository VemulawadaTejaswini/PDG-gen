import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] map = {0, 1, 2, 3, 5, 7, 8, 9};

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            StringBuilder result = new StringBuilder();
            do {
                result.append(map[n % 8]);
                n /= 8;
            } while (n != 0);
            System.out.println(result.reverse());
        }
    }

    public static void main(String... args) {
        solve();
    }
}