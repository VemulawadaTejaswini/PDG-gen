import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            b[i] = sc.nextInt();
        }
        int[][] a = new int[n][m];
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            int ans = 0;
            for (int j = 0 ; j < m ;j++) {
                a[i][j] = sc.nextInt();
                ans += a[i][j] * b[j];
            }
            if (ans + c > 0) {
                count++;
            }

        }

        System.out.println(count);


    }

}
