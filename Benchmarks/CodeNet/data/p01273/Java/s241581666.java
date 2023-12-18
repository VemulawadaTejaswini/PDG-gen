import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			boolean infect[] = new boolean[n + 1];
			infect[1] = true;
			Queue<Data> q = new PriorityQueue<Data>();
			for (int i = 0; i < m; i++) {
				int t = sc.nextInt();
				int s = sc.nextInt();
				int d = sc.nextInt();
				q.add(new Data(t, s, d));
			}
			while (!q.isEmpty()) {
				Data data = q.poll();
				int s = data.s;
				int d = data.d;
				if (infect[s]) {
					infect[d] = true;
				}
			}
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				if (infect[i])
					ans++;
			}
			System.out.println(ans);
		}
	}
}

class Data implements Comparable<Data> {
	public int s;
	public int d;
	public int t;

	Data(int t, int s, int d) {
		this.t = t;
		this.s = s;
		this.d = d;
	}

	public int compareTo(Data a) {
		return a.t;
	}
}