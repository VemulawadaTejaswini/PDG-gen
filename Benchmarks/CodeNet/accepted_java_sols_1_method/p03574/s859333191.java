import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][]s = new char[H][W];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = S.charAt(j);
			}
		}
		sc.close();
		int[][]b = new int[H][W];
		int[]dx = {0, 0, 1, 1, 1, -1, -1, -1};
		int[]dy = {1, -1, 0, 1, -1, 0, 1, -1};
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(s[i][j] == '#') {
					for(int k = 0; k < 8; k++) {
						int ny = i + dy[k];
						int nx = j + dx[k];
						if(ny >= 0 && ny < H && nx >= 0 && nx < W) {
							if(s[ny][nx] == '.') {
								b[ny][nx] ++;
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(s[i][j] == '#') {
					System.out.print("#");
				}else {
					System.out.print(b[i][j]);
				}
			}
			System.out.println();
		}
	}
}