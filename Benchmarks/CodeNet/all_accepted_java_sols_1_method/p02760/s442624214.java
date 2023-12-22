import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        while (N-- > 0) {
            int b = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (A[i][j] == b) {
                        A[i][j] = 0;
                    }
                }
            }
        }

        // row
        for (int i = 0; i < 3; i++) {
            if (A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0) {
                System.out.println("Yes");
                return;
            }
        }
        // column
        for (int j = 0; j < 3; j++) {
            if (A[0][j] == 0 && A[1][j] == 0 && A[2][j] == 0) {
                System.out.println("Yes");
                return;
            }
        }

        // naname
        if (A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0) {
            System.out.println("Yes");
            return;
        }
        if (A[2][0] == 0 && A[1][1] == 0 && A[0][2] == 0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
