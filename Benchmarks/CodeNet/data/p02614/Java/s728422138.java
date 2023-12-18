import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = Integer.parseInt(in.next());
		int w = Integer.parseInt(in.next());
		int k = Integer.parseInt(in.next());
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++) {
			grid[i] = in.next().toCharArray();
		}
		int ans = 0;
		for(int i = 0; i < (1 << (h)); i++) {
			for(int j = 0; j < (1 << (w)); j++) {
				if(count(grid, h, w, i, j) == k) ans += 1;
			}
		}
		System.out.println(ans);
	}
	public static int count(char[][] grid, int h, int w, int ii, int jj) {
		int cnt = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if((ii & (1 << i)) == 0) {
					if((jj & (1 << j)) == 0) {
						if(grid[i][j] == '#') cnt += 1;
					}
				}
			}
		}
		return cnt;
	}
}