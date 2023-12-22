import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();

    long[][] a = new long[n][m];
    long[][] b = new long[m][l];
    long[][] ans = new long[n][l];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        a[i][j] = sc.nextLong();
      }
    }

    for(int i = 0; i < m; i++){
      for(int j = 0; j < l; j++){
        b[i][j] = sc.nextLong();
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < l; j++){
        for(int k = 0; k < m; k++){
          ans[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < l; j++){
        System.out.print(ans[i][j]);
        if(j != l - 1){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

