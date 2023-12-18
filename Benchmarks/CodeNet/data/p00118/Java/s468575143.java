import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static char [][] map;
  static char ch;
  static int H;
  static int W;
  static int ans;

	public static void main(String [] args){
    while(solve()){
      System.out.println(ans);
    }
	}

  static boolean solve(){
    ans = 0;
    int tmp_x, tmp_y;
    int [] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
    H = sc.nextInt();
    W = sc.nextInt();
    if(H == 0 && W == 0)return false;
    readMap();
    Deque <Integer> x = new ArrayDeque <Integer>();
    Deque <Integer> y = new ArrayDeque <Integer>();
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(map[i][j] == '.') continue;
        x.offer(j);
        y.offer(i);
        while(!x.isEmpty()){
          tmp_x = x.poll();
          tmp_y = y.poll();
          ch = map[tmp_y][tmp_x];
          map[tmp_y][tmp_x] = '.';
          for(int k = 0; k < dx.length; k++){
            if(!check(tmp_x + dx[k], tmp_y + dy[k]))continue;
            if(ch == '.') continue;
            else if(ch == map[tmp_y + dy[k]][tmp_x + dx[k]]){
              x.offer(tmp_x + dx[k]);
              y.offer(tmp_y + dy[k]);
            }
          }
        }
        ans++;
      }
    }
    return true;
  }

  static boolean check(int x, int y){
    if(x < 0 || W <= x || y < 0 || H <= y) return false;
    else return true;
  }

  static void readMap(){
    map = new char[H][W];
    for(int i = 0; i < H; i++){
      map[i] = sc.next().toCharArray();
    }
    return;
  }
}