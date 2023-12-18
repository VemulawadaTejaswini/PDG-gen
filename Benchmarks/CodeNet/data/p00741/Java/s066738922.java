import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static int [][] map;
  static int width, height;
  static boolean [][] map_searched;
  static int[]dx = {0, -1, -1, -1, 0, 1, 1, 1}, dy = {1, 1, 0, -1, -1, -1, 0, 1};
	public static void main(String [] args){
    while(readMap()){
      System.out.println(solve());
    }
	}

  static int solve(){
    int cnt = 0;
    Deque <Integer> x = new ArrayDeque<Integer>();
    Deque <Integer> y = new ArrayDeque<Integer>();
    int current_x, current_y;
    int next_x, next_y, last_i = 0, last_j = 0;
    boolean s_flag = false;
    int loop = 0;
    for(int i = 0; i < height; i++){
      for(int j = 0; j < width; j++){
        if(map_searched[i][j]){
          continue;
        }
        x.offer(j);
        y.offer(i);
        while(!x.isEmpty()){
          current_x = x.poll();
          current_y = y.poll();
          map_searched[current_y][current_x] = true;
          for(int k = 0; k < dx.length; k++){
            next_x = current_x + dx[k];
            next_y = current_y + dy[k];
            if(next_x < 0 || next_x >= width || next_y < 0 || next_y >= height)continue;
            s_flag = true;
            if(map_searched[next_y][next_x]) continue;
            else{
              if(map[next_y][next_x] == map[current_y][current_y]){
                x.offer(next_x);
                y.offer(next_y);
              }else{
                map_searched[next_y][next_x] = true;
                continue;
              }
            }
          }
        }
        cnt++;
        last_i = i;
        last_j = j;
      }
    }
    if(last_i == 0 && last_j == 0 && map[last_i][last_j] == 0 && s_flag == false)cnt = 0;
    return cnt;
  }

  static boolean readMap(){
    width = sc.nextInt();
    height = sc.nextInt();
    map = new int[height][width];
    map_searched = new boolean[height][width];
    if(width == 0 && height == 0){
      return false;
    }else{
      for(int i = 0; i < height; i++){
        for(int j = 0; j < width; j++){
          map[i][j] = sc.nextInt();
        }
      }
      return true;
    }
  }
}
 