import java.util.Scanner;


public class Main {

	public static int idx(int x, int y, int N) {
		return x+(y*(2*N+1)-y*y)/2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), M = sc.nextInt();

		int[] g = new int[12512502];

		// 右下の配置
		int a, b, xx;
		for (int i = 0 ; i < M ; i++) {
			a = (N+1) - sc.nextInt(); // aは反転させる
			b= sc.nextInt();
			xx = sc.nextInt();
			g[idx(a-xx-1, b-1, N)] = Math.max(g[idx(a-xx-1, b-1, N)], xx+1);
		}

		// 上方向への展開
		for (int x = 0 ; x < N ; x++) {
			for (int y = 0 ; y < (N+1)-x ; y++) {
				if (y == 0) {
					if (x != 0) g[idx(x, y, N)] = Math.max(g[idx(x, y, N)], g[idx(x-1, y, N)]-1);
				} else {
					if (x == 0) g[idx(x, y, N)] = Math.max(g[idx(x, y, N)], g[idx(x, y-1, N)]-1);
					else {
						g[idx(x, y, N)] = Math.max(g[idx(x, y, N)], Math.max(g[idx(x-1, y, N)]-1, g[idx(x, y-1, N)]-1));
					}
				}
			}
		}

		long count = 0;
		for (int i = 0 ; i < N*(N+1)/2 ; i++)
			if (g[i] != 0) count++;

		System.out.println(count);

	}
}