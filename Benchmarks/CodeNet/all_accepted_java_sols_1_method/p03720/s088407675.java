import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        int[][] c = new int[n][n];
        for (int i = 0 ; i < m ; i++) {
            c[a[i]][b[i]]++;
            c[b[i]][a[i]]++;
        }
        for (int i = 0 ; i < n ; i++) {
            int count = 0;
            for (int j = 0 ; j < n ; j++) {
                count += c[i][j];
            }
            System.out.println(count);
        }
    }

}