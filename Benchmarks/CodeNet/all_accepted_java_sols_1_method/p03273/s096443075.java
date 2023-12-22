import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt(); 
    char[][] a = new char[H][W];
    boolean[] checkRow = new boolean[H];
    boolean[] checkColumn = new boolean[W];
    for (int i=0; i<H; i++) {
      String S = sc.next();
      for (int j=0; j<W; j++) {
        a[i][j] = S.charAt(j);
      }
    }
    for (int i=0; i<H; i++) {
      for (int j=0; j<W; j++) {
        if(a[i][j] == '#') {
          checkRow[i] = true;
          checkColumn[j] = true;
        }
      }
    }
    for (int i=0; i<H; i++) {
      boolean check = false;
      for (int j=0; j<W; j++) {
        if(checkRow[i] && checkColumn[j]) {
          check = true;
          System.out.print(a[i][j]);
        }
      }
      if (check) System.out.println();
    }
  }
}