import java.util.*;

class Main{
    int h, w;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    char[][] map;

    void solve(){
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt(); w = sc.nextInt(); int n = sc.nextInt();
        map = new char[h][w];
        int[][] zahyo = new int[n+1][2];
        int sx = 0, sy = 0;
        for(int i=0; i<h; i++){
            char[] line = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                map[i][j] = line[j];
                if(map[i][j]=='S') {sx = j; sy = i;}
                if(Character.isDigit(map[i][j])) zahyo[map[i][j]-'0'] = new int[]{j, i};
            }
        }

        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i==1) sum += bfs(sx, sy, zahyo[i][0], zahyo[i][1]);
            else sum += bfs(zahyo[i-1][0], zahyo[i-1][1], zahyo[i][0], zahyo[i][1]);
        }
        System.out.println(sum);
    }

    int bfs(int sx, int sy, int gx, int gy){
        LinkedList<int[]> q = new LinkedList<int[]>();
        boolean[][] v = new boolean[h][w];
        q.add(new int[]{sx, sy, 0});

        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1], cnt = qq[2];

            if(x==gx && y==gy) return cnt;
            if(v[y][x]) continue;
            v[y][x] = true;

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]=='X') continue;
                q.add(new int[]{nx, ny, cnt+1});
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}