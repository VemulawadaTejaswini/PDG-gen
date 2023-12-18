import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == 0 && y == 0) {
                break;
            }
            if (x < y) {
                int temp = x;
                x = y;
                y = temp;
            }
            int step = 0;
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
                step++;
            }
            System.out.println(String.format("%d %d", x, step));
        }
    }

    public static void main(String... args) {
        solve();
    }
}