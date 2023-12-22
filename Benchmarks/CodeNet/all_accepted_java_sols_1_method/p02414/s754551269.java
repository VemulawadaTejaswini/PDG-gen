import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int [][] a = new int[n][m];
        int [][] b = new int[m][l];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < m; j++) {
            for(int k = 0; k < l; k++) {
                b[j][k] = sc.nextInt();
            }
        }
        long [][] x = new long[n][l];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < l; k++) {
                    x[i][k] += a[i][j]*b[j][k];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < l; k++) {
                System.out.print((k == 0 ? "" : " ") + x[i][k]);
            }
            System.out.println();
        }
    }
}