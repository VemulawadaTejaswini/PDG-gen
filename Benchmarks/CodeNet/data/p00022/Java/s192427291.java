import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = a[i];
                for (int j = i + 1; j < n; j++) {
                    sum += a[j];
                    if (sum > maximum) {
                        maximum = sum;
                    }
                }
            }
            System.out.println(maximum);
        }
    }

    public static void main(String... args) {
        solve();
    }
}