import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rn[][] = new int[17][17];
		
		int gx, gy;
		gx = scanner.nextInt();
		gy = scanner.nextInt();
		
		while(gx != 0 || gy != 0) {
			int n = scanner.nextInt();
			
			for(int x = 1; x <= gx; x++) {
				for(int y = 1; y <= gy; y++) {
					rn[x][y] = 0;
				}
			}
			
			for(int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				rn[x][y] = -1;
			}
			
			for(int x = 1; x <= gx; x++) {
				if (rn[x][1] == -1) {
					for(int xx = x; xx <= gx; xx++) {
						rn[xx][1] = -1;
					}
					break;
				} else {
					rn[x][1] = 1;
				}
			}
			for(int y = 1; y <= gy; y++) {
				if(rn[1][y] == -1) {
					for(int yy = y; yy <= gy; yy++) {
						rn[1][yy] = -1;
					}
					break;
				} else {
					rn[1][y] = 1;
				}
			}
			
			for(int y = 2; y <= gy; y++) {
				for(int x = 2; x <= gx; x++) {
					if (rn[x][y] == -1) {
						continue;
					}

					int c = 0;
					if (rn[x - 1][y] != -1) {
						c += rn[x - 1][y];
					}
					if (rn[x][y - 1] != -1) {
						c += rn[x][y - 1];
					}
					rn[x][y] = c;
				}
			}
			
			System.out.println(rn[gx][gy]);
			
			gx = scanner.nextInt();
			gy = scanner.nextInt();
		}
	}
}