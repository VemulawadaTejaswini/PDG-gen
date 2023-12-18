import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		int ans = 0;
		int max_row = 1<<h, max_col = 1<<w;
//		System.out.println(max_row);
		for (int i = 0; i < max_row; i++) {
			for (int j = 0; j < max_col; j++) {
				int cnt = 0;
				for (int r = 0; r < h; r++) {
					if (((1 << r) & i) == 0) continue;
					for (int c = 0; c < w; c++) {
						if (((1 << c) & j) == 0) continue;
//						if (i == 1 && j == 4) System.out.format("%d %d %c\n", r, c, a[r][c]);
						if (a[r][c] == '#') cnt++;
					}
				}
//				System.out.format("%d %d %d\n", i, j, cnt);
				if (cnt == k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}

