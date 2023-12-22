import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String[] linesp = line.split(" ");
      int n = Integer.parseInt(linesp[0]);
      int m = Integer.parseInt(linesp[1]);
      int[][] mat = new int[n][m];
      for(int i = 0; i < n; i++) {
        String line1 = sc.nextLine();
        String[] line1sp = line1.split(" ");
        for(int j = 0; j < m; j++) {
            mat[i][j] = Integer.parseInt(line1sp[j]);
        }
      }
      int[] b = new int[m];
      for(int i = 0; i < m; i++) {
          String line2 = sc.nextLine();
          b[i] = Integer.parseInt(line2);
      }
      
      for(int i = 0; i < n; i++) {
          int ans = 0;
          for(int j = 0; j < m; j++) {
              ans += b[j] * mat[i][j];
          }
          System.out.println(ans);
      }
  }
}
