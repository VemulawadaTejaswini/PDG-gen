import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] A = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            int N = sc.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            boolean[][] C = new boolean[3][3];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (A[j][k] == B[i]) {
                            C[j][k] = true;
                        }
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                if (C[i][0] && C[i][1] && C[i][2]) {
                    System.out.println("Yes");
                    return;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (C[0][i] && C[1][i] && C[2][i]) {
                    System.out.println("Yes");
                    return;
                }
            }

            if (C[0][0] && C[1][1] && C[2][2]) {
                System.out.println("Yes");
                return;
            }

            if (C[0][2] && C[1][1] && C[2][0]) {
                System.out.println("Yes");
                return;
            }

            System.out.println("No");
        }
    }

}
