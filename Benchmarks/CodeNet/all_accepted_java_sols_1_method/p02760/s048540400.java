import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC157B - Bingo

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] x = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        int[] b = new int[n];

        for (int k = 0; k < n; k++) {
            b[k] = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[i][j] == b[k]) {
                        x[i][j] = 1;
                    }
                }
            }
        }

        String ans = "No";
        if ((1 == x[0][0] && 1 == x[0][1] && 1 == x[0][2]) ||
            (1 == x[1][0] && 1 == x[1][1] && 1 == x[1][2]) ||
            (1 == x[2][0] && 1 == x[2][1] && 1 == x[2][2]) ||
            (1 == x[0][0] && 1 == x[1][0] && 1 == x[2][0]) ||
            (1 == x[0][1] && 1 == x[1][1] && 1 == x[2][1]) ||
            (1 == x[0][2] && 1 == x[1][2] && 1 == x[2][2]) ||
            (1 == x[0][0] && 1 == x[1][1] && 1 == x[2][2]) ||
            (1 == x[0][2] && 1 == x[1][1] && 1 == x[2][0])) {
               ans = "Yes";
           }

        System.out.println(ans);
    }
}