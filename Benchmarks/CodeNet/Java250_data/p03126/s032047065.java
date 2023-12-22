import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] suki = new int[n][m];
    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();
      for(int j = 0; j < k; j++) {
        int r = sc.nextInt() - 1;
        suki[i][r]++;  
      }
    }
    int ans = 0;
    for(int j = 0; j < m; j++) {
      int p = 1;
      for(int i = 0; i < n; i++) {
        if(suki[i][j] == 0) p = 0;
      }
      if(p == 1) ans++; 
    }
    System.out.println(ans);
  }
}