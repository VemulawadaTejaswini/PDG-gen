
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] W = new int[N];

        for (int i = 0 ; i < N ; i++) {
            W[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0 ; i < N ; i++) {
            total += W[i];
        }

        int S1 = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0 ; i < N - 1 ; i++) {
            S1 += W[i];
            int S2 = total - S1;
            minDiff = Math.min(minDiff, Math.abs(S1 - S2));
        }

        System.out.println(minDiff);
    }
}
