import java.util.Scanner;

public class Main {
	static class Building {
		int number;
		int x, y;
		double cost;
		boolean mark;
		int route[];

		Building(int number, int x, int y) {
			this.number = number;
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		Building buil[];

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			buil = new Building[n + 1];
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				buil[number] = new Building(number, x, y);
			}

			m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int start = sc.nextInt();
				int goal = sc.nextInt();
				for (int j = 1; j <= n; j++) {
					buil[j].cost = Integer.MAX_VALUE;
					buil[j].mark = false;
					buil[j].route = null;
				}
				buil[start].cost = 0;
				buil[start].mark = true;
				buil[start].route = new int[1];
				buil[start].route[0] = start;
				myDijkstra(buil, n, start, goal);

				if (buil[goal].route == null) {
					System.out.println("NA");
				} else {
					String s = "";
					for (int j = 0; j < buil[goal].route.length; j++) {
						System.out.print(s + buil[goal].route[j]);
						s = " ";
					}
					System.out.println();
				}
			}
		}
	}

	public static void myDijkstra(Building buil[], int n, int start, int goal) {
		if (start == goal) {
			return ;
		}
		for (int i = 1; i <= n; i++) {
			double length = Math.sqrt(Math.pow(buil[i].x - buil[start].x, 2) + Math.pow(buil[i].y - buil[start].y, 2));
			if (length <= 50.0) {
				if (buil[start].cost + length < buil[i].cost) {
					buil[i].cost = buil[start].cost + length;
					buil[i].route = new int[buil[start].route.length + 1];
					for (int j = 0; j < buil[start].route.length; j++) {
						buil[i].route[j] = buil[start].route[j];
					}
					buil[i].route[buil[i].route.length - 1] = buil[i].number;
				}
			}
		}
		int minIndex = -1;
		for (int i = 1; i <= n; i++) {
			double length = Math.sqrt(Math.pow(buil[i].x - buil[start].x, 2) + Math.pow(buil[i].y - buil[start].y, 2));
			if (!buil[i].mark && length <= 50.0 && (minIndex == -1 || buil[i].cost < buil[minIndex].cost)) {
				minIndex = i;
			}
		}
		if (minIndex != -1) {
			buil[minIndex].mark = true;
			myDijkstra(buil, n, minIndex, goal);
		}
	}
}