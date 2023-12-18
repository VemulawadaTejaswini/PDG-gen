import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			boolean[][] map = new boolean[n][n];
			int[] fnum = new int[n];
			int[][] ffnum = new int[n][n];
			int fcount = 0;
			int[] ffcount = new int[n];
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				if (a == 0) {
					fnum[fcount] = b;
					fcount++;
				} else {
					ffnum[a][ffcount[a]] = b;
					ffcount[a]++;
					ffnum[b][ffcount[b]] = a;
					ffcount[b]++;
				}
				map[a][b] = true;
				map[b][a] = true;
			}
			int count = fcount;
			for (int i = 0; i < fcount; i++) {
				int id = fnum[i];
				for (int j = 0; j < ffcount[id]; j++) {
					int fid = ffnum[id][j];
					if (!map[0][fid]) {
						count++;
					}
					map[0][fid] = true;
				}
			}
			System.out.println(count);
		}
	}
}