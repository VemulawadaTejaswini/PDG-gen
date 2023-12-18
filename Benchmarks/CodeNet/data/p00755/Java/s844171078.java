import java.util.*;

class Main{

    int h, w, c;
    int[][] p, p2;
    int[] num = new int[5];

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            h = sc.nextInt(); w = sc.nextInt(); c = sc.nextInt();
            if(h==0 && w==0 && c==0) break;

            p = new int[h][w];
            for(int i=0; i<h; i++)
                for(int j=0; j<w; j++) p[i][j] = sc.nextInt();

            System.out.println(rec(0));
            System.gc();
        }
    }

    int rec(int cnt){
        if(cnt==5){
            if(num[4]!=c) return 0;
            p2 = new int[h][w];
            for(int i=0; i<h; i++)
                for(int j=0; j<w; j++) p2[i][j] = p[i][j];
            for(int i=0; i<5; i++){
                if(num[i]==p2[0][0]) continue;
                changeColor(num[i]);
            }
            int cc = changeColor(num[4]);
            return cc;
        }
        int res = 0;
        for(int i=1; i<=6; i++){
            num[cnt] = i;
            res = Math.max(res, rec(cnt + 1));
        }
        return res;
    }

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    int changeColor(int color){
        int before = p2[0][0];
        LinkedList<int[]> q = new LinkedList<int[]>();
        p2[0][0] = color;
        q.add(new int[]{0, 0});
        boolean[][] v = new boolean[h][w];

        int cnt = 0;
        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1];

            if(v[y][x]) continue;
            v[y][x] = true;
            cnt++;

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || p2[ny][nx]!=before || v[ny][nx]) continue;
                p2[ny][nx] = color;
                q.add(new int[]{nx, ny});
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}