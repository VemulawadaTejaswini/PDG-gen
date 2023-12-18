import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        int[] sorted = Arrays.copyOf(A, N);
        Arrays.sort(sorted);

        for (int i = 0; i < N; i++) {
            if (A[i] == sorted[N - 1]) {
                System.out.println(sorted[N - 2]);
            } else {
                System.out.println(sorted[N - 1]);
            }
        }
    }
}
