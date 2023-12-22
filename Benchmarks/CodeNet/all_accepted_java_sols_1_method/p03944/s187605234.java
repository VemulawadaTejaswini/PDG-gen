
import java.util.Scanner;



public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();

		int[][] map = new int[W][H];

		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				map[i][j] = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			switch (a) {
			// ai=1 のときは長方形の x<xi をみたす領域
			case 1:
				for (int j = 0; j < x; j++) {
					for (int k = 0; k < H; k++) {
						map[j][k] = 1;
					}
				}
				break;
			// ai=2 のときは長方形の x>xi をみたす領域
			case 2:
				for (int j = x; j < W; j++) {
					for (int k = 0; k < H; k++) {
						map[j][k] = 1;
					}
				}
				break;

			// ai=3 のときは長方形の y<yi をみたす領域
			case 3:
				for (int j = 0; j < W; j++) {
					for (int k = 0; k < y; k++) {
						map[j][k] = 1;
					}
				}
				break;

			// ai=4 のときは長方形の y>yi をみたす領域
			case 4:
				for (int j = 0; j < W; j++) {
					for (int k = y; k < H; k++) {
						map[j][k] = 1;
					}
				}

				break;

			}

		}
//		for (int i = 0; i < H; i++) {
//			for (int j = 0; j < W; j++) {
//				System.out.print(map[j][i]);
//				if (j == W - 1) {
//					System.out.print("\n");
//				}
//			}
//		}

		int ans = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[j][i] == 0) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}

}
