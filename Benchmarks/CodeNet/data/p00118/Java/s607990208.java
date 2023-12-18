import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static char [][] map;
  static char tmp_fruit;
  static int [] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
  static int H;
  static int W;
  static int ans;

	public static void main(String [] args){
    while(solve()){
      System.out.println(ans);
    }
	}

  static boolean solve(){
    H = sc.nextInt();
    W = sc.nextInt();
    if(H == 0 && W == 0)return false;
    readMap();
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(map[i][j] == '.') continue;
        ans++;
        dfs(j, i, 0);
      }
    }
    return true;
  }

  static void dfs(int x, int y, int node){
    tmp_fruit = map[y][x];
    map[y][x] = '.';
    for(int i = 0; i < dx.length ; i++){
      if(check(x + dx[i], y + dy[i])){
        if(map[y + dy[i]][x + dx[i]] == tmp_fruit){
          dfs(x + dx[i], y + dy[i], node + 1);
        }
      }
    }
    return;
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