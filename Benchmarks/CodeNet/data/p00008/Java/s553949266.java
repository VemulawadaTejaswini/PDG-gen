import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int result = 0;
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    for (int c = 0; c < 10; c++) {
                        for (int d = 0; d < 10; d++) {
                            if (a + b + c + d == n) {
                                result++;
                            }
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}