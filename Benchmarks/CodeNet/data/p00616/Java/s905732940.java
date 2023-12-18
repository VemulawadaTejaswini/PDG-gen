import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			int H = sc.nextInt();
			if (N == 0 && H == 0) break;
			boolean[][] xy = new boolean[N][N];
			boolean[][] yz = new boolean[N][N];
			boolean[][] xz = new boolean[N][N];
			for (int i = 0; i < H; ++i) {
				String surface = sc.next();
				int v1 = sc.nextInt() - 1;
				int v2 = sc.nextInt() - 1;
				if (surface.equals("xy")) {
					xy[v1][v2] = true;
				} else if (surface.equals("yz")) {
					yz[v1][v2] = true;
				} else {
					xz[v1][v2] = true;
				}
			}
			int ans = 0;
			for (int x = 0; x < N; ++x) {
				for (int y = 0; y < N; ++y) {
					for (int z = 0; z < N; ++z) {
						if (!xy[x][y] && !yz[y][z] && !xz[x][z]) ++ans;
					}
				}
			}
			System.out.println(ans);
		}
	}

}