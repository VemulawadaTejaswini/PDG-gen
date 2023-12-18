import java.util.*;

class Main {
	
	int inns, roads, money;
	int[][] charge, enemy;
	
	boolean[][] v;
	
	int dijkstra() {
		v = new boolean[inns + 1][money + 1];
		// {from, distance, enemy}
		Queue<int[]> que = new PriorityQueue<int[]>(1, new Comparator<int[]>() {
			@Override
			public int compare(int[] arg0, int[] arg1) {
				return arg0[2] - arg1[2];
			}
		});
		que.offer(new int[]{1, money, 0});
		while (!que.isEmpty()) {
			int[] p = que.poll();
			int from = p[0], currentMoney = p[1], attacks = p[2];
			
			// ゴールに到達した場合、それが最小の襲われる人数になっている。
			if (from == inns) {
				return attacks;
			}
			
			// PriorityQueueなので最初に見たものが最小の襲われる人数になっている。だから読み飛ばして良い。
			if (v[from][currentMoney]) {
				continue;
			}
			v[from][currentMoney] = true;
			
			for (int to = 1; to <= inns; to++) {
				if (charge[from][to] == 0) continue;
				if (charge[from][to] <= currentMoney) {
					// お金が足りたら襲われなくて済むね。しかもこいつは優先順位が高い。
                    que.offer(new int[]{to, currentMoney - charge[from][to], attacks});
                }
                que.offer(new int[]{to, currentMoney, enemy[from][to] + attacks});	
			}
		}
		return -1;
	}
	
	int solve() {
		return dijkstra();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			inns = sc.nextInt();
			roads = sc.nextInt();
			money = sc.nextInt();
			if (inns == 0 && roads == 0 && money == 0) {
				break;
			} else {
				charge = new int[inns + 1][inns + 1];
				enemy = new int[inns + 1][inns + 1];
				for (int i = 0; i < roads; i++) {
					int a = sc.nextInt(), b = sc.nextInt();
					int d = sc.nextInt(), e = sc.nextInt();
					charge[a][b] = d;
					charge[b][a] = d;
					enemy[a][b] = e;
					enemy[b][a] = e;
				}
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}