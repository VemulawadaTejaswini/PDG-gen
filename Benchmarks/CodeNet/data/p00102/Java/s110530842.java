import java.util.*;

public class Main {
 Scanner sc = new Scanner(System.in);
 void run() {
  while (true) {
   int n = sc.nextInt();
   if (n == 0) break;
   int[][] mat = new int[n+1][n+1];
   for (int i=0;i<n;i++) for (int j=0;j<n;j++) {
    mat[i][j] = sc.nextInt();
    mat[i][n] = mat[i][j];
    mat[n][j] = mat[i][j];
   }
   for( int i=0;i<n+1;i++) {for(int j=0;j<n+1;j++) {
    System.out.printf("%5d",mat[i][j]);
   }
   System.out.println();
   }
  }
 }
 public static void main(String[] args) {
  new Main().run();
 }
}