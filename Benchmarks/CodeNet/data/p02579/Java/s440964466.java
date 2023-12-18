import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int CH = sc.nextInt()-1;
        int CW = sc.nextInt()-1;
        int DH = sc.nextInt()-1;
        int DW = sc.nextInt()-1;
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String line = sc.next();
            for (int j = 0; j < W; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        boolean[][] alr = new boolean[H][W];
        Deque<int[]> deq = new ArrayDeque<>();
        int[] walkH = {0,1,0,-1};
        int[] walkW = {1,0,-1,0};
        int[] warpH = {1,1,-1,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1};
        int[] warpW = {1,-1,1,-1,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1,0,1,2,2};
        int[] point = {CH, CW, 0};
        deq.addFirst(point);
        while (!deq.isEmpty()) {
            int[] now = deq.pollFirst();
            if (now[0] == DH && now[1] == DW) {
                System.out.println(now[2]);
                return;
            }
            if (alr[now[0]][now[1]]) {
                continue;
            }
            alr[now[0]][now[1]] = true;
            for (int i = 0; i < walkH.length; i++) {
                int goH = now[0] + walkH[i];
                int goW = now[1] + walkW[i];
                if (-1 < goH && goH < H && -1 < goW && goW < W && map[goH][goW] != '#') {
                    int[] goWalk = {goH, goW, now[2]};
                    deq.addFirst(goWalk);
                }
            }
            for (int i = 0; i < warpH.length; i++) {
                int goH = now[0] + warpH[i];
                int goW = now[1] + warpW[i];
                if (-1 < goH && goH < H && -1 < goW && goW < W && map[goH][goW] != '#') {
                    int[] goWarp = {goH, goW, now[2]+1};
                    deq.addLast(goWarp);
                }
            }
        }
        System.out.println(-1);
    }
}
