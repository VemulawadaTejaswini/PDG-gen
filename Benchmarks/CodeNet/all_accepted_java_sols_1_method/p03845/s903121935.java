import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] T = new int[N];
            for (int i = 0; i < N; i++) {
                T[i] = in.nextInt();
            }
            int M = in.nextInt();
            int[] P = new int[M];
            int[] X = new int[M];
            for (int i = 0; i < M; i++) {
                P[i] = in.nextInt() - 1;
                X[i] = in.nextInt();
            }

            for (int i = 0; i < M; i++) {
                int[] times = Arrays.copyOf(T, N);
                times[P[i]] = X[i];

                int time = 0;
                for (int j = 0; j < N; j++) {
                    time += times[j];
                }

                System.out.println(time);
            }

        }
    }
}
