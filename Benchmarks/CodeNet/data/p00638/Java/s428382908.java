import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int flag = in.nextInt();
		while (flag != 0) {
			int n = flag;
			Island[] island = new Island[n];
			int w = 0;
			for (int i = 0; i < n; i++) {
				island[i] = new Island(in.nextInt(), in.nextInt());
				w += island[i].juel;
			}
			Arrays.sort(island);
			boolean isYes = true;
			for (Island a : island) {
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