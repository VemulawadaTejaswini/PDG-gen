import java.util.*;
public class Main{
    /*
      .0.
      3.1
      .2.
    */
    int[][] dx = {{0,1,0,-1,0},
                  {1,0,-1,0,0},
                  {0,-1,0,1,0},
                  {-1,0,1,0,0}};
    int[][] dy = {{-1,0,1,0,0},
                  {0,1,0,-1,0},
                  {1,0,-1,0,0},
                  {0,-1,0,1,0}};
    int[][][] memo;
    int w;
    int h;
    int[][] s;
    int[] cost;

    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
        w = sc.nextInt();
        h = sc.nextInt();
        if(w == 0 && h == 0){
            break;
        }
        s = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int ii = 0; ii < w; ii++){
                s[i][ii] = sc.nextInt();
            }
        }
        cost = new int[4];
        for(int i = 0; i < 4; i++){
            cost[i] = sc.nextInt();
        }
        memo = new int[h][w][4];
        for(int i = 0; i < h; i++){
            for(int ii = 0; ii < w; ii++){
                Arrays.fill(memo[i][ii], Integer.MAX_VALUE);
            }
        }
        DFS(0,0,1,0);
        //System.out.println(Arrays.toString(memo[h-1][w-1]));
        int ans = Integer.MAX_VALUE;
        for(int m: memo[h-1][w-1]){
            ans = Math.min(ans, m);
        }
        System.out.println(ans);
        }
    }
    void DFS(int x, int y, int dir, int total_cost){
        if(x < 0 || w <= x || y < 0 || h <= y){
            return;
        }
        if(memo[y][x][dir] <= total_cost){
            return;
        }
        memo[y][x][dir] = total_cost;
        
        //パネルに従う
        int cur = s[y][x];
        DFS(x + dx[dir][cur], y + dy[dir][cur], (dir + cur) % 4, total_cost);
        
        //指示を出す
        for(int command = 0; command < 4; command++){
            DFS(x + dx[dir][command], y + dy[dir][command], (dir + command) % 4, total_cost + cost[command]);
        }
    }   
    public static void main(String[] args){
        new Main().run();
    }
}
    