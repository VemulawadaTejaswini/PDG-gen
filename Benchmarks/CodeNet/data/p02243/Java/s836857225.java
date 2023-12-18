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

	public SSSPath(int n) {
		reach = new int[n];
		for (int i = 0; i < n; i++)
			reach[i] = -1;

		cost = new int[n][n];
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				cost[x][y] = -1;
	}

	public int getResult(int i) {
		return reach[i];
	}

	public void setPath(int from) {
		reach[from] = 0;
		setP(from);
	}

	private void setP(int from) {
		for (int to = 0; to < cost[from].length; to++)
			if (cost[from][to] > 0) {
				int d = reach[from] + cost[from][to];
				if (reach[to] == -1 || reach[to] > d) {
					reach[to] = d;
					setP(to);
				}
			}
	}

	public void addPath(int from, int to, int c) {
		cost[from][to] = c;
	}

}