import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
    static int[] vx = new int[] {0,1,0,-1};
    static int[] vy = new int[] {1,0,-1,0};
    static int Y;
    static int X;
    static int MIN;
    static int TAR;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            int c = sc.nextInt();
            X = x;
            Y = y;
            TAR = c;
            if(x == 0 && y == 0) break;
            int[][] map = new int[y][x];
            for(int i = 0; i < Y; i++) {
                for(int j = 0; j < X; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            boolean[][] same = new boolean[Y][X];
            same[0][0] = true;
            cc(map,same,new boolean[Y][X],0,0);
            MIN = Integer.MAX_VALUE;
            int count = dfs(map,same,0);
            System.out.println(count);
        }
    }
    static int dfs(int[][] map, boolean[][] same, int count) {
        int c = map[0][0];
        if(count == 5) {
        	int sum = 0;
        	cc(map,same,new boolean[Y][X],0,0);
	        for(int i = 0; i < Y; i++) {
	            for(int j = 0; j < X; j++) {
	                if(same[i][j]) {
	                	sum++;
	                }
	            }
	        }
	        return sum;
        }
        int ret = 0;
        int[][]    before = new int[Y][X];
        boolean[][] check  = new boolean[Y][X];
        if(count == 4) {
        	 for(int j = 0; j < Y; j++) {
                 before[j] = Arrays.copyOf(map[j]  , X);
                 check[j]  = Arrays.copyOf(same[j] , X);
             }
             for(int j = 0; j < Y; j++) {
                 for(int k = 0; k < X; k++) {
                     if(check[j][k]) before[j][k] = TAR;
                 }
             }
             boolean go = cc(before,check,new boolean[Y][X],0,0);
             ret = Math.max(dfs(before,check,count+1),ret);
             return ret;
        }
        for(int i = 1; i <= 6; i++) {
            for(int j = 0; j < Y; j++) {
                before[j] = Arrays.copyOf(map[j]  ,  X);
                check[j]  = Arrays.copyOf(same[j] ,  X);
            }
            for(int j = 0; j < Y; j++) {
                for(int k = 0; k < X; k++) {
                    if(check[j][k]) before[j][k] = i;
                }
            }
            boolean go = cc(before,check,new boolean[Y][X],0,0);
            ret = Math.max(dfs(before,check,count+1),ret);
        }
        return ret;
    }
    static boolean cc(int[][] a, boolean[][] b, boolean[][] oc,int y, int x) {
        boolean ok = false;
        if(oc[y][x]) return ok;
        oc[y][x] = true;
        for(int k = 0; k < 4; k++) {
            int ty = vy[k] + y;
            int tx = vx[k] + x;
            if(ty < 0 || tx < 0 || ty >= Y || tx >= X) continue;
            if(a[y][x] == a[ty][tx]) {
                ok |= !b[ty][tx];
                b[ty][tx] = true;
                if(!oc[ty][tx])
                ok |= cc(a,b,oc,ty,tx);
            }
        }
        return ok;
    }
}