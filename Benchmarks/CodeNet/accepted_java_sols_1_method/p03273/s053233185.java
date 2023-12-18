import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < W; j++) {
        map[i][j] = line.charAt(j);
      }
    }
    
    // scan H
    int offsetH = 0;
    for(int i = 0; i < H; i++) {
      boolean allWhite = true;
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '#') {
          allWhite = false;
        }
        map[i-offsetH][j] = map[i][j];
      }
      if (allWhite) {
        offsetH++;
      }
    }

    // scan W
    int offsetW = 0;
    for(int j = 0; j < W; j++) {
      boolean allWhite = true;
      for (int i = 0; i < H; i++) {
        if (map[i][j] == '#') {
          allWhite = false;
        }
        map[i][j-offsetW] = map[i][j];
      }
      if (allWhite) {
        offsetW++;
      }
    }

    for (int i = 0; i < H-offsetH; i++) {
      for (int j = 0; j < W-offsetW; j++) {
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
  }
}