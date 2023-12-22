import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] m = new char[H][W];
    for (int i = 0; i < H; i++) {
      String string = sc.next();
      for (int j = 0; j < W; j++) {
        m[i][j] = string.charAt(j);
      }
    }
    
    int[][] above = new int[H][W];
    int[][] below = new int[H][W];
    int[][] left = new int[H][W];
    int[][] right = new int[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (m[i][j] == '#') {
          above[i][j] = 0;
          left[i][j] = 0;
        } else {
          above[i][j] = (i == 0 ? 0 : above[i-1][j])+1;
          left[i][j] = (j == 0 ? 0 : left[i][j-1])+1;
        }
        if (m[H-1-i][j] == '#') {
          below[H-1-i][j] = 0;
        } else {
          below[H-1-i][j] = (i == 0 ? 0 : below[H-i][j])+1;
        }
        if (m[i][W-1-j] == '#') {
          right[i][W-1-j] = 0;
        } else {
          right[i][W-1-j] = (j == 0 ? 0 : right[i][W-j])+1;
        }
      }
    }
    
    int max = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (m[i][j] != '#') {
          int v = above[i][j]+below[i][j]+left[i][j]+right[i][j]-3;
          max = Math.max(max, v);
        }
      }
    }
    
    System.out.println(max);
  }
}