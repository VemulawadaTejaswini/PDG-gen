import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[i][j] == B[k]) {
                        C[i][j] = true;
                    }
                }
            }
        }

        boolean bingo = false;

        for (int i = 0; i < 3; i++) {
            if (C[i][0] && C[i][1] && C[i][2]) {
                bingo = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (C[0][i] && C[1][i] && C[2][i]) {
                bingo = true;
            }
        }

        if (C[0][0] && C[1][1] && C[2][2]) {
            bingo = true;
        }

        if (C[0][2] && C[1][1] && C[2][0]) {
            bingo = true;
        }

        if (bingo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
