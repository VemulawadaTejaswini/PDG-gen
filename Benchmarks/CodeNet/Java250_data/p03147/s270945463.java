import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            int count = 0;
            A: for (;;) {
                for (int i = 0; i < N; i++) {
                    if (h[i] > 0) {
                        decrease(N, h, i);
                        count++;
                        continue A;
                    }
                }
                break;
            }

            System.out.println(count);
        }
    }

    private static void decrease(int N, int[] h, int i) {
        for (int j = i; j < N; j++) {
            if (h[j] <= 0) {
                break;
            }
            h[j]--;
        }
    }

    private static int f(int n) {
        return n % 2 == 0 ? (n / 2) : (3 * n + 1);
    }
}
