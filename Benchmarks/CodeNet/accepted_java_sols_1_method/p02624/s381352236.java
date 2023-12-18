import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            final int M = (int) 1e7;
            long[] numDivisors = new long[M + 1];
            for (int divisor = 1; divisor <= M; divisor++) {
                for (int j = divisor; j <= M; j += divisor) {
                    numDivisors[j]++;
                }
            }

            long sum = 0;
            for (int k = 1; k <= N; k++) {
                sum += k * numDivisors[k];
            }
            System.out.println(sum);
        }
    }
}
