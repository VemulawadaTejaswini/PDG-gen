import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] V = new int[N];
            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                V[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                C[i] = in.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (V[i] > C[i]) {
                    sum += V[i] - C[i];
                }
            }
            System.out.println(sum);
        }
    }

}
