import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		MSTree mst = new MSTree(n);

		for (int y = 0; y < n; y++)
			for (int x = 0; x < n; x++)
				mst.setLeng(x, y, scan.nextInt());

		System.out.println(mst.getMinTree());

		scan.close();
		System.exit(0);
	}
}

class MSTree {
	int[][] leng;
	int[] preLeng;
	int[] reachLeng;

	public MSTree(int n) {
		leng = new int[n][n];
		preLeng = new int[n];
		reachLeng = new int[n];
		for (int i = 1; i < n; i++)
			reachLeng[i] = Integer.MAX_VALUE;
	}

	public int getMinTree() {
		setMin(0);

		int total = 0;
		for (int i = 1; i < preLeng.length; i++)
			total += preLeng[i];
		return total;
	}

	private void setMin(int from) {
		for (int next = 0; next < leng.length; next++)
			if (leng[from][next] > 0) {
				int d = reachLeng[from] + leng[from][next];
				if (d < reachLeng[next]) {
					reachLeng[next] = d;
					preLeng[next] = leng[from][next];
					setMin(next);
				}
			}
	}

	public void setLeng(int x, int y, int length) {
		leng[x][y] = length;
	}

}