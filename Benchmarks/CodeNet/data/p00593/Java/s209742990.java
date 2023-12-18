import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static int tc;
	public static void main(String[] args) {
		for (tc = 1; read(); tc++) {
			solve();
		}
	}
	
	
	static int N;
	static Scanner sc = new Scanner(System.in);
	static boolean read() {
		N = sc.nextInt();
		if (N == 0) return false;
		return true;
	}
	
	static void solve() {
		int val = 1;
		int[][] jpeg = new int[N][N];
		jpeg[0][0] = val++;
		int m = 0, x = 1, y = 0;
		for (int i = 1; i < N * 2; i++) {
			if (i < N - 1) {
				if (i % 2 == 0) {
					for (; y >= 0; x++, y--) {
						jpeg[y][x] = val++;
					}
				} else {
					for (; x >= 0; x--, y++) {
						jpeg[y][x] = val++;
					}
				}
			} else {
				if (i % 2 == 0) {
					for (; x < N; x++, y--) {
						jpeg[y][x] = val++;
					}
				} else {
					for (; y < N; x--, y++) {
						jpeg[y][x] = val++;
					}					
				}
			}
			
			if (i < N - 1) {
				if (i % 2 == 0) {
					y++;
				} else {
					x++;
				}
			} else {
				if (i % 2 == 0) {
					x--; y += 2;
				} else {
					x += 2; y--;
				}
			}
		}
		
		System.out.println("Case " + tc + ":");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j != N - 1) {
					System.out.print(jpeg[i][j] + " ");
				} else {
					System.out.println(jpeg[i][j]);
				}
			}
		}
	}
}