import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            int[] x2 = new int[N];
            int[] y2 = new int[N];
            for (int i = 0; i < N; i++) {
                x2[i] = x[i] + y[i];
                y2[i] = x[i] - y[i];
            }

            Arrays.sort(x2);
            Arrays.sort(y2);

            long min = Math.max(Math.abs(x2[0] - x2[N - 1]), Math.abs(y2[0] - y2[N - 1]));

            System.out.println(min);
        }
    }
}
