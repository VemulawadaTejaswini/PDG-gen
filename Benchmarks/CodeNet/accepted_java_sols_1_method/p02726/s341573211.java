import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        
        // dist[i][j] = 点i→jの直接距離
        // i→jとj→iの距離が同じとは限らない
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Math.abs(j-i);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i <= x && y <= j) {
                    dist[i][j] -= ((y - x) - 1);
                }
                
                dist[i][j] = Math.min(dist[i][j], dist[i][y] + dist[j][y]);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                dist[i][j] = Math.min(dist[i][j], dist[i][y] + dist[j][y]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                dist[i][j] = Math.min(dist[i][j], dist[i][x] + dist[x][j]);
            }
        }
        
        int[] hindo = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                hindo[dist[i][j]]++;
            }
        }
        
        for (int i = 1; i < n; i++) {
            System.out.println(hindo[i]);
        }
        
    }
}