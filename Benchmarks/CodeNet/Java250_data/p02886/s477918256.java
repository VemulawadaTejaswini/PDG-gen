import java.util.Scanner;

/**
 * TAKOYAKI FESTIVAL 2019
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] D = new int[N];
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += D[i] * D[j];
                }
            }

            System.out.println(sum);
        }
    }

}
