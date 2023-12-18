import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }

            int min = (int) 1e9;
            for (int l = 0, r = l + K - 1; r < N; l++, r++) {
                min = Math.min(min, Math.abs(x[l]) + Math.abs(x[r] - x[l]));
                min = Math.min(min, Math.abs(x[r]) + Math.abs(x[l] - x[r]));
            }

            System.out.println(min);
        }
    }
}
