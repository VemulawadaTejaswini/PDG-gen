
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int max = 100004;
        boolean[] primes = new boolean[max];

        for (int i = 1 ; i < max ; i++) {
            primes[i] = true;
        }

        for (int i = 2 ; i < max ; i++) {
            if (primes[i]) {
                int c = i * 2;
                while (c < max) {
                    primes[c] = false;
                    c += i;
                }
            }
        }

        for (int i = X ; i < max ; i++) {
            if (primes[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
