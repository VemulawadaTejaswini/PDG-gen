import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] D = new int[K];
        int[] A = new int[N + 1];
        Arrays.fill(A, 0);

        int count = 0;
        for (int j = 0; j < K; j++) {
            D[j] = sc.nextInt();
            for (int i = 0; i < D[j]; i++) {
                int sunuke = sc.nextInt();
                if (A[sunuke] == 0) {
                    A[sunuke]++;
                    count++;
                }
            }
        }
        sc.close();

        System.out.println(N - count);

    }
}