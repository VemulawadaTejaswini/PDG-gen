import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		int[][] g = new int[10][10];
		int[][] prev = new int[10][10];
		for (int i = 0; i < 10; i++) {
			Arrays.fill(g[i], INF);
			g[i][i] = 0;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				prev[i][j] = i;
			}
		}
		g[0][1] = g[1][2] = g[2][3] = g[3][4] = g[4][5] = g[5][6] = g[6][7] = g[7][8] = g[8][9] = g[9][5] = g[5][4] = g[4][3] = g[3][2] = g[2][1] = g[1][0] = 1;
		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (g[i][j] > g[i][k] + g[k][j]) {
						g[i][j] = g[i][k] + g[k][j];
						prev[i][j] = k;
					}
				}
			}
		}
		// for (int i = 0; i < 10; i++) {
		// System.out.println(Arrays.toString(prev[i]));
		// }
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		while (n != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			s.push(b);
			while (true) {
				int c = prev[a][b];
				s.push(c);
				if (c == a)
					break;
				b = c;
			}
			boolean init = true;
			while (!s.empty()) {
				if (init) {
					init = false;
				} else {
					System.out.print(" ");
				}
				System.out.print(s.pop());
			}
			System.out.println();
			n--;
		}
	}
}