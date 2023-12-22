import java.util.*;
 
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] a = new int[n][m];
      for (int i = 0; i < n; i++) {
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      int[] list = new int[m+1];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (a[i][j] > 0) {
            list[a[i][j]] += 1;
          }
        }
      }
      int ans = 0;
      for (int i = 0; i < m+1; i++) {
        if (list[i] == n) {
          ans++;
        }
      }
      System.out.println(ans);
    }
  }