import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			int s = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			int d = sc.nextInt();
			int[][] g = new int[d][n];
			for(int i = 0; i < d; i++) {
				for(int j = 0; j < n; j++) {
					g[i][j] = -1;
				}
			}
			for(int i = 0; i < d; i++) {
				String t = sc.next();
				for(int j = 0; j < n - 1; j++) {
					if(t.charAt(j) == '1') {
						g[i][j] = j + 1;
						g[i][j + 1] = j;
					}
				}
			}
			if(solve(n, d, g, s, k)) {
				System.out.println(0);
			}else {
				boolean flag = true;
				loop: for(int i = 0; i < d; i++) {
					for(int j = 0; j < n - 1; j++) {
						if(g[i][j] == -1 && g[i][j + 1] == -1) {
							g[i][j] = j + 1;
							g[i][j + 1] = j;
							if(solve(n, d, g, s, k)) {
								System.out.printf("%d %d\n", i + 1, j + 1);
								flag = false;
								break loop;
							}
							g[i][j] = -1;
							g[i][j + 1] = -1;
						}
					}
				}
				if(flag) {
					System.out.println(1);
				}
			}
		}
		sc.close();
	}
	static boolean solve(int n, int d, int[][] g, int s, int k) {
		int h = 0;
		for(int i = 0; i < d; i++) {
			if(g[h][s] != -1) {
				s = g[h][s];
				h++;
			}else {
				h++;
			}
		}
		if(s == k) return true;
		return false;
	}
}
