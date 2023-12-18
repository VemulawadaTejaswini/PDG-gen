import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int island_c = 0;
            if(w==0 && h==0) break;
            int[][] maps = new int[h][w];
            for(int i = 0; i<h; i++){
                for(int j = 0; j<w; j++){
                    maps[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<h; i++){
                for(int j = 0; j<w; j++){
                    if(maps[i][j] == 0) continue;
                    island_c++;
                    dfs(maps, w, h, i, j);
                }
            }
            System.out.println(island_c);
        }
    }

    static void dfs(int[][] maps, int w, int h, int i, int j){
        if(i>0){
            if(maps[i-1][j] == 1) {
                maps[i-1][j] = 0;
                dfs(maps, w, h, i-1, j);
            }
            if(j>0){
                if(maps[i-1][j-1] == 1){
                    maps[i-1][j-1] = 0;
                    dfs(maps, w, h, i-1, j-1);
                }
            }
            if(j<w-1){
                if(maps[i-1][j+1] == 1){
                    maps[i-1][j+1] = 0;
                    dfs(maps, w, h, i-1, j+1);
                }
            }
        }
        if(i<h-1){
            if(maps[i+1][j] == 1){
                maps[i+1][j] = 0;
                dfs(maps, w, h, i+1, j);
            }
            if(j>0){
                if(maps[i+1][j-1] == 1){
                    maps[i+1][j-1] = 0;
                    dfs(maps, w, h, i+1, j-1);
                }
            }
            if(j<w-1){
                if(maps[i+1][j+1] == 1){
                    maps[i+1][j+1] = 0;
                    dfs(maps, w, h, i+1, j+1);
                }
            }
        }
        if(j>0){
            if(maps[i][j-1] == 1){
                maps[i][j-1] = 0;
                dfs(maps, w, h, i, j-1);
            }
            if(i>0){
                if(maps[i-1][j-1] == 1){
                    maps[i-1][j-1] = 0;
                    dfs(maps, w, h, i-1, j-1);
                }
            }
            if(i<h-1){
                if(maps[i+1][j-1] == 1){
                    maps[i+1][j-1] = 0;
                    dfs(maps, w, h, i+1, j-1);
                }
            }
        }
        if(j<w-1){
            if(maps[i][j+1] == 1){
                maps[i][j+1] = 0;
                dfs(maps, w, h, i, j+1);
            }
            if(i>0){
                if(maps[i-1][j+1] == 1){
                    maps[i-1][j+1] = 0;
                    dfs(maps, w, h, i-1, j+1);
                }
            }
            if(i<h-1){
                if(maps[i+1][j+1] == 1){
                    maps[i+1][j+1] = 0;
                    dfs(maps, w, h, i+1, j+1);
                }
            }
        }
    }

}
