import java.util.*;
import java.awt.Point;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    static int w, h;
    static boolean t[][][];
    static int U=0, R=1, D=2, L=3;
//    static int[] dx = {0, 1, 0, -1};
//    static int[] dy = {1, 0, -1, 0};

    static void solve(){
        LinkedList<Point> open = new LinkedList<Point>();
        boolean[][] closed = new boolean[h][w];
        Point st = new Point(0, 0);

        int cnt = 1;
        open.add(st);
        while(!open.isEmpty()){
            LinkedList<Point> next = new LinkedList<Point>();
            while(!open.isEmpty()){
                st = open.poll();

//                out.println(cnt+":"+st);

                int x = st.x;
                int y = st.y;

                if(x < 0 || x >= w || y < 0 || y >= h) continue;

                if(closed[y][x]) continue;
                closed[y][x] = true;

                if(st.x == w-1 && st.y == h-1){
                    out.println(cnt);
                    return;
                }

                if(!t[y][x][U]){
                    Point ns = new Point(x, y-1);
                    next.add(ns);
                }
                if(!t[y][x][R]){
                    Point ns = new Point(x+1, y);
                    next.add(ns);
                }
                if(!t[y][x][D]){
                    Point ns = new Point(x, y+1);
                    next.add(ns);
                }
                if(!t[y][x][L]){
                    Point ns = new Point(x-1, y);
                    next.add(ns);
                }
            }
            open = next;
            cnt++;
        }
        out.println(0);
    }

    static void disp(){
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                out.println(Arrays.toString(t[i][j]).replaceAll("true", "1").replaceAll("false", "0"));
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        while(true){
            String[] sa = sc.nextLine().split(" ");
            w = new Integer(sa[0]);
            h = new Integer(sa[1]);
            if(w == 0 && h == 0) break;
            t = new boolean[h][w][4];
            for(boolean[][] i : t) for(boolean[] j : i) Arrays.fill(j, true);

            t[0][0][U] = false;
            t[h-1][w-1][D] = false;

            for(int i=0;i<h*2-1;i++){
                sa = sc.nextLine().trim().split(" ");
                if(i % 2 == 0){
                    int y = i / 2;
                    for(int x=0;x<w-1;x++){
                        boolean v = sa[x].equals("1");
                        t[y][x][R] = v;
                        t[y][x+1][L] = v;
                    }
                }
                else{
                    int y = i / 2;
                    for(int x=0;x<w;x++){
                        boolean v = sa[x].equals("1");
                        t[y][x][D] = v;
                        t[y+1][x][U] = v;
                    }
                }
            }

//            disp();

            solve();
        }
    }
}