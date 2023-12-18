import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int N = in.nextInt();
			int Q = in.nextInt();
			if (N == 0 && Q == 0) {
				break;
			}
			int[] p = new int[N + 1];
			for (int i = 2; i <= N; i++) {
				p[i] = in.nextInt();
			}
			
			char[] c = new char[Q + 1];
			int[] v = new int[Q + 1];
			boolean[] marked = new boolean[N + 1];
			marked[1] = true;
			for (int j = 1; j <= Q; j++) {
				c[j] = in.next().charAt(0);
				v[j] = in.nextInt();
				if (c[j] == 'M') {
					marked[v[j]] = true;
				}
			}
			int[] parent = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				parent[i] = marked[i] ? -1 : p[i];
			}
			
			long sum = 0;
			for (int j = Q; j >= 1; j--) {
				if (c[j] == 'M') {
					parent[v[j]] = p[v[j]];
				}
				if (c[j] == 'Q') {
					ArrayList<Integer> list = new ArrayList<Integer>();
					int i = v[j];
					while (parent[i] != -1) {
						list.add(i);
						i = parent[i];
					}
					for (int _i: list) {
						parent[_i] = i;
					}
					sum += i;
				}
			}
			System.out.println(sum);
		}
	}
}