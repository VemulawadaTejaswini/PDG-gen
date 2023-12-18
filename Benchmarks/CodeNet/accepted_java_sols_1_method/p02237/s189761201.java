import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  public static void main(String[] args) {
    int i, j, k;
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int mat[][] = new int[n][n];
    for (i=0; i<n; i++) {
      int u = Integer.parseInt(sc.next());
      k = Integer.parseInt(sc.next());
      for (j=0; j<k; j++) {
        int v = Integer.parseInt(sc.next());
        mat[u-1][v-1] = 1; 
      }
    }

    for (i=0; i<n; i++)
      for (j=0; j<n; j++)
        System.out.print(String.valueOf(mat[i][j]) + ( (j==n-1) ? '\n' : ' '));
  }
}