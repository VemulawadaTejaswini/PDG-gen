import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int result = 0;
            if (n == 0) {
                break;
            }
            while (n > 0) {
                result += n / 5;
                n /= 5;
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}