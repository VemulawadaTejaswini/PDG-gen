import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String c[][] = new String[H][W];
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = s.substring(j, j + 1);
			}
		}
		int ans = 0;
		for (int i = 0; i < (Math.pow(2, H)); i++) {
			for (int j = 0; j < (Math.pow(2, W)); j++) {
				String temp[][] = new String[H][W];
				for(int k = 0; k < H; k++) {
					temp[k] = c[k].clone();
				}
				for (int a = 0; a < H; a++) {
					if ((1&i>>a) == 1) {
						for(int k = 0; k < W; k++) {
							temp[a][k] = "$";
						}
					}
				}
				for (int b = 0; b < W; b++) {
					if ((1&j>>b) == 1) {
						for(int k = 0; k < H; k++) {
							temp[k][b] = "$";
						}
					}
				}
				int cnt = 0;
				for(int y = 0; y < H; y++) {
					for(int x = 0; x < W; x++) {
						if(temp[y][x].equals("#")) {
							cnt++;
						}
					}
				}
				if(cnt == K) ans++;
			}
		}
		System.out.println(ans);
	}
}
