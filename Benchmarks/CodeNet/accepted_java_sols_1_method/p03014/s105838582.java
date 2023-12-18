import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		char[][] map = new char[h][w];
		int[][] hmap = new int[h][w]; // 横方向
		int[][] vmap = new int[h][w]; // 縦方向

		for ( int i = 0; i < h; i++ ) {
			map[i] = in.next().toCharArray();
		}
		in.close();

		int cnt = 0;
		// 横の処理
		for ( int r = 0; r < h; r++ ) {
			cnt = 0;
			for ( int c = 0; c < w; c++ ) {
				if ( map[r][c] == '.' ) {
					cnt++;
					hmap[r][c] += cnt;
				} else if ( map[r][c] == '#' ) {
					cnt = 0;
				}
			}

			for ( int c = w - 2; 0 <= c; c-- ) {
				if ( map[r][c] == '#' ) {
					continue;
				} else if ( map[r][c + 1] == '.' ) {
					hmap[r][c] = hmap[r][c + 1];

				}
			}
		}

		// 縦の処理
		for ( int c = 0; c < w; c++ ) {
			cnt = 0;
			for ( int r = 0; r < h; r++ ) {
				if ( map[r][c] == '.' ) {
					cnt++;
					vmap[r][c] = cnt;
				} else if ( map[r][c] == '#' ) {
					cnt = 0;
				}
			}

			for ( int r = h - 2; 0 <= r; r-- ) {
				if ( map[r][c] == '#' ) {
					continue;
				} else if ( map[r + 1][c] == '.' ) {
					vmap[r][c] = vmap[r + 1][c];
				}
			}
		}

//		for ( int r = 0; r < h; r++ ) {
//
//			for ( int c = 0; c < w; c++ ) {
//				System.out.print(hmap[r][c]);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		
//		for ( int r = 0; r < h; r++ ) {
//
//			for ( int c = 0; c < w; c++ ) {
//				System.out.print(vmap[r][c]);
//			}
//			System.out.println();
//		}
		
		int ans = 0;
		for ( int r = 0; r < h; r++ ) {
			for ( int c = 0; c < w; c++ ) {
				ans = Math.max(ans, hmap[r][c] + vmap[r][c] - 1);
			}
		}
		System.out.println(ans);
	}
}