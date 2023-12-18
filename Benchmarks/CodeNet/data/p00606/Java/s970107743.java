import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static char s, t, b;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}

	static boolean read() {
		n = sc.nextInt();
		if (n == 0) return false;
		
		s = sc.next().charAt(0);
		t = sc.next().charAt(0);
		b = sc.next().charAt(0);
		
		return true;
	}

	static void solve() {
		double[][] rooms = new double[5][5];
		for (int i = 0; i < 5; i++) fill(rooms[i], 0);
		int pos_s = s - 'A', pos_t = t - 'A', pos_b = b - 'A';
		rooms[pos_s / 3 + 1][pos_s % 3 + 1] = 1.0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					if ((j != (pos_b / 3 + 1)) || (k != (pos_b % 3 + 1))) {
						double cur = 0.0;
						for (int l = 0; l < 4; l++) {
							cur = max(cur, rooms[j + dy[l]][k + dx[l]]);
						}
						rooms[j][k] = cur * 0.25;
					}
				}
			}
		}
		
		System.out.printf("%.8f", rooms[pos_t / 3 + 1][pos_t % 3 + 1]);
	}
}