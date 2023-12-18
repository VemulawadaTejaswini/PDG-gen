import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int[][] costTable = new int[m][m];
			int[][] timeTable = new int[m][m];
			for (int i = 0; i < m; i++)
				for (int j = 0; j < m; j++) {
					costTable[i][j] = 0;
					timeTable[i][j] = 0;
				}
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int cost = sc.nextInt();
				int time = sc.nextInt();
				costTable[a][b] = cost;
				costTable[b][a] = cost;
				timeTable[a][b] = time;
				timeTable[b][a] = time;
			}
			int[][] mincost = new int[m][m];
			int[][] mintime = new int[m][m];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					mincost[i][j] = Integer.MAX_VALUE;
					mintime[i][j] = Integer.MAX_VALUE;
				}
				PriorityQueue<Data> costQueue = new PriorityQueue<Data>();
				PriorityQueue<Data> timeQueue = new PriorityQueue<Data>();
				costQueue.add(new Data(0, i));
				timeQueue.add(new Data(0, i));
				while (!costQueue.isEmpty()) {
					Data d = costQueue.poll();
					if (d.cost < mincost[i][d.num]) {
						mincost[i][d.num] = d.cost;
						for (int j = 0; j < m; j++)
							if (costTable[d.num][j] > 0)
								costQueue.add(new Data(d.cost
										+ costTable[d.num][j], j));
					}
				}
				while (!timeQueue.isEmpty()) {
					Data d = timeQueue.poll();
					if (d.cost < mintime[i][d.num]) {
						mintime[i][d.num] = d.cost;
						for (int j = 0; j < m; j++)
							if (timeTable[d.num][j] > 0)
								timeQueue.add(new Data(d.cost
										+ timeTable[d.num][j], j));
					}
				}
			}
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int p = sc.nextInt() - 1;
				int q = sc.nextInt() - 1;
				int r = sc.nextInt();
				if (r == 0)
					System.out.println(mincost[p][q]);
				if (r == 1)
					System.out.println(mintime[p][q]);
			}
		}
		sc.close();
	}
}

class Data implements Comparable<Data> {
	int cost;
	int num;

	Data(int c, int n) {
		cost = c;
		num = n;
	}

	public int compareTo(Data o) {
		return new Integer(this.cost).compareTo(new Integer(o.cost));
	}
}