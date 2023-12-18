import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();
        long K = scanner.nextLong();
        long D = scanner.nextLong();

        long pos = X;
        for (long i = 0; i < K; i++) {
            if (pos > 0) {
                if (pos - D > 0) {
                    // まだ0を超えていない
                    pos = pos - D;
                } else {
                    if ((K - i) % 2 == 0) {
                        pos = pos - D;
                        break;
                    } else {
                        pos = pos - D;
                        break;
                    }
                }
            } else {
                if (pos + D > 0) {
                    if ((K - i) % 2 == 0) {
                        pos = pos + D;
                        break;
                    } else {
                        pos = pos + D;
                        break;
                    }
                } else {
                    // まだ0を超えていない
                    pos = pos + D;
                }
            }
        }

        System.out.println(Math.abs(pos));
    }
}
