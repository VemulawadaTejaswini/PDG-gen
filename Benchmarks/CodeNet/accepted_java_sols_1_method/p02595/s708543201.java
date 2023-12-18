import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long D = sc.nextInt();
            long[] X = new long[N];
            long[] Y = new long[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
                Y[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (X[i] * X[i] + Y[i] * Y[i] <= D * D) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
