import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] map = new boolean[h][w];
		for(int i=0; i<h; i++) {
			char[] cmap = sc.next().toCharArray();
			for(int j=0; j<w; j++) map[i][j] = cmap[j] == '.';
		}
			
		int[][][] cost = new int[h][w][4];
		for(int i=0; i<h; i++) 
			for(int j=0; j<w; j++) Arrays.fill(cost[i][j], 0);
		
		//left down
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(map[i][j]) {
					cost[i][j][0] = 1;
					if(j>0) cost[i][j][0] += cost[i][j-1][0];
					
					cost[i][j][2] = 1;
					if(i>0) cost[i][j][2] += cost[i-1][j][2];
				}
			}		
		}

		//right up
		for(int i=h-1; i>=0; i--) {
			for(int j=w-1; j>=0; j--) {
				if(map[i][j]) {
					cost[i][j][1] = 1;
					if(j<w-1) cost[i][j][1] += cost[i][j+1][1];

					cost[i][j][3] = 1;
					if(i<h-1) cost[i][j][3] += cost[i+1][j][3];
				}
			}		
		}

		int ans = Integer.MIN_VALUE;
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				int csum = 1;
				for(int k=0; k<4; k++) csum += cost[i][j][k]-1;
				ans = Math.max(ans, csum);
			}
		}
		
/*
		for(int k=0; k<4; k++) {
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					out.printf("%2d ",cost[i][j][k]);
				}
				out.println();
			}
			out.println();
		}
*/

        out.println(ans);
    }
}
