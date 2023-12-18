import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private static final Comparator<int[]> COMPARATOR = new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			int result = -(o1[2] - o2[2]);
			if (result == 0) {
				result = o1[3] - o2[3];
				if (result == 0) {
					result = (o1[0] - o2[0]);
				}
			}
			return result;
		}
	};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] team = new int[300][4];
		int[] count = new int[1000];
		for (int n = in.nextInt(); n > 0; n = in.nextInt()) {
			for (int i = 0; i < n; i++) {
				team[i][0] = in.nextInt();
				team[i][1] = in.nextInt() - 1;
				team[i][2] = in.nextInt();
				team[i][3] = in.nextInt();
			}
			Arrays.sort(team, 0, n, COMPARATOR);
			Arrays.fill(count, 0);
			int selected = 0;
			for (int i = 0; i < n; i++) {
				final int[] t = team[i];
				final int group = t[1];
				if (selected < 10 && count[group] < 3 || selected < 20
						&& count[group] < 2 || selected < 26
						&& count[group] == 0) {
					selected++;
					count[group]++;
					System.out.println(t[0]);
				}
			}
		}
	}
}