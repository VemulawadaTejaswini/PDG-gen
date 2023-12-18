import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = i * fact;
        }
        System.out.println(fact);
    }

    public static void main(String... args) {
        solve();
    }
}