import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            final int n = scanner.nextInt();
            int up = 0;
            int down = 0;
            int previous = scanner.nextInt();
            for (int j = 0; j < n - 1; j++) {
                int current = scanner.nextInt();
                up = Math.max(up, current - previous);
                down = Math.max(down, previous - current);
                previous = current;
            }
            System.out.println(up + " " + down);
        }
    }

    public static void main(String... args) {
        solve();
    }
}