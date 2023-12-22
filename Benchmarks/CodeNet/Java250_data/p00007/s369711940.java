import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 100000;
        while (n-- > 0) {
            result *= 1.05;
            if (result % 1000 > 0) {
                result = (result / 1000 + 1) * 1000;
            }
        }
        System.out.println(result);
    }

    public static void main(String... args) {
        solve();
    }
}