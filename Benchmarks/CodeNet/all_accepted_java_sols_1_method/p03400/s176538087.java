import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int D = in.nextInt();
            int X = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int res = X;
            for (int i = 0; i < N; i++) {
                for (int d = 1; d <= D; d += A[i]) {
                    res++;
                }
            }

            System.out.println(res);
        }
    }
}
