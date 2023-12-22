import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split("[\\s]+");
    int H = Integer.parseInt(input[0]);
    int W = Integer.parseInt(input[1]);
    String[][] a = new String[H][W];
    int[] rowCount = new int[W];
    int[] colCount = new int[H];
    for(int i = 0; i < W; i++) {
      rowCount[i] = 0;
    }
    for(int i = 0; i < H; i++) {
      colCount[i] = 0;
    }
    for(int i = 0; i < H; i++) {
      String col = sc.nextLine();
      for(int j = 0; j < W; j++) {
        a[i][j] = col.substring(j,j+1);
      }
    }
    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++) {
        if(a[i][j].equals(".")) {
          rowCount[j] += 1;
          colCount[i] += 1;
        }
      }
    }
    for(int i = 0; i < H; i++) {
      if(colCount[i] == W) {
        continue;
      }
      for(int j = 0; j < W; j++) {
        if(rowCount[j] == H) { continue; }
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }
}