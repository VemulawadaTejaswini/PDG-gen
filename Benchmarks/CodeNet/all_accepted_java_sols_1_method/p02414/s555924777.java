import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int l = scanner.nextInt();
    int[][] A = new int[n][m];
    int[][] B = new int[m][l];
    long[][] C = new long[n][l];

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          A[i][j] = scanner.nextInt();
        }
      }

      for(int i=0;i<m;i++){
        for(int j=0;j<l;j++){
          B[i][j] = scanner.nextInt();
        }
      }

      for(int i=0;i<n;i++){
        for(int j=0;j<l;j++){
          C[i][j] = 0;
          for(int k=0;k<m;k++){
            C[i][j] = C[i][j] + (long)A[i][k]*B[k][j];
          }
        }
      }

      for(int i=0;i<n;i++){
        for(int j=0;j<l;j++){
          if(j==l-1){
            System.out.println(C[i][j]);
          }else{
            System.out.print(C[i][j] + " ");
          }
        }
      }

    }
}
