import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			boolean[][] gem = new boolean[21][21];
			for(int i=0;i<n;i++) {
				gem[sc.nextInt()][sc.nextInt()] = true;
			}
			int m = sc.nextInt();
			int rx = 10;
			int ry = 10;
			int collected = 0;
			if (gem[rx][ry]) {
				collected++;
				gem[rx][ry] = false;
			}
			for(int i=0;i<m;i++) {
				char c = sc.next().charAt(0);
				int step = sc.nextInt();
				int dx = 0,dy = 0;
				switch (c) {
				case 'N':
					dx = 0; dy = 1;
					break;
				case 'E':
					dx = 1; dy = 0;
					break;
				case 'S':
					dx = 0; dy = -1;
					break;
				case 'W':
					dx = -1; dy = 0;
					break;
				}
				for(int j=0;j<step;j++) {
					rx += dx;
					ry += dy;
					if (gem[rx][ry]) {
						collected++;
						gem[rx][ry] = false;
					}
				}
			}
			System.out.println(collected == n ? "Yes" : "No");
		}
	}

}