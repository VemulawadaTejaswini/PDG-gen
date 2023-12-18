import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = in.nextInt();
            }

            Arrays.sort(p);

            p[N - 1] /= 2;

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += p[i];
            }

            System.out.println(sum);
        }
    }
}
