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
			boolean isYes = true;
			for (Island a : island) {
				System.out.println("w=" + w + "\t:bridge=" + a.bridge + "\t:juel=" + a.juel);
				if (w > a.bridge) {
					isYes = false;
					break;
				}
				w -= a.juel;
			}
			System.out.println(isYes ? "Yes" : "No");
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