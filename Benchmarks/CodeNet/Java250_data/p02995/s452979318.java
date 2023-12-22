import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long A = in.nextLong();
            long B = in.nextLong();
            long C = in.nextLong();
            long D = in.nextLong();
            System.out.println(count(B, C, D) - count(A - 1, C, D));
        }
    }

    private static long count(long N, long C, long D) {
        long countC = N / C;
        long countD = N / D;
        long countCandD = N / (C * D / gcd(C, D));
        return N - countC - countD + countCandD;
    }

    public static final long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
