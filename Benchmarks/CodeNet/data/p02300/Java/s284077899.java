import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	
	static int INF = 1000000000;
	static int MAXN = 31;
	static long MODULO = 1000000007;
	static int x, y;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] pol = new int[n + 1][2];
		for (int i = 0; i < n; ++i) {
			pol[i][0] = input.nextInt();
			pol[i][1] = input.nextInt();
		}
		int m = 0;
		for (int i = 1; i < n; ++i) {
			if (pol[i][1] < pol[m][1]) m = i;
		}
		for (int i = 0; i < n; ++i) {
			if (pol[i][1] == pol[m][1] && pol[i][0] > pol[m][0]) m = i;
		}
		swap(pol[0], pol[m]);
		pol[n] = Arrays.copyOf(pol[0], 2);
		--pol[n][1];
		x = pol[n][0];
		y = pol[n][1];
		Arrays.sort(pol, 1, n, new Comparator<int[]>() {
			public int compare(int[] p1, int[] p2) {
				return -ccwSort(p1[0], p1[1], p2[0], p2[1]);
			}
		});
		//for (int i = 0; i < n; ++i) System.out.println(pol[i][0] + " " + pol[i][1]);
		m = 3;
		for (int i = 3; i < n; ++i) {
			boolean ok = true;
			while (m > 2 && ccw(pol[m - 2][0], pol[m - 2][1], pol[m - 1][0], pol[m - 1][1], pol[i][0], pol[i][1]) <= 0) {
				if (ccw(pol[m - 2][0], pol[m - 2][1], pol[m - 1][0], pol[m - 1][1], pol[i][0], pol[i][1]) == 0) {
					swap(pol[m - 1], pol[i]);
					ok = false;
					break;
				}
				else --m;
			}
			if (ok) {
				swap(pol[m++], pol[i]);
			}
		}
		System.out.println(m);
		for (int i = 0; i < m; ++i) System.out.println(pol[i][0] + " " + pol[i][1]);
	}
	
	static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
		int a1, b1, a2, b2;
		int p;
		a1 = x2 - x1;
		b1 = y2 - y1;
		a2 = x3 - x2;
		b2 = y3 - y2;
		p = a1 * b2 - a2 * b1;
		if (p < 0) return -1;
		if (p == 0) return 0;
		return 1;
	}
	
	static void swap(int[] p1, int[] p2) {
		int temp = p1[0]; p1[0] = p2[0]; p2[0] = temp;
		temp = p1[1]; p1[1] = p2[1]; p2[1] = temp;
	}
	
	static int ccwSort(int x1, int y1, int x2, int y2) {
		int a1, b1, a2, b2;
		int p;
		a1 = x1 - x;
		b1 = y1 - y;
		a2 = x2 - x1;
		b2 = y2 - y1;
		p = a1 * b2 - a2 * b1;
		if (p < 0) return -1;
		if (p == 0) return 0;
		return 1;
	}
}
	