import java.util.*;

public class Main{

    int w,h;
    char[][] map;
    int[][] map2;
    boolean B,W;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int idx;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new char[h][w];
            for(int i=0; i<h; i++){
                String line = sc.next();
                map[i] = line.toCharArray();
            }
        
            ArrayList<Integer> black = new ArrayList<Integer>();
            ArrayList<Integer> white = new ArrayList<Integer>();
            map2 = new int[h][w];
            idx = 1;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j]=='.'){
                        B = false;
                        W = false;
                        bfs(j,i);
                        if(B && !W) black.add(idx);
                        if(!B && W) white.add(idx);
                        idx++; 
                    }
                }
            }

            int bsum = 0, wsum = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(black.contains(map2[i][j])) bsum++;
                    if(white.contains(map2[i][j])) wsum++;
                }
            }

            System.out.println(bsum+" "+wsum);
        }
    }

    void bfs(int sx, int sy){
        LinkedList<int[]> list = new LinkedList<int[]>();
        list.add(new int[]{sx,sy});
        boolean[][] v = new boolean[h][w];

        while(list.size()>0){
            int[] xy = list.poll();
            int x = xy[0], y = xy[1];

            if(v[y][x]) continue;
            v[y][x] = true;

            map2[y][x] = idx;
            map[y][x] = 'x';

            for(int i=0; i<4; i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                if(map[ny][nx]=='.'){
                    list.add(new int[]{nx,ny});
                }else if(map[ny][nx]=='B') B = true;
                else if(map[ny][nx]=='W') W = true;
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}