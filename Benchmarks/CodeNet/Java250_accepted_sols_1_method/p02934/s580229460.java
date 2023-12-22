import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            double sumInverse = 0;
            for (int i = 0; i < N; i++) {
                sumInverse += 1.0 / A[i];
            }
            System.out.println(1.0 / sumInverse);
        }
    }
}
