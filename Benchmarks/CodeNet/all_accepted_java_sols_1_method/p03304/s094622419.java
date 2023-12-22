import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            double n = in.nextInt();
            int m = in.nextInt();
            int d = in.nextInt();

            if (d == 0) {
                double prob = n / (n * n);
                System.out.println((m - 1) * prob);
            } else {
                double prob = 2 * (n - d) / (n * n);
                System.out.println((m - 1) * prob);
            }
        }
    }
}
