import java.util.*;

class Main{

    int h, w, c;
    int max;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            h = sc.nextInt(); w = sc.nextInt(); c = sc.nextInt();
            if(h==0 && w==0 && c==0) break;

            int[][] p = new int[h][w];
            for(int i=0; i<h; i++)
                for(int j=0; j<w; j++) p[i][j] = sc.nextInt();

            max = 0;
            rec(p, 0);
            System.out.println(max);
        }
    }

    void rec(int[][] p, int cnt){
        if(p[0][0]==c){
            //p = changeColor(p, c);
            max = Math.max(max, countColor(p));
        }
        if(cnt==5) return; 

        for(int i=1; i<=6; i++){
            if(i==p[0][0]) continue;
            int[][] p2 = new int[h][w];
            for(int j=0; j<h; j++)
                for(int k=0; k<w; k++) p2[j][k] = p[j][k];
            //System.out.println("cnt:"+cnt+" color:"+i);
            p2 = changeColor(p2, i);
            rec(p2, cnt + 1);
        }
    }

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    int[][] changeColor(int[][] p, int color){
        /*
        System.out.println("before");
        for(int i=0; i<h; i++)
            System.out.println(Arrays.toString(p[i]));
        */
        int before = p[0][0];
        LinkedList<int[]> q = new LinkedList<int[]>();
        p[0][0] = color;
        q.add(new int[]{0, 0});
        boolean[][] v = new boolean[h][w];

        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1];

            if(v[y][x]) continue;
            v[y][x] = true;

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || p[ny][nx]!=before) continue;
                p[ny][nx] = color;
                q.add(new int[]{nx, ny});
            }
        }
        /*
        System.out.println("after");
        for(int i=0; i<h; i++)
            System.out.println(Arrays.toString(p[i]));
        */
        return p;
    }
    int countColor(int[][] p){
        int target = p[0][0];
        LinkedList<int[]> q = new LinkedList<int[]>();
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
                if(nx<0 || nx>=w || ny<0 || ny>=h || p[ny][nx]!=target) continue;
                q.add(new int[]{nx, ny});
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}