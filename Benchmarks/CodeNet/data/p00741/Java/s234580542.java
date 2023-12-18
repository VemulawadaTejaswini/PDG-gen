import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int[][] field;
    static int w;
    static int h;

    public static void dfs(int y, int x) {
        field[y][x] = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int nh = y + i;
                int nw = x + j;
                if(nh < 0 || nh >= h || nw < 0 || nw >= w) continue;
                if(field[nh][nw] == 0) continue;
                dfs(nh, nw);
            }
        }
    }

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0&&h == 0) break;
            field = new int[h][w];

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    field[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(field[i][j] == 1){
                        dfs(i, j);
                        ans++;
                    }
                }
            }

            System.out.println(ans);
    
        }
        
        sc.close();
    }

    
}

