import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] vx = new int[] {1, -1};
	static int[] vy = new int[] {-1, 1}; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cCunt = 1;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[][] ans = new int[n][n];
			boolean E = true;
			int count = 2;
			int DD = 0;
			int x = 1;
			int y = 0;
			ans[0][0] = 1;
			while(true) {
				ans[y][x] = count++;
				if(y == n-1 && x == n-1) break;
				if(E) {
					E = false;
					if(x == 0 || y == n-1) {
						DD = 0;
					}
					else if(x == n-1 || y == 0) {
						DD = 1;
					}
					x += vx[DD];
					y += vy[DD];
					continue;
				}
				if(x == 0) {
					E = true;
					if(y != n-1) {
						y++;
						continue;
					}
				}
				if(x == n-1) {
					E = true;
					if(y != n-1) {
						y++;
						continue;
					}
				}
				if(y == 0) {
					E = true;
					if(x != n-1) {
						x++;
						continue;
					}
				}
				if(y == n-1) {
					E = true;
					if(x != n-1) {
						x++;
						continue;
					}
				}
				
				x += vx[DD];
				y += vy[DD];
			}
			System.out.println("Case " + cCunt++ + ":");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(" " + ans[i][j]);
				}
				System.out.println();
			}
		}
		
		
	}
 }