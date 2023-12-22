
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] k = new int[n][m];
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            for (int j = 0 ; j < a[i] ; j++) {
                int x = sc.nextInt() - 1;
                k[i][x]++;
            }
        }
        int ans = 0;
        for (int j = 0 ; j < m ;j++) {
            int c = 0;
            for (int i = 0 ; i < n ; i++) {
                if (k[i][j] == 1) {
                    c++;
                }
            }
            if (c == n) {
                ans++;
            }
        }


        System.out.println(ans);
    }

}
