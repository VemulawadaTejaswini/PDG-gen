import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] map = new int[H][W];
		int[] x = new int[H * W];
		int[] y = new int[H * W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				map[i][j] = sc.nextInt()-1;
				x[map[i][j]] = j;
				y[map[i][j]] = i;
			}
		}
		boolean[][] ok = new boolean[H][W];
		int[][] last   = new int[H][W];
		int[] vx = {1,0,-1,0};
		int[] vy = {0,1,0,-1};
		int ans = 0;
		for(int i = 0; i < H * W; i++) {
			int X = x[i];
			int Y = y[i];
			int pre = -1;
			boolean isOk = false;
			for(int j = 0; j < 4; j++) {
				int tx = X + vx[j];
				int ty = Y + vy[j];
				if(ty < 0 || tx < 0 || tx >= W || ty >= H) continue;
				if(map[ty][tx] < map[Y][X]) {
					isOk |= ok[ty][tx];
					if(pre != -1 && pre != last[ty][tx]) isOk = true;
					else pre = last[ty][tx];
				} 
			}
			if(isOk) ok[Y][X] = true;
			if(pre == -1) last[Y][X] = i;
			else last[Y][X] = pre;
			if(ok[Y][X]) ans++;
		}
		System.out.println(ans);
		
		
	}
}