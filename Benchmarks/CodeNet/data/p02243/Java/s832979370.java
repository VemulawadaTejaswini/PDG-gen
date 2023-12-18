import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		SSSPath sp = new SSSPath(n);

		for (int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			for (int j = 0; j < k; j++)
				sp.addPath(u, scan.nextInt(), scan.nextInt());
		}
		sp.setPath(0);

		for (int i = 0; i < n; i++)
			System.out.println(i + " " + sp.getResult(i));

		scan.close();
		System.exit(0);
	}
}

class SSSPath {
	int[][] cost;
	int[] reach;
	boolean[] fixed;
	Bheap bheap;

	public SSSPath(int n) {
		cost = new int[n][n];
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				cost[x][y] = -1;

		reach = new int[n];
		for (int i = 0; i < n; i++)
			reach[i] = -1;

		fixed = new boolean[n];
		bheap = new Bheap(n);
	}

	public int getResult(int i) {
		return reach[i];
	}

	public void setPath(int from) {
		reach[from] = 0;
		bheap.add(from, 0);
		setP();
	}

	private void setP() {
		int p;
		while ((p = bheap.getTop()) != -1) {
			if (fixed[p])
				continue;
			fixed[p] = true;
			for (int to = 0; to < cost[p].length; to++)
				if (cost[p][to] > 0) {
					int d = reach[p] + cost[p][to];
					if (reach[to] == -1 || reach[to] > d) {
						reach[to] = d;
						bheap.add(to, d);
					}
				}
		}
	}

	public void addPath(int from, int to, int c) {
		cost[from][to] = c;
	}

}

class Bheap {
	int[] key;
	int[] pt;
	int cnt = 0;

	public Bheap(int n) {
		key = new int[n * n];
		pt = new int[n * n];
	}

	public int getTop() {
		if (cnt == 0)
			return -1;
		int rpt = pt[1];
		key[1] = key[cnt];
		pt[1] = pt[cnt];
		cnt--;
		this.down(1);
		return rpt;
	}

	private void down(int c) {
		int min = c;
		if (c * 2 <= cnt && key[c * 2] < key[min])
			min = c * 2;
		if (c * 2 + 1 <= cnt && key[c * 2 + 1] < key[min])
			min = c * 2 + 1;
		if (min == c)
			return;

		int t = key[c];
		key[c] = key[min];
		key[min] = t;
		t = pt[c];
		pt[c] = pt[min];
		pt[min] = t;

		this.down(min);
	}

	public void add(int ptr, int cost) {
		cnt++;
		key[cnt] = cost;
		pt[cnt] = ptr;
		this.up(cnt);
	}

	private void up(int c) {
		if (c < 2 || key[c] >= key[c / 2])
			return;

		int t = key[c];
		key[c] = key[c / 2];
		key[c / 2] = t;
		t = pt[c];
		pt[c] = pt[c / 2];
		pt[c / 2] = t;

		this.up(c / 2);
	}

}