import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Island {
		Island parent;
		
		Island () {
			this.parent = this;
		}
	}

	static class Bridge implements Comparable<Bridge>{
		int number;
		int cost;
		Island v1, v2;

		Bridge (int number, int cost, Island v1, Island v2) {
			this.number = number;
			this.cost = cost;
			this.v1 = v1;
			this.v2 = v2;
		}

		public int compareTo(Bridge o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		Island island[];
		Bridge bridge[];
		int sum;

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			
			island = new Island[n];
			bridge = new Bridge[m];
			sum = 0;
			for (int i = 0; i < n; i++) {
				island[i] = new Island();
			}
			for (int i = 0; i < m; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				int cost = sc.nextInt();
				bridge[i] = new Bridge(i, cost, island[v1], island[v2]);
			}
			Arrays.sort(bridge);
			for (int i = 0; i < m; i++) {
				if (!find(bridge[i].v1).equals(find(bridge[i].v2))) {
					sum += bridge[i].cost;
					union(bridge[i].v1, bridge[i].v2);
				}
			}
			System.out.println(sum);
		}
	}
	
	public static Island find(Island v) {
		if (v.parent.equals(v)) {
			return v;
		}
		return find(v.parent);
	}
	
	public static void union(Island v1, Island v2) {
		Island v3 = find(v1);
		Island v4 = find(v2);
		
		v3.parent = v4;
	}
}