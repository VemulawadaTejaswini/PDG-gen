import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            A[0] = 1;
            for (int i = 1; i < N; i++) {
                A[i] = sc.nextInt() - 1;
            }

            int[] counts = new int[N];
            for (int i = 1; i < N; i++) {
                counts[A[i]]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(counts[i]).append("\n");
            }
            System.out.println(sb.toString());

        }
    }
}
