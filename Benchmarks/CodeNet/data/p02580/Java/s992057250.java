import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int mx = 0;
        int[][] grid = new int[h][w];
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x-1][y-1] = 1;
        }
        Map<Integer, Integer> hmap = new HashMap<>();
        Map<Integer, Integer> wmap = new HashMap<>();
        for(int i=0; i<h; i++){
            int ans = 0;
            for(int k=0; k<w; k++){
                ans += grid[i][k];
            }
            hmap.put(i, ans);
        }
        for(int i=0; i<w; i++){
            int ans = 0;
            for(int k=0; k<h; k++){
                ans += grid[k][i];
            }
            wmap.put(i, ans);
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int ans = 0;
                ans += hmap.getOrDefault(i, 0);
                ans += wmap.getOrDefault(j, 0);
                ans -= grid[i][j];
                mx = Math.max(ans, mx);
            }
        }
        System.out.println(mx);
    }
}