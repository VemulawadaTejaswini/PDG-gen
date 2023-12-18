import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long T = in.nextInt();
            int[] t = new int[N];
            for (int i = 0; i < N; i++) {
                t[i] = in.nextInt();
            }

            long sum = 0;
            for (int i = 1; i < N; i++) {
                sum += t[i] - t[i - 1] >= T ? T : (t[i] - t[i - 1]);
            }
            sum += T;

            System.out.println(sum);
        }
    }
}
