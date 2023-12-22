import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] c = new int[4][4];
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        c[i][j] = sc.nextInt();
      }
    }
    int a1 = 0;
    int b1 = c[1][1] - a1;
    int b2 = c[1][2] - a1;
    int b3 = c[1][3] - a1;
    
    boolean ans = 
         c[2][1] - b1 == c[2][2] - b2
      && c[2][2] - b2 == c[2][3] - b3
      && c[3][1] - b1 == c[3][2] - b2
      && c[3][2] - b2 == c[3][3] - b3;
    
    System.out.println(ans ? "Yes" : "No");
  }
}