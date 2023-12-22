import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int[] counts = new int[5];
            for (int i = 0; i < N; i++) {
                counts[A[i] % 4 == 0 ? 4 : A[i] % 2 == 0 ? 2 : 1]++;
            }

            if (counts[1] <= counts[4]) {
                System.out.println("Yes");
                return;
            }
            if (counts[1] >= counts[4] + 2) {
                System.out.println("No");
                return;
            }
            System.out.println(counts[2] == 0 ? "Yes" : "No");
        }
    }
}
