import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
 
        Scanner sc = new Scanner(System.in);
 
        void run() {
                int h = sc.nextInt();
                int w = sc.nextInt();
                int m = sc.nextInt();
                char[][] d = new char[h][w];
                for (int i = 0; i < h; i++)
                        d[i] = sc.next().toCharArray();
                int[][][] cost = new int[3][h][w];
                for (int k = 0; k < 3; k++) {
                        for (int i = 0; i < h; i++) {
                                for (int j = 0; j < w; j++) {
                                        cost[k][i][j] = sc.nextInt();
                                }
                        }
                }
 
                int[] y = new int[m];
                int[] x = new int[m];
 
                int[][] map3 = new int[h][w];
 
                for (int i = 0; i < m; i++) {
                        y[i] = sc.nextInt();
                        x[i] = sc.nextInt();
                }
                int a = 1;
                long ans = 0;
                int map2[][] = new int[h][w];
 
                for (int i = 0; i < m - 1; i++) {
                        int gx = x[i];
                        int gy = y[i];
 
                        int dx[] = { -1, 1, 0, 0 };
                        int dy[] = { 0, 0, 1, -1 };
 
                        int sx = x[i + 1];
                        int sy = y[i + 1];
 
                        for(int j =0 ; j < h; j++){
                                Arrays.fill(map2[j],0);
                        }
                        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
 
                        int z = 1;
                        q.add(((sx << 8) + sy) + (z << 16));
                        for (;;) {
                
                                int v = q.poll();
                                int ind = v >> 16;
                                sy = v & 0xff;
                                sx = (v >> 8) & 0xff;
 
                                if (sx == gx && sy == gy) {
                                        break;
                                }
 
                                for (int f = 0; f < 4; f++) {
                                        int nx = sx + dx[f];
                                        int ny = sy + dy[f];
 
                                        if (nx < 0 || ny < 0) {
                                                continue;
                                        }
                                        if (nx >= w || ny >= h) {
                                                continue;
                                        }
 
                                        if (d[ny][nx] == '#') {
                                                continue;
                                        }
                                        if (map2[ny][nx] == 0) {
                                                map2[ny][nx] = ind + 1;
                                        }else{
                                                continue;
                                        }
                                        
                
                                        q.add(((nx << 8) + ny) + ((ind + 1) << 16));
                                }
 
                        }
                        z = map2[gy][gx];
                        for (; z > 1; z--) {
//                              System.out.println(sx + " " + sy);
                                int ha = cost[1][sy][sx] + cost[2][sy][sx];
                                if (map3[sy][sx] != 0) {
                                        if ((a - map3[sy][sx]) * cost[0][sy][sx] < ha) {
                                                ha = (a - map3[sy][sx]) * cost[0][sy][sx];
                                        }
                                }
                                map3[sy][sx] = a;
                                a++;
                                ans += ha;
 
                                for (int f = 0; f < 4; f++) {
                                        int nx = sx + dx[f];
                                        int ny = sy + dy[f];
 
                                        if (nx < 0 || ny < 0) {
                                                continue;
                                        }
                                        if (nx >= w || ny >= h) {
                                                continue;
                                        }
 
                                        if (map2[ny][nx] == z - 1) {
                                                sx = nx;
                                                sy = ny;
                                                break;
                                        }
                                }
                        }
 
                }
                {
                        int sx = x[m-1];
                        int sy = y[m-1];
                        int ha = cost[1][sy][sx] + cost[2][sy][sx];
                        if (map3[sy][sx] != 0) {
                                if ((a - map3[sy][sx] ) * cost[0][sy][sx] < ha) {
                                        ha = (a-map3[sy][sx]) * cost[0][sy][sx];
                                }
                        }
 
                        ans += ha;
                }
//              System.out.println(a);
                System.out.println(ans);
 
        }
 
        public static void main(String[] args) {
                Main m = new Main();
                m.run();
        }
 
}