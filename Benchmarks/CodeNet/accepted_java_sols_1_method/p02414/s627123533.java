// Problem Matrix Maltiple

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Config
    Scanner sc = new Scanner(System.in);

    // Input
    String[] rowIn = sc.nextLine().split(" ");
    int n = Integer.parseInt(rowIn[0]);
    int m = Integer.parseInt(rowIn[1]);
    int l = Integer.parseInt(rowIn[2]);

    // Initialization
    int[][] A = new int[n][m];
    int[][] B = new int[m][l];
    long[][] C = new long[n][l];
    for(int i=0; i<n; i++){
      String[] tmp = sc.nextLine().split(" ");
      for(int j=0; j<m; j++){
        A[i][j] = Integer.parseInt(tmp[j]);
      }
    }
    for(int i=0; i<m; i++){
      String[] tmp = sc.nextLine().split(" ");
      for(int j=0; j<l; j++){
        B[i][j] = Integer.parseInt(tmp[j]);
      }
    }

    // Matrix Multiple
    for(int i=0; i<n; i++){
      for(int j=0; j<l; j++){
        long tmp = 0;
        for(int k=0; k<m; k++){
          tmp += A[i][k] * B[k][j];
        }
        C[i][j] = tmp;
      }
    }

    // Output
    for(int i=0; i<n; i++){
      for(int j=0; j<l-1; j++){
        System.out.print(C[i][j] + " ");
      }
      System.out.print(C[i][l-1]);
      System.out.println();
    }
  }
}

