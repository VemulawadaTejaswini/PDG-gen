import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        long total = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    total += gcd(i, j, k);
                }
            }
        }
        System.out.println(total);
    }

    public static int gcd(int a, int b) {
        if (a >= b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        } else {
            return gcd(b, a);
        }
    }

    public static int gcd(int a, int b, int c) {
        return gcd(a, gcd(b, c));
    }
}
