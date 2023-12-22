import java.util.*;

class Main{
  static int n,m,l,a,i,j,k;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    l = sc.nextInt();
    long[][] matrixa = new long[n][m];
    long[][] matrixb = new long[m][l];
    long[][] matrixc = new long[n][l]; 
    for (i= 0; i<n; i++) {
      for (j= 0; j<m; j++) {
        a = sc.nextInt();
        matrixa[i][j] = a;
      }
    }  
    for (i= 0; i<m; i++) {
      for (j= 0; j<l; j++) {
        a = sc.nextInt();
        matrixb[i][j] = a;
      }
    }
    for (i= 0; i<n; i++) {
      for (j= 0; j<l; j++) {
        for (k= 0; k<m ; k++) {
             matrixc[i][j] += matrixa[i][k] * matrixb[k][j];
        }
      }
    }
    for (i= 0; i<n; i++) {
      for (j= 0; j<l; j++) {
        if (j != l-1) {
        System.out.print(matrixc[i][j] + " ");
        } else {
          System.out.println(matrixc[i][j]);
        }
      }
    }
  }   
}
