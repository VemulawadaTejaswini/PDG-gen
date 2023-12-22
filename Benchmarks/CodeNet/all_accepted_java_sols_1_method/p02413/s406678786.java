import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] a = new int[r + 1][c + 1];
        int sum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            a[i][c] = 0;
            for (int j = 0; j < c; j++) {
                a[i][c] += a[i][j];
            }
        }
        for (int i = 0; i <= c; i++) {
            a[r][i] = 0;
            for (int j = 0; j < r; j++) {
                a[r][i] += a[j][i];
            }
        }

        for (int i = 0; i <= r; i++) {
            System.out.printf("%d",a[i][0]);
            for (int j=1; j <= c; j++) {
                System.out.printf(" %d",a[i][j]);
            }
            System.out.printf("%n");
        }

        scn.close();
    }

}
