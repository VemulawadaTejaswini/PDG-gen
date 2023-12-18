import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            int[] C = new int[N + 1];

            long ans = 1;

            for (int i = 1; i <= N; i++) {
                if (A[i] > 0) {
                    int c = C[A[i] - 1] - C[A[i]];

                    ans = ans * c % 1000000007L;
                }

                C[A[i]]++;
            }

            if ( C[0] > 3) {
                System.out.println(0);
                return;
            }

            if (C[0] == 1) {
                ans = ans * 3 % 1000000007L;
            } else {
                ans = ans * 6 % 1000000007L;
            }

            System.out.println(ans);
        }
    }

}
