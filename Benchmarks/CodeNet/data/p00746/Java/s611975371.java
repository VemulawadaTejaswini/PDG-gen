import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int N;
	static int[] n, d;
	static boolean read() {
		N = sc.nextInt();
		if (N == 0) return false;
		n = new int[N - 1];
		d = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			n[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		return true;
	}

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static void solve() {
		int[][] pos = new int[N][2];
		pos[0][0] = pos[0][1] = 0;
		for (int i = 0; i < N - 1; i++) {
			pos[i + 1][0] = pos[n[i]][0] + dx[d[i]];
			pos[i + 1][1] = pos[n[i]][1] + dy[d[i]];
		}
		
		int bx = 0, ux = 0, by = 0, uy = 0;
		for (int i = 1; i < N; i++) {
			int x = pos[i][0], y = pos[i][1];
			if (x < bx) bx = x;
			if (x > ux) ux = x;
			if (y < by) by = y;
			if (y > uy) uy = y;
		}
		System.out.println((ux - bx + 1) + " " + (uy - by + 1));
	}	
	
}