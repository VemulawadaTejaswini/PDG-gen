import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		DoProb x = new DoProb();
		int r = x.result(0, 0);
		System.out.println(r);
		System.exit(0);
	}
}

class DoProb {
	private int town;
	private int day;
	private int[] nD;
	private int[] mW;
	private int[][] cost;

	DoProb() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		town = scan.nextInt();
		day = scan.nextInt();

		nD = new int[town];
		mW = new int[day];
		for (int i = 0; i < town; i++)
			nD[i] = scan.nextInt();
		for (int i = 0; i < day; i++)
			mW[i] = scan.nextInt();

		cost = new int[town][day];
		for (int i = 0; i < town; i++)
			for (int j = 0; j < day; j++)
				cost[i][j] = -1;

	}

	public int result(int start, int currday) {
		if (start >= town)
			return (0);

		if (cost[start][currday] > 0)
			return cost[start][currday];

		int r;
		int go = result(start + 1, currday + 1) + (nD[start] * mW[currday]);

		if (day - currday == town - start)
			r = go;
		else {
			int wait = result(start, currday + 1);
			if (wait < go)
				r = wait;
			else
				r = go;
		}

		cost[start][currday] = r;
		return r;
	}

}