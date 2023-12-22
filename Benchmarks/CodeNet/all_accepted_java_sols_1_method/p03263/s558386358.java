import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int[][] grid = new int[h][w];
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          grid[i][j] = sc.nextInt();
        }
      }
      List<String> res = new ArrayList<>();
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(grid[i][j] % 2 == 0) continue;
          if(j == w - 1) {
            if(i < h - 1) {
                grid[i+1][j]++;
                res.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
            }
                
        } else {
            grid[i][j]--;
            grid[i][j+1]++;
            res.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
          }
        }
      }
      System.out.println(res.size());
      for(String s : res)
         System.out.println(s);
  }
}