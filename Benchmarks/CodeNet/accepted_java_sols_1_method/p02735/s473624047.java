import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] s = new char[H][];
		for ( int h = 0 ; h < H ; h++ ) {
			s[h] = sc.next().toCharArray();
		}
		sc.close();

		int[][] map = new int[H][W];
		if ( s[0][0] == '.' ) {
			map[0][0] = 0;
		} else {
			map[0][0] = 1;
		}
		for ( int w = 1 ; w < W ; w++ ) {
			if ( s[0][w] == '.' ) {
				map[0][w] = map[0][w-1];
			} else {
				if ( s[0][w-1] == '.' ) {
					map[0][w] = map[0][w-1] + 1;
				} else {
					map[0][w] = map[0][w-1];
				}
			}
		}
		for ( int h = 1 ; h < H ; h++ ) {
			if ( s[h][0] == '.' ) {
				map[h][0] = map[h-1][0];
			} else {
				if ( s[h-1][0] == '.' ) {
					map[h][0] = map[h-1][0] + 1;
				} else {
					map[h][0] = map[h-1][0];
				}
			}
			for ( int w = 1 ; w < W ; w++ ) {
				if ( s[h][w] == '.' ) {
					map[h][w] = Math.min(map[h-1][w], map[h][w-1]);
				} else {
					int down = s[h-1][w] == '.' ? map[h-1][w] + 1 : map[h-1][w];
					int right = s[h][w-1] == '.' ? map[h][w-1] + 1 : map[h][w-1];
					map[h][w] = Math.min(down, right);
				}
			}
		}

		System.out.println(map[H-1][W-1]);
	}
}
