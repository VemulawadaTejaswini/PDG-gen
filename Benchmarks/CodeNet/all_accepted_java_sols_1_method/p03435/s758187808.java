import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] c = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = sc.nextInt();
      }
    }

    sc.close();

    int b0b1_1 = c[0][0] - c[0][1];
    int b1b2_1 = c[0][1] - c[0][2];

    int b0b1_2 = c[1][0] - c[1][1];
    int b1b2_2 = c[1][1] - c[1][2];
    
    int b0b1_3 = c[2][0] - c[2][1];
    int b1b2_3 = c[2][1] - c[2][2];
    
    int a0a1_1 = c[0][0] - c[1][0];
    int a1a2_1 = c[1][0] - c[2][0];
    
    int a0a1_2 = c[0][1] - c[1][1];
    int a1a2_2 = c[1][1] - c[2][1];
    
    int a0a1_3 = c[0][2] - c[1][2];
    int a1a2_3 = c[1][2] - c[2][2];

    String result = "No";

    if (b0b1_1 == b0b1_2 && b0b1_2 == b0b1_3) {
      if (b1b2_1 == b1b2_2 && b1b2_2 == b1b2_3) {
        if (a0a1_1 == a0a1_2 && a0a1_2 == a0a1_3) {
          if (a1a2_1 == a1a2_2 && a1a2_2 == a1a2_3) {
            result = "Yes";
          }
        }
      }
    }

    System.out.println(result);

  }

}