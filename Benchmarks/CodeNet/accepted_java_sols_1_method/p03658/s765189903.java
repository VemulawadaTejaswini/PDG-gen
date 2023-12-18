import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = in.nextInt();
            }

            Arrays.sort(l);

            int sum = 0;
            for (int i = 0; i < K; i++) {
                sum += l[N - 1 - i];
            }

            System.out.println(sum);
        }
    }
}
