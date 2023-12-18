import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long X = sc.nextLong();
            long K = sc.nextLong();
            long D = sc.nextLong();

            X = Math.abs(X);

            if (D * K < X) {
                System.out.println(Math.abs(X - D * K));
                return;
            }

            long k = X / D;
            k = Math.min(k, K);
            if ((K - k) % 2 == 0) {
                System.out.println(Math.abs(X - k * D));
            } else {
                System.out.println(Math.abs(X - (k + 1) * D));
            }
        }
    }
}
