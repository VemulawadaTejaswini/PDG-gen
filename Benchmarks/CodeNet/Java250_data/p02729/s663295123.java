import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = (n * (n - 1)) / 2 + m * (m - 1) / 2;

        System.out.println(result);

    }
}