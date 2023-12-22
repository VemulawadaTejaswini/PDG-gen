import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] L = new int[M];
            int[] R = new int[M];
            for (int i = 0; i < M; i++) {
                L[i] = in.nextInt();
                R[i] = in.nextInt();
            }

            int maxL = 0;
            int minR = (int) 1e6;
            for (int i = 0; i < M; i++) {
                maxL = Math.max(maxL, L[i]);
                minR = Math.min(minR, R[i]);
            }
            if (maxL > minR) {
                System.out.println(0);
                return;
            }
            System.out.println(minR - maxL + 1);
        }
    }
}
