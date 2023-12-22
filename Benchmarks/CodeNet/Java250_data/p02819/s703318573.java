import java.util.Scanner;

/**
 * Next Prime
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();

            for (int i = X;; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
