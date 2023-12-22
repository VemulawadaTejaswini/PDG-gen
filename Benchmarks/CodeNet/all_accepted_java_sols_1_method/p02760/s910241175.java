import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        boolean[][] isExisted = new boolean[3][3];


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        int N = sc.nextInt();
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (b[i] == A[j][k]) {
                        isExisted[j][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (isExisted[i][0] && isExisted[i][1] && isExisted[i][2]) {
                System.out.println("Yes");
                return;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (isExisted[0][i] && isExisted[1][i] && isExisted[2][i]) {
                System.out.println("Yes");
                return;
            }
        }

        if (isExisted[0][0] && isExisted[1][1] && isExisted[2][2]) {
            System.out.println("Yes");
            return;
        }

        if (isExisted[0][2] && isExisted[1][1] && isExisted[2][0]) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
