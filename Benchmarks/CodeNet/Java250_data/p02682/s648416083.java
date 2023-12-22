import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();


        int count = 0;
        int result = Math.min(a, k);
        count = Math.min(a, k);

        count += b;
        result -= Math.max(k - count, 0);

        System.out.println(result);
    }
}