import java.util.*;

public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] edge = new ArrayList[N + 1];
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			if (edge[u] == null) {
				edge[u] = new ArrayList<>();
			}
			edge[u].add(v);
		}
		int S = sc.nextInt();
		int T = sc.nextInt();
		long[][] visited = new long[N + 1][3];
		Queue<Integer> q = new ArrayDeque<>();

		long ans = -1;
		q.add(S * 3 + 0);
		visited[S][0] = 1;
		while (q.size() > 0) {
			int value = q.poll();
			int node = value / 3;
			int step = value % 3;
			long numStep = visited[node][step];
			if (node == T && step == 0) {
				ans = (numStep - 1) / 3;
				break;
			}
			if (edge[node] != null) {
				int nextStep = (step + 1) % 3;
				for (int next : edge[node]) {
					if (visited[next][nextStep] == 0) {
						visited[next][nextStep] = numStep + 1;
						q.add(next * 3 + nextStep);
					}
				}
			}
		}

		System.out.println(ans);
	}
}
