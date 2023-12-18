import java.util.*;

public class Main {

    static int[][] dir4 = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] g = new boolean[h+2][w+2];
        int wc = 0;
        for (int i = 1; i <= h; i++) {
            char[] a = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(a[j] == '.'){
                    g[i][j+1] = true; wc++;
                }
            }
        }
        int[][] d = new int[h+2][w+2];
        for (int i = 0; i < h+2; i++) Arrays.fill(d[i], -1);
        d[1][1] = 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(101);
        while(!q.isEmpty()){
            int nex = q.poll();
            int ch = nex/100; int cw = nex%100;
            for(int[] dir : dir4){
                int nh = ch+dir[0]; int nw = cw+dir[1];
                if(!g[nh][nw] || 0 < d[nh][nw])continue;
                d[nh][nw] = d[ch][cw] + 1;
                q.add(nh*100 + nw);
            }
        }
        int ans = d[h][w] < 0 ? -1 : wc - d[h][w];
        System.out.println(ans);
        sc.close();

    }

}
