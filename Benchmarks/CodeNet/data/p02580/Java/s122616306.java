
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        int[] rows = new int[h];
        int[] cols = new int[w];
        
        int[][] grid = new int[h][w];
        
        for(int i = 0; i<m ; i++) {
          int x = sc.nextInt()-1;
          int y = sc.nextInt()-1;
          grid[x][y] = 1;
          rows[x]++;
          cols[y]++;
        }
        
        int out = 0;
        for(int i = 0; i<h; i++) {
          for(int j = 0; j<w; j++) {
            int possible = rows[i]+cols[j];
            if(grid[i][j] == 1) possible--;
            out = Math.max(out, possible);
          }
        }
        
        System.out.println(out);
    }
}