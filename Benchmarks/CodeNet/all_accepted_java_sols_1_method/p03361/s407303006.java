import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] s = new String[H][W];
    
    for (int i = 0; i < H; i++) {
      String s_ = sc.next();
      s[i] = s_.split("");
    }

    sc.close(); 

    int[] p = {-1,1};

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {

        if (s[i][j].equals("#")) {

          String result = "No";

          for (int k = 0; k < 2; k++){
            if (0 <= j + p[k] && j + p[k] < W) {
              if (s[i][j+p[k]].equals("#")) {
                result = "Yes";
              }
            }
            if (0 <= i + p[k] && i + p[k] < H) {
              if (s[i+p[k]][j].equals("#")) {
                result = "Yes";
              }
            }
          }

          if (result == "No") {
            System.out.println("No");
            return;
          } 

        }

      }
    }

    System.out.println("Yes");
  
  }

}