import java.util.*;

public class Main{

    int w,h;
    int[][] map;
    int sx,sy,gx,gy;
    int ans;
    int[] dx = {0,1,0,-1};
    int[] dy = {-1,0,1,0};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    map[i][j] = sc.nextInt();
                    if(map[i][j]==2){
                        sx = j;
                        sy = i;
                    }
                    if(map[i][j]==3){
                        gx = j;
                        gy = i;
                    }
                }
            }

            ans = Integer.MAX_VALUE;
            dfs(sx,sy,0);

            if(ans==Integer.MAX_VALUE) ans = -1;
            System.out.println(ans);
        }
    }

    void dfs(int x, int y, int cnt){
        if(cnt>10) return;
        if(x==gx && y==gy){
            ans = Math.min(ans,cnt);
            return;
        }

        int nx = x, ny = y;
        for(int i=0; i<4; i++){
            nx = x+dx[i]; ny = y+dy[i];
            if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]==1) continue;
            while(true){
                if(nx+dx[i]<0 || nx+dx[i]>=w || ny+dy[i]<0 || ny+dy[i]>=h || map[ny+dy[i]][nx+dx[i]]==1) break;
                nx += dx[i];
                ny += dy[i];
            }
            boolean change = false;
            if(nx+dx[i]>=0 && nx+dx[i]<w && ny+dy[i]>=0 && ny+dy[i]<h && map[ny+dy[i]][nx+dx[i]]==1){
                map[ny+dy[i]][nx+dx[i]] = 0;
                change = true;
            }
            dfs(nx,ny,cnt+1);
            if(change) map[ny+dy[i]][nx+dx[i]] = 1;
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}