import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
            }

            int[] copy = Arrays.copyOf(X, N);
            Arrays.sort(copy);

            int l = copy[N / 2 - 1];
            int r = copy[N / 2];

            int[] medians = new int[N];
            for (int i = 0; i < N; i++) {
                if (X[i] <= l) {
                    medians[i] = r;
                } else {
                    medians[i] = l;
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.println(medians[i]);
            }
        }
    }
}
