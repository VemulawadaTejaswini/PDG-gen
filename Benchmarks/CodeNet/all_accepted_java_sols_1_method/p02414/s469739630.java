import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int l = scn.nextInt();
        int[][] a = new int[n][m], b = new int[m][l];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < l; j++) {
                b[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                long v = 0;
                for(int k = 0; k < m; k++) {
                    v += a[i][k] * b[k][j];
                }
                System.out.print((j > 0 ? " " : "") + v);
            }
            System.out.println();
        }
    }
}