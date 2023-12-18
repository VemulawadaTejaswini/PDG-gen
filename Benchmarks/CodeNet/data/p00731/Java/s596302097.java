import java.util.*;
import static java.lang.System.*;
public class Main {

    static class State implements Comparable<State>{
        int x, y, lr;
        int cost;
        State(int x, int y, int lr, int cost){
            this.x = x;
            this.y = y;
            this.lr = lr;
            this.cost = cost;
        }
        public int compareTo(State st){
            return this.cost - st.cost;
        }
    }
    static int w, h;
    static char[][] t;

    static int[][] dx;
    static int[][] dy;

    static {
        dx = new int[2][9];
        dy = new int[2][9];
        int cnt = 0;
        for(int i=1;i<=3;i++){
            for(int j=-2;j<=2;j++){
                if(Math.abs(i) + Math.abs(j) <= 3){
//                    out.println(i+" "+j);
                    dx[0][cnt] = i;
                    dy[0][cnt] = j;
                    dx[1][cnt] = i*(-1);
                    dy[1][cnt] = j;
                    cnt++;
                }
            }
        }
    }

    static void solve(){
        PriorityQueue<State> open = new PriorityQueue<State>();
        boolean[][][] closed = new boolean[h][w][2];
        State st = null;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(t[i][j] != 'S') continue;
                st = new State(j, i, 0, 0);
                open.add(st);
                st = new State(j, i, 1, 0);
                open.add(st);
            }
        }

        while(!open.isEmpty()){
            st = open.poll();
            if(closed[st.y][st.x][st.lr]) continue;
            closed[st.y][st.x][st.lr] = true;

            if(t[st.y][st.x] == 'T'){
                out.println(st.cost);
                return;
            }

            for(int i=0;i<9;i++){
                int nx, ny, nc;

                nx = st.x + dx[st.lr][i];
                ny = st.y + dy[st.lr][i];
                if(nx < 0 || w <= nx || ny < 0 || h <= ny) continue;
                nc = st.cost + t[ny][nx] - '0';

                if(t[ny][nx] == 'X') continue;
                if(t[ny][nx] == 'S' || t[ny][nx] == 'T') nc = nc - t[ny][nx] + '0';

                State ns = new State(nx, ny, (st.lr+1)%2, nc);

                open.add(ns);
            }
        }
        out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0) break;
            t = new char[h][w];

            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    t[i][j] = sc.next().charAt(0);
                }
            }

            solve();
        }

    }

}