
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 2 << 28;
    
    int w, h;
    int[][] armyMap, queenMap, map;
    boolean[][] roopMap;
    ArrayList<P> trgPs;
    int trgCnt, qsx, qsy, asx, asy;
    void run() {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            w = sc.nextInt(); h = sc.nextInt();
            if ((w|h) == 0) break;
            
            map = new int[h + 2][w + 2];
            trgCnt = 0;
            trgPs = new ArrayList<P>();
            for (int[] a : map) fill(a, -1);
            for (int i = 1; i <= h; i++) {
                String l = sc.next();
                for (int j = 1; j <= w; j++) {
                    switch (l.charAt(j - 1)) {
                    case '.': map[i][j] = 0; break;
                    case '#': map[i][j] = -1; break;
                    case 'Q': map[i][j] = 0; qsx = j; qsy = i; break;
                    case 'A': map[i][j] = 0; asx = j; asy = i; break;
                    case 'E': map[i][j] = ++trgCnt; trgPs.add(new P(j, i));
                    }
                }
            }
            
            queenMap = new int[h+2][w+2];
            armyMap = new int[h+2][w+2];
            bfs(qsx, qsy, queenMap);
            bfs(asx, asy, armyMap);
            
            roopMap = new boolean[h+2][w+2];
            roop();
            
//            for (int[] a : queenMap) debug(a);
//            for (int[] a : armyMap) debug(a);
//            for (boolean[] a : roopMap) debug(a);
            
            System.out.println(checkAns());
        }
    }
    
    String checkAns() {
        for (P t : trgPs) if (queenMap[t.y][t.x] < armyMap[t.y][t.x]) {
            return "Queen can escape.";
        }
        for (int x = 1; x <= w; x++) for (int y = 1; y <= h; y++) if (roopMap[y][x]){
            if (queenMap[y][x] < armyMap[y][x]) {
                return "Queen can not escape and Army can not catch Queen.";
            }
        }
        return "Army can catch Queen.";
    }
    
    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};
    void bfs(int x, int y, int[][] pMap) {
        LinkedList<P> q = new LinkedList<P>();
        for (int[] a: pMap) fill(a, INF);
        pMap[y][x] = 0;
        q.add(new P(x, y));
        for(;!q.isEmpty();) {
            P cur = q.removeFirst();
            
            for (int i = 0; i < 4; i++) if (map[cur.y+dy[i]][cur.x+dx[i]] >= 0) {
                if (pMap[cur.y+dy[i]][cur.x+dx[i]] > pMap[cur.y][cur.x] + 1) {
                    pMap[cur.y+dy[i]][cur.x+dx[i]] = pMap[cur.y][cur.x] + 1;
                    q.addLast(new P(cur.x + dx[i], cur.y + dy[i]));
                }
            }
        }
    }
    
    void roop() {
        for (int y = 1; y <= h; y++) for (int x = 1; x <= w; x++) {
            dfs(x, y, x, y, x, y, true, new boolean[h + 2][w + 2]);
        }
    }
    
    boolean dfs(int x, int y, int px, int py, int sx, int sy, boolean first, boolean[][] visited) {
        if (!first) {
            visited[y][x] = true;
            if (x == sx && y == sy) {
                return roopMap[y][x] = true;
            }
        }
        boolean f = false;
        for (int i = 0; i < 4; i++) if (map[y + dy[i]][x + dx[i]] >= 0) {
            if (x + dx[i] == px && y + dy[i] == py) continue;
            if (visited[y + dy[i]][x + dx[i]]) continue;
            f |= dfs(x + dx[i], y + dy[i], x, y, sx, sy, false, visited);
        }
        
        return roopMap[y][x] |= f;
    }
    
    class P {
        int x, y, c;
        P(int x, int y) {
            this.x = x; this.y = y;
            this.c = 0;
        }
        
        P(int x, int y, int c) {
            this(x, y);
            this.c = c;
        }
    }
    
    void debug(Object...os) {
        System.err.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}