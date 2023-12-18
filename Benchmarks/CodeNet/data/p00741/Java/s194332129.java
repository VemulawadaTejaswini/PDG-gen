import java.util.*;

class Main{

    int w, h;
    int[][] map;
    int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++) map[i][j] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j]==1){
                        bfs(j, i);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    void bfs(int sx, int sy){
        LinkedList<int[]> list = new LinkedList<int[]>();
        list.add(new int[]{sx, sy});
        map[sy][sx] = 0;

        while(list.size()>0){
            int[] xy = list.poll();
            int x = xy[0], y = xy[1];

            for(int i=0; i<8; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]==0) continue;
                list.add(new int[]{nx, ny});
                map[ny][nx] = 0;
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}