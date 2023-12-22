import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
    
    boolean s[][] = new boolean[H][W];
    int min[][] = new int[H][W];
    int black = 0;
    for (int i = 0; i < H; i++) {
      String str = sc.next();
      for (int j = 0; j < W; j++) {
        char input = str.charAt(j);
        if (input == '#') {
          black++;
          s[i][j] = false;
          min[i][j] = -1;
        } else {
          s[i][j] = true;
          min[i][j] = H * W;
        }
      }
    }
    min[0][0] = 1;
    boolean flag = true;
    while (flag) {
      flag = false;
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W - 1; j++) {
          if (s[i][j] && s[i][j + 1] && min[i][j] + 1 < min[i][j + 1]) {
            min[i][j + 1] = min[i][j] + 1;
            flag = true;
          }
        }
      }
      for (int j = 0; j < W; j++) {
        for (int i = 0; i < H - 1; i++) {
          if (s[i][j] && s[i + 1][j] && min[i][j] + 1 < min[i + 1][j]) {
            min[i + 1][j] = min[i][j] + 1;
            flag = true;
          }
        }
      }
      for (int i = 0; i < H; i++) {
        for (int j = W - 1; j > 0; j--) {
          if (s[i][j] && s[i][j - 1] && min[i][j] + 1 < min[i][j - 1]) {
            min[i][j - 1] = min[i][j] + 1;
            flag = true;
          }
        }
      }
      for (int j = 0; j < W; j++) {
        for (int i = H - 1; i > 0; i--) {
          if (s[i][j] && s[i - 1][j] && min[i][j] + 1 < min[i - 1][j]) {
            min[i - 1][j] = min[i][j] + 1;
            flag = true;
          }
        }
      }
    }
    
    if (min[H - 1][W - 1] == H * W) {
      System.out.println(-1);
    } else {
      System.out.println(H * W - black - min[H - 1][W - 1]);
    }
  }
}