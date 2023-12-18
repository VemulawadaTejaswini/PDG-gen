import java.util.*;

public class Main {

    static int[][] dir4 = new int[][]{{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int SH = sc.nextInt()-1;
        int SW = sc.nextInt()-1;
        int S = SH*1000 + SW;
        int GH = sc.nextInt()-1;
        int GW = sc.nextInt()-1;
        boolean[][] g = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if(s[j] == '.') g[i][j] = true;
            }
        }
        int[][] d = new int[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(d[i], Integer.MAX_VALUE);
        }
        d[SH][SW] = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(S);
        while(!q.isEmpty()){
            int v = q.poll();
            int h = v / 1000;
            int w = v % 1000;
            for(int[] dir : dir4){
                int nh = h + dir[0];
                int nw = w + dir[1];
                if(nh < 0 || H-1 < nh || nw < 0 || W-1 < nw) continue;
                if(!g[nh][nw] || d[nh][nw] <= d[h][w]) continue;
                d[nh][nw] = d[h][w];
                q.add(nh*1000 + nw);
            }
            for (int i = -2; i <= 2; i++) {
                int nh = h + i;
                if(nh < 0 || H-1 < nh) continue;
                for (int j = -2; j <= 2; j++) {
                    int nw = w + j;
                    if(nw < 0 || W-1 < nw) continue;
                    if(!g[nh][nw] || d[nh][nw] <= d[h][w]+1) continue;
                    d[nh][nw] = d[h][w]+1;
                    q.addLast(nh*1000 + nw);
                }
            }
        }
        System.out.println(d[GH][GW] == Integer.MAX_VALUE ? -1 : d[GH][GW]);
        sc.close();

    }

}
