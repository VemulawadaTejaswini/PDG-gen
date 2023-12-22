import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();

            int N = (int) 1e6;
            boolean[] isPrime = new boolean[N];
            Arrays.fill(isPrime, true);
            for (int n = 2; n < N; n++) {
                if (!isPrime[n]) {
                    continue;
                }
                for (int i = n + n; i < N; i += n) {
                    if (isPrime[i]) {
                        isPrime[i] = false;
                    }
                }
            }

            for (int x = X; x < N; x++) {
                if (isPrime[x]) {
                    System.out.println(x);
                    return;
                }
            }

            throw new AssertionError();
        }
    }
}