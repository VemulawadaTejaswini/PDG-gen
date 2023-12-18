import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long startCpuTime = threadMXBean.getCurrentThreadCpuTime(), stopCpuTime = 0;

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0545-input.txt"));

		while (scan.hasNext()) {

			int m = scan.nextInt();
			int n = scan.nextInt();
			if (m == 0 && n == 0)
				break;
			Map mp = new Map(m, n);
			for (int y = 0; y < n; y++)
				for (int x = 0; x < m; x++)
					mp.add(x, y, scan.nextInt());
			System.out.println(mp.count());
			// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();

		}

		scan.close();
		// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Map {
	int[][] mp;
	boolean[][] flg;
	int stx = -1, sty = -1;
	int cnt = 0;

	public Map(int m, int n) {
		mp = new int[m][n];
		flg = new boolean[m][n];
	}

	public int count() {
		return search(stx, sty, cnt);
	}

	private int search(int x, int y, int c) {
		if (c == 0)
			if (isReach(x, y, stx, sty))
				return 1;
			else
				return 0;

		int ret = 0;
		for (int i = x + 1; i < flg.length; i++)
			if (flg[i][y]) {
				flg[i][y] = false;
				ret += search(i, y, c - 1);
				flg[i][y] = true;
				break;
			}
		for (int i = x - 1; i >= 0; i--)
			if (flg[i][y]) {
				flg[i][y] = false;
				ret += search(i, y, c - 1);
				flg[i][y] = true;
				break;
			}
		for (int i = y + 1; i < flg[0].length; i++)
			if (flg[x][i]) {
				flg[x][i] = false;
				ret += search(x, i, c - 1);
				flg[x][i] = true;
				break;
			}
		for (int i = y - 1; i >= 0; i--)
			if (flg[x][i]) {
				flg[x][i] = false;
				ret += search(x, i, c - 1);
				flg[x][i] = true;
				break;
			}
		return ret;
	}

	private boolean isReach(int x, int y, int x2, int y2) {
		if (x == x2) {
			for (int i = y + 1; i <= y2; i++)
				if (i == y2)
					return true;
			for (int i = y - 1; i >= y2; i--)
				if (i == y2)
					return true;
		}
		if (y == y2) {
			for (int i = x + 1; i <= x2; i++)
				if (i == x2)
					return true;
			for (int i = x - 1; i >= x2; i--)
				if (i == x2)
					return true;
		}
		return false;
	}

	public void add(int x, int y, int s) {
		mp[x][y] = s;
		if (s == 2) {
			stx = x;
			sty = y;
		}
		if (s == 1) {
			cnt++;
			flg[x][y] = true;
		}
	}
}