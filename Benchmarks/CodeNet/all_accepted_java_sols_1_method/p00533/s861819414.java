import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for(int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		int[][] ans = new int[h][w];
		for(int i = 0; i < h; i++) {
			Arrays.fill(ans[i], -1);
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = j; k >= 0; k--) {
					if(map[i][k] == 'c') {
						ans[i][j] = j - k;
						break;
					}
				}
			}
		}
		for(int i = 0; i < h; i++) {
			System.out.print(ans[i][0]);
			for(int j = 1; j < w; j++) {
				System.out.print(" " + ans[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
}