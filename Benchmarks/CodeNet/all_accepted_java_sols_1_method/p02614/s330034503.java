import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String c[][] = new String[H][W];
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = temp.substring(j, j + 1);
			}
		}
		int ans = 0;
		for (int i = 0; i < (Math.pow(2, H)); i++) {
			String c1[][] = new String[H][W];
			for(int a = 0; a < H; a++) {
				c1[a] = c[a].clone();
			}
			for (int j = 0; j < H; j++) {
				if ((1&i>>j) == 1) {
					for(int a = 0; a < W; a++) {
						c1[j][a] = "$";
					}
				}
			}
			for (int k = 0; k < (Math.pow(2, W)); k++) {
				String c2[][] = new String[H][W];
				for(int a = 0; a < H; a++) {
					c2[a] = c1[a].clone();
				}
				for (int l = 0; l < W; l++) {
					if ((1&k>>l) == 1) {
						for(int a = 0; a < H; a++) {
							c2[a][l] = "$";
						}
					}
				}
				int cnt = 0;
				for(int y = 0; y < H; y++) {
					for(int x = 0; x < W; x++) {
						if(c2[y][x].equals("#")) {
							cnt++;
						}
					}
				}
				if(cnt == K) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
