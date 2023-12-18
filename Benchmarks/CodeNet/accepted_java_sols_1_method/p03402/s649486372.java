
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt() - 1;
    int b = sc.nextInt() - 1;
    String[][] grid = new String[100][100];
    for(int i = 0; i < 50; i++) {
      for(int j = 0; j < 100; j++) {
        grid[i][j] = ".";
      }
    }
    for(int i = 50; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        grid[i][j] = "#";
      }
    }
    for(int i = 0; i < 50; i += 2) {
      for(int j = 0; j < 100; j += 2) {
        if(b > 0) {
          b--;
          grid[i][j] = "#";
        }
      }
    }
    for(int i = 51; i < 100; i += 2) {
      for(int j = 0; j < 100; j += 2) {
        if(a > 0) {
          a--;
          grid[i][j] = ".";
        }
      }
    }
    System.out.println(100 + " " + 100);
    for(int i = 0; i < 100; i++) {
      String ans = "";
      for(int j = 0; j < 100; j++) {
        ans += grid[i][j];
      }
      System.out.println(ans);
    }
  }
}
