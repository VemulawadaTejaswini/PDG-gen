import java.util.*;

public class Main{

    int w,h;
    char[][] map;
    int[][] d,dist;
    int[] x,y;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int n,goal,ans;
    boolean[] v;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new char[h][w];
            x = new int[11];
            y = new int[11];
            int idx = 1;
            for(int i=0; i<h; i++){
                String s = sc.next();
                map[i] = s.toCharArray();
                for(int j=0; j<w; j++){
                    if(map[i][j]=='o'){
                        x[0] = j; y[0] = i;
                    }else if(map[i][j]=='*'){
                        x[idx] = j; y[idx] = i;
                        idx++;
                    }
                }
            }

            dist = new int[idx][idx];
            for(int i=0; i<idx; i++){
                bfs(x[i],y[i]);
                for(int j=0; j<idx; j++){
                    dist[i][j] = d[y[j]][x[j]];
                }
            }

            n = idx;
            v = new boolean[idx];
            int min = Integer.MAX_VALUE;
            ans = Integer.MAX_VALUE;
            for(int i=1; i<idx; i++){
                ans = Integer.MAX_VALUE;
                goal = i;
                dfs(0,0,0);
                min = Math.min(min,ans);
            }

            if(min==Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(min);
        }
    }

    void bfs(int sx, int sy){
        LinkedList<int[]> list = new LinkedList<int[]>();
        list.add(new int[]{sx,sy});
        d = new int[h][w];
        for(int i=0; i<h; i++) Arrays.fill(d[i],Integer.MAX_VALUE);
        d[sy][sx] = 0;

        while(list.size()>0){
            int[] xy = list.poll();
            int xx = xy[0], yy = xy[1];

            for(int i=0; i<4; i++){
                int nx = xx+dx[i], ny = yy+dy[i];
                if(nx>=0 && nx<w && ny>=0 && ny<h
                   && d[ny][nx]==Integer.MAX_VALUE
                   && map[ny][nx]!='x'){
                    list.add(new int[]{nx,ny});
                    d[ny][nx] = d[yy][xx]+1;
                }
            }
        }
    }

    void dfs(int pos, int cnt, int distt){
        if(pos==goal){
            if(cnt==n-1) ans = Math.min(ans,distt);
            return;
        }

        for(int i=1; i<n; i++){
            if(v[i]) continue;
            v[i] = true;
            dfs(i,cnt+1,distt+dist[pos][i]);
            v[i] = false;
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}