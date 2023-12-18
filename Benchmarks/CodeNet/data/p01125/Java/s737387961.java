import java.util.*;
import static java.util.Arrays.*;
public class Main {

	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] is;
	static char[] cs;
	static int[][] field = new int[21][21];

	static boolean read() {
		M = sc.nextInt();
		if (M == 0) return false;
		for (int i = 0; i <= 20; i++) fill(field[i], 0);
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			field[y][x] = 1;
		}
		
		N = sc.nextInt();
		is = new int[N];
		cs = new char[N];
		for (int i = 0; i < N; i++) {
			cs[i] = sc.next().charAt(0);
			is[i] = sc.nextInt();
		}
		return true;
	}
	
	//					  N    S    W    E
	static int[] dx  = {  0,   0,  -1,   1},
				 dy  = {  1,  -1,   0,   0};
	static void solve() {
		int x = 10, y = 10, gem = 0;
		for (int i = 0; i < N; i++) {
			int k = 0, d = is[i];
			if     (cs[i] == 'N') k = 0;
			else if(cs[i] == 'S') k = 1;
			else if(cs[i] == 'W') k = 2;
			else if(cs[i] == 'E') k = 3;
			
			for (int j = 0; j < d; j++) {
				x += dx[k]; y += dy[k];
				if (field[y][x] == 1) {
					gem++;
					field[y][x] = 0;
				}
			}
		}
		
		if (gem == M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}