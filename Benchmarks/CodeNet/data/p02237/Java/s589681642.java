import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();

        int[][] Mat = new int[n][n];

        int u, k, v;
        for (int i = 0; i < n; i++) {
            u = sc.nextInt();
            k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                v = sc.nextInt();
                Mat[u - 1][v - 1] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%d ", Mat[i][j]));
            }
            System.out.print("\n");
        }
    }
}