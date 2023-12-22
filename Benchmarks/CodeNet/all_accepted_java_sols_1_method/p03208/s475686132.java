import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            Arrays.sort(h);

            int min = (int) 1e9;
            for (int i = 0; i < N; i++) {
                if (i + (K - 1) >= N) {
                    continue;
                }
                min = Math.min(min, h[i + (K - 1)] - h[i]);
            }

            System.out.println(min);
        }
    }
}
