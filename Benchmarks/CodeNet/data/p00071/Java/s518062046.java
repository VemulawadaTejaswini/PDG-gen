
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	boolean[][] map;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int t=1;t<=n;t++) {
			map = new boolean[15][15];
			for (int i=0;i<8;i++) {
				String l = sc.next();
				for (int j=0;j<8;j++) map[i+3][j+3] = l.charAt(j) == '1';
			}
			int x = sc.nextInt() + 2, y = sc.nextInt() + 2;
			dfs(x, y);
			print(t);
		}
	}
	
	void print(int t) {
		System.out.println("Data " + t + ":");
		for (int i=3;i<11;i++) {
			for (int j=3;j<11;j++) System.out.print((map[i][j] ? "1": "0"));
			System.out.println();
		}
	}
	
	void dfs(int x, int y) {
		map[y][x] = false;
		for (int i=-3;i<=3;i++) {
			if (map[y][x+i]) dfs(x+i, y);
			if (map[y+i][x]) dfs(x, y+i);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}