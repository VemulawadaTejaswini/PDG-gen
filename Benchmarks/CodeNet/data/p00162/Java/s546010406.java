import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int m = scanner.nextInt();
            if (m == 0) {
                break;
            }
            int n = scanner.nextInt();
            int acc0 = 1;
            int counter = 0;
            for (int i = 0; ; i++) {
                int acc1 = acc0;
                for (int j = 0; ; j++) {
                    int acc2 = acc1;
                    for (int k = 0; ; k++) {
                        if (acc2 >= m && acc2 <= n) {
                            counter++;
                        } else if (acc2 > n) {
                            break;
                        }
                        acc2 *= 5;
                    }
                    if (acc1 > n) {
                        break;
                    }
                    acc1 *= 3;
                }
                if (acc0 > n) {
                    break;
                }
                acc0 *= 2;
            }
            System.out.println(counter);
        }
    }

    public static void main(String... args) {
        solve();
    }
}