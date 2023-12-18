import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), l = scan.nextInt();
        int[][] a = new int[n][m], b = new int[m][l], c = new int[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;

                System.out.print(j == l -1?c[i][j] : c[i][j] + " ");
            }
            System.out.println();
        }
    }
}