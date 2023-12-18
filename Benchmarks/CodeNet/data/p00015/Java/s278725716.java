import java.math.BigInteger;
import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            BigInteger sum = a.add(b);
            if (sum.toString().length() > 80) {
                System.out.println("overflow");
            } else {
                System.out.println(sum);
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}