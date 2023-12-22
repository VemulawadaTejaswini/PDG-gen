import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = in.nextInt();
            }

            int[] cumsum = new int[N];
            for (int j = N - 1 - 1; j >= 0; j--) {
                if (H[j] >= H[j + 1]) {
                    cumsum[j] = 1 + cumsum[j + 1];
                } else {
                    cumsum[j] = 0;
                }
            }

            int max = 0;
            for (int j = 0; j < N; j++) {
                max = Math.max(max, cumsum[j]);
            }

            System.out.println(max);
        }
    }
}
