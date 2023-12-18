import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    boolean [][] board = new boolean[W][H];
    int count =0;
    for (int i=0; i<W; i++) {
      for (int j=0; j<H; j++) {
        board[i][j] = false;
      }
    }
    while (sc.hasNext()) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      switch (a) {
        case 1:
          for(int i=0; i<x; i++) {
            for(int j=0; j<H; j++) {
              board[i][j] = true;
            }
          }
          break; 
        case 2:
          for(int i=x; i<W; i++) {
            for(int j=0; j<H; j++) {
              board[i][j] = true;
            }
          } 
          break;
        case 3:
          for(int i=0; i<W; i++) {
            for(int j=0; j<y; j++) {
              board[i][j] = true;
            }
          } 
          break;
        case 4:
          for(int i=0; i<W; i++) {
            for(int j=y; j<H; j++) {
              board[i][j] = true;
            }
          } 
          break;
        default: break;
      }
    }
    for (int i=0; i<W; i++) {
      for (int j=0; j<H; j++) {
        if (board[i][j] == true) count++;
      }
    }
    System.out.println(W * H - count);
  }
}