import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final long N  = sc.nextLong();
            final long A  = sc.nextLong();
            final long B  = sc.nextLong();

            long kurikaesi = N / (A+B);
            long amari = N % (A+B);

            long tsuika = 0;
            if (amari > A) {
                tsuika = A;
            } else {
                tsuika = amari;
            }

            System.out.println(kurikaesi * A + tsuika);
        } finally {
            sc.close();
        }
    }
}
