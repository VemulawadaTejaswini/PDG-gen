import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            long ans = 1;

            int[] C = new int[N + 1];
            C[0] = 3;

            for (int i = 1; i <= N; i++) {
                ans = ans * C[A[i]] % 1000000007;

                C[A[i]]--;
                C[A[i] + 1]++;
            }

            System.out.println(ans);
        }
    }

}
