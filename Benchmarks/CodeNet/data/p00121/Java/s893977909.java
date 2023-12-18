import java.util.*;

public class Main{

    char[][] pzl;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            pzl = new char[2][4];
            int sx = 0, sy = 0;
            for(int i=0; i<2; i++){
                for(int j=0; j<4; j++){
                    String ss = sc.next();
                    pzl[i][j] = ss.charAt(0);
                    if(pzl[i][j]=='0'){
                        sx = j; sy = i;
                    }
                }
            }

            System.out.println(getmin(sx,sy));
        }
    }

    class P{
        String pzz;
        int x,y,cnt;
        P(String pzz, int x, int y, int cnt){
            this.pzz = pzz;
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    int getmin(int sx, int sy){
        PriorityQueue<P> 
            q = new PriorityQueue<P>(10, new Comparator<P>(){
                    public int compare(P p1, P p2){
                        return p1.cnt - p2.cnt;
                    }
                });
        String sss = String.valueOf(pzl[0])+String.valueOf(pzl[1]);
        q.add(new P(sss,sx,sy,0));
        boolean[] v = new boolean[7654322];
        while(q.size()>0){
            P pp = q.poll();
            String pzz = pp.pzz;
            int x = pp.x, y = pp.y, cnt = pp.cnt;

            int num = Integer.parseInt(pzz.substring(0,7));
            if(v[num]) continue;
            if(pzz.equals("01234567")) return cnt;
            v[num] = true;

            char[][] c = {pzz.substring(0,4).toCharArray(),
                          pzz.substring(4,8).toCharArray()};

            for(int i=0; i<4; i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx>=4 || ny<0 || ny>=2) continue;
                c[y][x] = c[ny][nx];
                c[ny][nx] = '0';
                String ns = String.valueOf(c[0])+String.valueOf(c[1]);
                q.add(new P(ns,nx,ny,cnt+1));
                c[ny][nx] = c[y][x];
                c[y][x] ='0';
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}