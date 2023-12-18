import java.util.*;

public class Main{
    static int w, h;
    static int[][] t;
    static int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};

    static void dfs(int x, int y){
        t[y][x] = 0;

        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || w <= nx || ny < 0 || h <= ny || t[ny][nx] == 0) continue;

            dfs(nx, ny);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0) break;

            t = new int[h][w];

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    t[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(t[i][j] == 1){
                        dfs(j, i);
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}