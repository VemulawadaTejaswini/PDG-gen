import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long c = 0;
                for (int k = 0; k < m; k++) {
                    c += a[i][k] * b[k][j];
                }
                System.out.print(c);
                if (j == l - 1) {
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }
        }

    }

}
