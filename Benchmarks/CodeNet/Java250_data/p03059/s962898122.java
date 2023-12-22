

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int T = sc.nextInt();
            int sumB = 0;
            for (int t = A; t <= 20; t += A) {
                if (t <= T) {
                    sumB += B;
                }
            }
            System.out.println(sumB);
        }
    }
}
