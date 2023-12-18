import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int dfs(int[][] m, boolean[] visited, int cur, int l) {
		visited[cur] = true;
		int len = l;
		for (int e : m[cur]) {
			if (!visited[e]) {
				len = Math.max(len, dfs(m, visited, e, l + 1));
			}
		}
		visited[cur] = false;
		return len;
	}

	public static int[][] getAdjMap(int max, int[][] uedge) {
		int[][] m = new int[max + 1][];
		int[] p = new int[max + 1];
		for (int[] ue : uedge) {
			p[ue[0]]++;
			p[ue[1]]++;
		}
		for (int i = 1; i <= max; i++)
			m[i] = new int[p[i]];
		for (int i = 0; i < uedge.length; i++) {
			m[uedge[i][0]][--p[uedge[i][0]]] = uedge[i][1];
			m[uedge[i][1]][--p[uedge[i][1]]] = uedge[i][0];// counter edge
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			if (n == 0)
				break;
			int[][] p = new int[n * 2][2];
			int[] d = new int[101];
			Arrays.fill(d, 0);
			int max = 0;
			for (int i = 0; i < n; i++) {
				p[i * 2 + 1][1] = p[i * 2][0] = s.nextInt();
				p[i * 2 + 1][0] = p[i * 2][1] = s.nextInt();
				if (p[i * 2][0] > max)
					max = p[i * 2][0];
				if (p[i * 2][1] > max)
					max = p[i * 2][1];
				d[p[i * 2][0]]++;
				d[p[i * 2][1]]++;
			}
			// 次数の少ない点が始点/終点足りうる
			int md = 10000;
			for (int i = 1; i <= max; i++) {
				md = Math.min(md, d[i]);
			}
			md += 2;

			int[][] m = getAdjMap(max, p);
			boolean[] visited = new boolean[max + 1];
			Arrays.fill(visited, false);

			int l = 0;
			for (int i = 1; i <= max; i++) {
				if (md > d[i]) {
					l = Math.max(l, dfs(m, visited, i, 1));
				}
			}
			System.out.println(l);
		}
	}
}