import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static int ans;
  static char[][] map;
  static int width, height;

  public static void main(String [] args){
    while(true){
      ans = 0;
      width = sc.nextInt();
      height = sc.nextInt();
      if(width == 0 && height ==0) break;
      int x = 0, y = 0;
      map = new char[height][width];
      char[] line = new char[width];
      for(int i = 0; i < height; i++){
        line = sc.next().toCharArray();
        for(int j = 0; j < width; j++){
          map[i][j] = line[j];
          if(line[j] == '@'){
            x = j;
            y = i;
          }
        }
      }
      dfs(x, y);
      System.out.println(ans);
    }
  }
static void dfs(int x, int y){
    ans++;
    int next_x, next_y;
    int[] dx = {0, -1 ,0 ,1}, dy = {1, 0, -1, 0};
    for(int i = 0; i < dx.length; i++){
      next_x = x + dx[i];
      next_y = y + dy[i];
      if(next_x < 0 || next_x >= width || next_y < 0 || next_y >= height) continue;
      else if(map[next_y][next_x] != '.') continue;
      map[next_y][next_x] = 'a';
      dfs(next_x, next_y);
    }
    return ;
  }
}