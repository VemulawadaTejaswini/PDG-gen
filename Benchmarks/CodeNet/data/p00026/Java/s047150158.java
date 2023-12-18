import java.util.*;

public class Main {
    
    public static int[][] map;
    public static int[][] move = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    public static int[][] move2 = {{1,1}, {1,-1}, {-1,1}, {-1,-1}};
    public static boolean[][] used;
    public static int dx;
    public static int dy;
    public static int s;
    
    public static void drop(int x, int y, int z) {
        if(!(0<=x && x<10 && 0<=y && y<10)) return;
        if(Math.abs(dx-x) + Math.abs(dy-y) > z) return;
        if(used[x][y]) return;
        
        map[x][y]++;
        used[x][y] = true;
        for(int k=0; k<4; k++) {
            drop(x + move[k][0], y + move[k][1], z);
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            map = new int[10][10];
            while(sc.hasNext()) {
                String[] str = sc.next().split(",");
                dx = Integer.parseInt(str[0]);
                dy = Integer.parseInt(str[1]);
                s = Integer.parseInt(str[2]);
                used = new boolean[10][10];
                drop(dx, dy, (s == 3 ? 2:1));
                if(s == 2) {
                    for(int k=0; k<4; k++) {
                        int x = dx + move2[k][0];
                        int y = dy + move2[k][1];
                        if(0<=x && x<10 && 0<=y && y<10) map[x][y]++;
                    }
                }
            }
            int cnt = 0;
            int max = 0;
            for(int x=0; x<10; x++) {
                for(int y=0; y<10; y++) {
                    if(map[x][y] == 0) cnt++;
                    max = Math.max(max, map[x][y]);
                }
            }
            System.out.println(cnt);
            System.out.println(max);
        }
    }
}

