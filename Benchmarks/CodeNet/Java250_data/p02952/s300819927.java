import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int count = 0;
            for (int n = 1; n <= N; n++) {
                int mask = 0;
                if (n / 1 > 0) {
                    mask |= (1 << 0);
                }
                if (n / 10 > 0) {
                    mask |= (1 << 1);
                }
                if (n / 100 > 0) {
                    mask |= (1 << 2);
                }
                if (n / 1000 > 0) {
                    mask |= (1 << 3);
                }
                if (n / 10000 > 0) {
                    mask |= (1 << 4);
                }
                if (n / 100000 > 0) {
                    mask |= (1 << 5);
                }

                if ((32 - Integer.numberOfLeadingZeros(mask)) % 2 == 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
