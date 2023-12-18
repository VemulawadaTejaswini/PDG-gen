
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				solve();
			}
		}
	}
	
	int[][] pos = {
			{0,1,2,3},
			{1,0,3,2},
			{2,3,0,1},
			{3,2,1,0},
	};
	int[][] sign = {
		{1, 1, 1, 1},
		{1, -1, 1, -1},
		{1, -1, -1, 1},
		{1, 1, -1, -1},
	};
	
	
	void solve() {
		int[] t = new int[4]; for (int i = 0; i < 4; i++) t[i] = sc.nextInt();
		int[] s = new int[4]; for (int i = 0; i < 4; i++) s[i] = sc.nextInt();
		
		int[] m = new int[4];
		
		for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			m[ pos[i][j] ] += sign[i][j] * t[i] * s[j];
		}
		}
		System.out.println(m[0] + " " + m[1] + " " + m[2] + " " + m[3]);
	}
}