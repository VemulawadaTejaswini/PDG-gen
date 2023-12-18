import java.util.*;

public class Main{

    static int h, w;
    static int[][] dir = new int[][]{{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0)break;
            int[][] c = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    c[i][j] = sc.nextInt();
                }
            }
            boolean[][] used = new boolean[h][w];
            int ans = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    ans += dfs(i, j, used, c);
                }
            }
            sb.append(ans + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }
    private static int dfs(int vh, int vw, boolean[][] used, int[][] c) {
        if(vh < 0 || h <= vh || vw < 0 || w <= vw) return 0;
        if(used[vh][vw] || c[vh][vw] == 0) return 0;
        used[vh][vw] = true;
        for(int[] nex : dir){
            dfs(vh+nex[0], vw+nex[1], used, c);
        }
        return 1;
    }

}

