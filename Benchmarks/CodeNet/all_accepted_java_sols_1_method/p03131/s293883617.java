import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        long K = scan.nextLong();
        final long A = scan.nextLong();
        final long B = scan.nextLong();

        long biscuit = 1;
        long jpy = 0;

        if (B - A <= 2) {
            while (K > 0) {
                biscuit++;
                K--;
            }
            System.out.println(biscuit);
            return;
        }

        while (K > 0) {
            if (jpy > 0) {
                jpy--;
                biscuit += B;
                K--;
                continue;
            }

            if (biscuit >= A && K >= 2) {
                biscuit -= A;
                jpy++;
                K--;
                continue;
            }

            biscuit++;
            K--;
        }
        System.out.println(biscuit);
    }
}