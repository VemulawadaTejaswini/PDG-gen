import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt(), c = scan.nextInt();
        int[][] a = new int[r + 1][c + 1];

        // r ?????c ???????´????????????¨????????????????´?????????¨???
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][c] += a[i][j] = scan.nextInt();
                a[r][j] += a[i][j];
                a[r][c] += a[i][j];
            }
        }
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
            }
            System.out.println(a[i][c]);
        }

    }
}