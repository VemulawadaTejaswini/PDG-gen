import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int N = s();
		int W = s();
		int H = s();

		boolean[][] map = new boolean[W][H];

		for(int i = 0; i < N; i++) {
			int x = s();
			int y = s();
			int w = s();
			for(int u = 0; u < W; u++) {
				for(int l = 0; l <= w; l++) {
					if((y + l < H)) {
						map[u][y+l] = true;
					}
					if((y - l >= 0)) {
						map[u][y-l] = true;
					}
				}
			}

			for(int u = 0; u < H; u++) {
				for(int l = 0; l <= w; l++) {
					if((x + l < W)) {
						map[x+l][u] = true;
					}
					if((x - l >= 0)) {
						map[x-l][u] = true;
					}
				}
			}
		}
		boolean s = true;
		for(boolean[] list : map) {
			for(boolean b : list) {
				s  = s & b;
			}
		}
		if(s) System.out.println("Yes");
		else System.out.println("No");
	}

	public static int s() {
		return Integer.parseInt(scan.next());
	}
}