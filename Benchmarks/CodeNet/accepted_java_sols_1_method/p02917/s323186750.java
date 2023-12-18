import java.util.Scanner;

/**
 * Maximal Value
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] B = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                B[i] = sc.nextInt();
            }

            int S = 0;
            S += B[0];
            for (int i = 0; i < N - 2; i++) {
                S += Math.min(B[i], B[i + 1]);
            }
            S += B[N - 2];

            System.out.println(S);
        }
    }

}
