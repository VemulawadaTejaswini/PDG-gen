import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int count = 0;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l <= k; l++) {
                count += a[0][l];
            }
            for (int m = n-1; m >= k; m--) {
                count += a[1][m];
            }
            if (max < count) {
                max = count;
            }
            count = 0;
        }

        System.out.println(max);
    }
}