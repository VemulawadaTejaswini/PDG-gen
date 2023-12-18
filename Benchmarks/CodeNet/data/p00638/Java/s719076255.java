
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int flag = in.nextInt();
		while (flag != 0) {
			int n = flag;
			SortedSet<Island> island = new TreeSet<Main.Island>();
			int w = 0;
			for (int i = 0; i < n; i++) {
				Island island2 = new Island(in.nextInt(), in.nextInt());
				if (island2.juel != 0) island.add(island2);
				w += island2.juel;
			}
			for (Island a : island) {
				if (w > a.bridge) {
					break;
				}
				w -= a.juel;
			}
			System.out.println(w == 0 ? "Yes" : "No");
			flag = in.nextInt();
		}
	}

	static class Island implements Comparable<Island> {
		final int juel;
		final int bridge;

		Island(int juel, int bridge) {
			this.juel = juel;
			this.bridge = bridge;
		}

		@Override
		public int compareTo(Island o) {
			return o.bridge < bridge ? -1 : o.bridge == bridge ? 0 : 1;
		}

	}
}