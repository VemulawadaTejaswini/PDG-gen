import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int r = scanner.nextInt();
            final int c = scanner.nextInt();
            if (r == 0 && c == 0) {
                break;
            } else if (r == 1 && c % 2 == 1) {
                System.out.println("no");
            } else if (r % 2 == 1 && c == 1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}