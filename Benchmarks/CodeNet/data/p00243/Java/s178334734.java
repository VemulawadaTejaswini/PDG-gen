import java.util.*;

public class Main{

    int w,h;
    int[][] tile;
    char[] color = {'R','G','B'};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            tile = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    String s = sc.next();
                    char c = s.charAt(0);
                    for(int k=0; k<3; k++){
                        if(c==color[k]) tile[i][j] = k;
                    }
                }
            }

            int cnt = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(tile[i][j]==tile[0][0]) cnt++;
                }
            }

            if(cnt==h*w) System.out.println(0);
            else System.out.println(bfs());
        }
    }

    int bfs(){
        Queue<int[][]> q = new LinkedList<int[][]>();
        q.add(tile);

        while(q.size()>0){
            int[][] t = q.poll();
            int c = t[0][0]/10;
            t[0][0] -= c*10;

            for(int i=0; i<3; i++){
                if(color[t[0][0]]==color[i]) continue;

                int[][] tmp = new int[h][w];
                bfs2(t,tmp,i);
                int cnt = 0;
                for(int k=0; k<h; k++){
                    for(int j=0; j<w; j++){
                        if(color[tmp[k][j]]==color[i]) cnt++;
                    }
                }

                if(cnt==h*w) return c+1;
                tmp[0][0] += (c+1)*10;
                q.add(tmp);
            }
        }

        return -1;
    }

    int[] dx = {1,0};
    int[] dy = {0,1};

    void bfs2(int[][] t, int[][] tmp, int c){
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