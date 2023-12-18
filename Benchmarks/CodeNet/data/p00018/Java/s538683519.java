import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers[0]);
    }

    public static void main(String... args) {
        solve();
    }
}