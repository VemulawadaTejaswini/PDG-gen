import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    StringBuilder bl = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int u = 0;
    int k = 0;
    int v = 0;
    int M[][] = new int[n][n];

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        M[i][j] = 0;
      }
    }

    for(int i = 0; i<n; i++){
      u = sc.nextInt();
      k = sc.nextInt();
      for(int j =0; j<k; j++){
        v = sc.nextInt();
        M[u-1][v-1] = 1;
      }
    }

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(j!=0)bl.append(" ");
        bl.append(M[i][j]);
      }
      bl.append("\n");
    }
    System.out.print(bl);
  }
}
