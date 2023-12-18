import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] map = { "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday", "Monday", "Tuesday" };

        while (true) {
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            if (month == 0 && day == 0) {
                break;
            }
            int total = 0;
            for (int i = 0; i < month - 1; i++) {
                total += days[i];
            }
            total += day;
            System.out.println(map[total % 7]);
        }
    }

    public static void main(String... args) {
        solve();
    }
}