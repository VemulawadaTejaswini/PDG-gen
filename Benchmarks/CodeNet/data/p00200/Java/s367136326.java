import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int[][] costtable = new int[m][m];
			int[][] timetable = new int[m][m];
			for (int i = 0; i < m; i++)
				for (int j = 0; j < m; j++) {
					costtable[i][j] = 0;
					timetable[i][j] = 0;
				}
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int cost = sc.nextInt();
				int time = sc.nextInt();
				costtable[a][b] = cost;
				costtable[b][a] = cost;
				timetable[a][b] = time;
				timetable[b][a] = time;
			}
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int p = sc.nextInt() - 1;
				int q = sc.nextInt() - 1;
				int r = sc.nextInt();
				int[] table = new int[m];
				Arrays.fill(table, Integer.MAX_VALUE);
				PriorityQueue<Data> queue = new PriorityQueue<Data>();
				queue.add(new Data(0, p));
				while (!queue.isEmpty()) {
					Data d = queue.poll();
					if (d.cost < table[d.num]) {
						table[d.num] = d.cost;
						for (int j = 0; j < m; j++) {
							switch (r) {
							case 0:
								if (costtable[d.num][j] > 0)
									queue.add(new Data(d.cost
											+ costtable[d.num][j], j));
								break;
							case 1:
								if (timetable[d.num][j] > 0)
									queue.add(new Data(d.cost
											+ timetable[d.num][j], j));
								break;
							}
						}
					}
				}
				System.out.println(table[q]);
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