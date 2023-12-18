import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            StringBuilder result = new StringBuilder();
            do {
                result.append(n % 4);
                n /= 4;
            } while (n > 0);
            System.out.println(result.reverse().toString());
        }
    }

    public static void main(String... args) {
        solve();
    }
}