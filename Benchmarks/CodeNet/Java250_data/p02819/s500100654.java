import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        for (int i = x; i < 2 * x; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean isPrime(long n) {
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }
}