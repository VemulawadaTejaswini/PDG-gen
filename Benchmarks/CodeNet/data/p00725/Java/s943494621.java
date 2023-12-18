import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int sx = 0, sy = 0;
    static int ans = 11;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] field;
    static int w;
    static int h;

    public static int dfs(int x, int y, int m) {
        for (int dir = 0; dir < 4; dir++) {
            int nh = y;
            int nw = x;
            for(int i = 0; i < 21; i++){
                nh = nh + dy[dir];
                nw = nw + dx[dir];
                if(nh < 0 || nh >= h || nw < 0 || nw >= w) break;
                if(i==0 && field[nh][nw] == 1) break;

                if(field[nh][nw] == 1){
                    field[nh][nw] = 0;
                    nh = nh - dy[dir];
                    nw = nw - dx[dir];
                    if(m<=10)dfs(nw, nh, m + 1);
                    nh = nh + dy[dir];
                    nw = nw + dx[dir];
                    field[nh][nw] = 1;
                    break;
                }
                if(field[nh][nw] == 3){
                    if(m < ans) ans = m;
                    break;
                }
            }
        }
        return ans;
    }

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            ans = 11;
            if(w == 0&&h == 0) break;
            field = new int[h][w];

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    field[i][j] = sc.nextInt();
                    if(field[i][j] == 2){
                        sx = j;
                        sy = i;
                    }
                }
            }

            int m = 1;
            int t = dfs(sx, sy, m);
            
            if(t <= 10) System.out.println(t);
            else System.out.println(-1);
    
        }
        
        sc.close();
    }
}

