import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean hasZero = false;
        boolean isOver = false;
        long sum = 1;

        for (int i = 0; i < N; i++) {
            long A = scanner.nextLong();
            if (A == 0) {
                System.out.println("0");
                return;
            }

            try {
                sum = Math.multiplyExact(sum, A);
                if (sum > 1000000000000000000L) {
                    isOver = true;
                }
            } catch (ArithmeticException e) {
                isOver = true;
            }
        }

        System.out.println(isOver ? "-1" : sum);
    }
}


