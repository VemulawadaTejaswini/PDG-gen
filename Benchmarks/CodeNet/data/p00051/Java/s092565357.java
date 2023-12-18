import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            char[] digits = scanner.next().toCharArray();
            Arrays.sort(digits);
            int maximum = 0;
            int minimum = 0;
            for (int j = 0; j < digits.length; j++) {
                maximum = maximum * 10 + (digits[digits.length - j - 1] - '0');
                minimum = minimum * 10 + (digits[j] - '0');
            }
            System.out.println(maximum - minimum);
        }
    }

    public static void main(String... args) {
        solve();
    }
}