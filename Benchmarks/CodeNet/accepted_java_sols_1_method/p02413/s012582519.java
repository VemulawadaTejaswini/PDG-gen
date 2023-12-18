
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int r = sc.nextInt();
    static int c = sc.nextInt();
    static int rc[][] = new int[r + 1][c + 1];
    public static void main(String[] args) {
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                rc[i][j] = sc.nextInt();
                rc[i][c] += rc[i][j];
                rc[r][j] += rc[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            rc[r][c] += rc[i][c];
        }
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print(rc[i][j]);
                if (j != c)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

