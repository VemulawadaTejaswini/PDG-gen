import java.util.Scanner;

public class Main {
    static final long MX = 1000000000000000000L;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        long sum = 1;
        boolean zero = false;
        boolean over = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zero = true;
                break;
            }

            try {
                Math.multiplyExact(sum, a[i]);
            } catch (ArithmeticException e) {
                over = true;
            }

            if (!over) {
                sum *= a[i];
            }

            if (sum > MX) {
                over = true;
            }
        }

        if (zero) {
            System.out.println(0);
        } else if (over) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}
