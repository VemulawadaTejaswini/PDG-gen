import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] c = new int[3][3];
    int max =0;
    for (int i =0; i<3; i++) {
      for (int j =0; j<3; j++) {
        c[i][j] = sc.nextInt();
        max = Math.max(c[i][j],max);
      }
    }
    for (int i =0; i<=max; i++) {
      for (int j =0; j<=max; j++) {
        for (int k =0; k<=max; k++) {
          if (c[1][0] - c[0][0] == j - i && c[1][0] - c[2][0] == j - k) {
            if (c[1][1] - c[0][1] == j - i && c[1][1] - c[2][1] == j - k) {
              if (c[1][2] - c[0][2] == j - i && c[1][2] - c[2][2] == j - k) {
                System.out.println("Yes");
                return;
              }
            }
          }
        }
      }
    }     
    System.out.println("No");  
  }
}    