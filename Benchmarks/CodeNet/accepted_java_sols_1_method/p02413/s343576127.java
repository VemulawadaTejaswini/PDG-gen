import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int[][] M = new int[r+1][c+1];

        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                M[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[r][j] += M[i][j];
                M[i][c] += M[i][j];
            }
            M[r][c] += M[i][c];
        }

        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                if (j == c ) {
                    System.out.printf("%d\n", M[i][j]);
                } else {
                    System.out.printf("%d ", M[i][j]);
                }
            }
        }
    }
}