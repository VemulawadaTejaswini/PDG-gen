import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        int [] b = new int[m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        int [] x = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                x[i] += a[i][j]*b[j];
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }
}