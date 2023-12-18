import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        boolean[][] B = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
                B[i][j] = false;
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();

            for (int j = 0; j < 3; j++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    if (!B[j][j2] && A[j][j2] == b) {
                        B[j][j2] = true;
                    }
                }
            }
        }

        boolean ans = false;
        for (int i = 0; i < 3; i++) {
            if (B[i][0] && B[i][1] && B[i][2]) {
                ans = true;
                break;
            }
            if (B[0][i] && B[1][i] && B[2][i]) {
                ans = true;
                break;
            }
        }
        if (B[0][0] && B[1][1] && B[2][2]) {
            ans = true;
        }
        if (B[0][2] && B[1][1] && B[2][0]) {
            ans = true;
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}