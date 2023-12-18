import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();

            int current = 1;
            for (int i = 0; i < N; i++) {
                int nextA = 2 * current;
                int nextB = current + K;
                current = Math.min(nextA, nextB);
            }
            System.out.println(current);
        }
    }
}
