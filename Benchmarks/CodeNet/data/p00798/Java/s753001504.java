import java.util.*;

class Main{

    int w, h;
    int[][] map;
    int gx, gy;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new int[h][w];
            int sxc = 0, syc = 0, sxm = 0, sym = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    map[i][j] = sc.nextInt();
                    if(map[i][j]==2){ map[i][j] = 0; sxc = j; syc = i; }
                    if(map[i][j]==4){ map[i][j] = 0; sxm = j; sym = i; }
                    if(map[i][j]==3){ gx = j; gy = i; }
                }
            }
            System.out.println(bfs(sxc, syc, sxm, sym));
        }
    }

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int bfs(int sxc, int syc, int sxm, int sym){
        //cargo's pos, man's pos, cnt
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{sxc, syc, sxm, sym, 0});
        boolean[][][][] v = new boolean[h][w][h][w];

        while(q.size()>0){
            int[] qq = q.poll();
            int xc = qq[0], yc = qq[1], xm = qq[2], ym = qq[3], cnt = qq[4];

            if(xc==gx && yc==gy) return cnt;
            if(v[yc][xc][ym][xm]) continue;
            v[yc][xc][ym][xm] = true;

            for(int i=0; i<4; i++){
                int nx = xc + dx[i], ny = yc + dy[i];
                int mx = xc - dx[i], my = yc - dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]==1) continue;
                if(mx<0 || mx>=w || my<0 || my>=h || map[my][mx]==1) continue;
                if(check(xm, ym, mx, my, xc, yc)) q.add(new int[]{nx, ny, xc, yc, cnt+1});
            }
        }

        return -1;
    }

    boolean check(int x1, int y1, int x2, int y2, int x3, int y3){
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{x1, y1});
        boolean[][] v = new boolean[h][w];

        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1];

            if(x==x2 && y==y2) return true;
            if(v[y][x]) continue;
            v[y][x] = true;

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h 
                   || map[ny][nx]==1 || (nx==x3 && ny==y3)) continue;
                q.add(new int[]{nx, ny});
            }
        }

        return false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}