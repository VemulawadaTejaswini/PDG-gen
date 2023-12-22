import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            int id = sc.nextInt();
            int degree = sc.nextInt();
            for (int j = 0; j < degree; ++j) {
                int a = sc.nextInt();
                arr[id - 1][a - 1] = 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j]);
                if (j != n - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

