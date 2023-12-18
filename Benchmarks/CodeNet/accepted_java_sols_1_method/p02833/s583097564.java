import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();

            if (N % 2 == 1) {
                System.out.println(0);
                return;
            }

            long[] x = new long[26];
            x[0] = 10;
            for (int i = 1; i < 26; i++) {
                x[i] = x[i - 1] * 5;
            }

            long c = 0;
            for (int i = 0; i < 26; i++) {
                c += N / x[i];
            }

            System.out.println(c);
        }
    }

}
