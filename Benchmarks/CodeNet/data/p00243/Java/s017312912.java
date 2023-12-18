import java.util.*;

public class Main{

    int w,h;
    char[][] tile;
    char[] color = {'R','G','B'};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            tile = new char[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    String s = sc.next();
                    tile[i][j] = s.charAt(0);
                }
            }

            System.out.println(bfs());
        }
    }

    class P{
        char[][] t;
        int c;
        P(char[][] t, int c){
            this.t = t;
            this.c = c;
        }
    }

    int bfs(){
        Queue<P> q = new LinkedList<P>();
        q.add(new P(tile,0));

        while(q.size()>0){
            P p = q.poll();
            char[][] t = p.t;
            int c = p.c;

            for(int i=0; i<3; i++){
                if(t[0][0]==color[i]) continue;
                char[][] tmp = new char[h][w];
                bfs2(t,tmp,color[i]);
                int cnt = 0;
                for(int k=0; k<h; k++){
                    for(int j=0; j<w; j++){
                        if(tmp[k][j]==color[i]) cnt++;
                    }
                }

                if(cnt==h*w) return c+1;
                q.add(new P(tmp,c+1));
            }
        }

        return -1;
    }

    int[] dx = {1,0};
    int[] dy = {0,1};

    void bfs2(char[][] t, char[][] tmp, char c){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                tmp[i][j] = t[i][j];
            }
        }

        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{0,0});

        int cnt = 0;
        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1];

            tmp[y][x] = c;

            for(int i=0; i<2; i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx>=0 && nx<w && ny>=0 && ny<h 
                   && t[ny][nx]==t[0][0]){
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}