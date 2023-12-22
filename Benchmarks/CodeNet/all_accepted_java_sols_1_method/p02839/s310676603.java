import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
        Scanner sc = new Scanner (new BufferedInputStream(System.in));
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][][] f = new int[m + 1][n + 1][(m + n) * 80];
    f[1][1][Math.abs(A[0][0] - B[0][0])] = 1;
        for(int i  = 1; i <= m; ++i) {
            for(int j = 1; j <= n; ++j) {

               // f[i][j][0] = 1;
                
                for(int k = 0; k < (m + n) * 80; ++k) {	
                    if(f[i][j][k] != 0) {
                      if(i != m) { 
                        int diffx = Math.abs(A[i][j - 1] - B[i][j - 1]);
                        f[i + 1][j][diffx + k] = 1;
                        f[i + 1][j][Math.abs(diffx - k)] = 1;
                      }
                      if(j != n) { 
                     	int diffy = Math.abs(A[i - 1][j] - B[i - 1][j]);
                        f[i][j + 1][diffy + k] = 1;
                        f[i][j + 1][Math.abs(diffy - k)] = 1;
                      }
                    }
                }
            }
        }
        for(int i = 0; i < (m + n) * 80; ++i) {
            if(f[m][n][i] != 0) {
                System.out.println(i);
                break;
            }
        }
        // System.out.println(f[m - 1][n - 1]);
      }
}
