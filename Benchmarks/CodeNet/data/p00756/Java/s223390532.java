import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] x;
	static int[] y;
	static int[] r;
	static int[] c;
	static boolean[][] cover;
	static HashMap<Integer, Integer> dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			if (n==0) {
				break;
			}
			x = new int[n];
			y = new int[n];
			r = new int[n];
			c = new int[n];
			cover = new boolean[n][n];
			dp = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
				c[i] = sc.nextInt()-1;
				for(int j=0;j<i;j++) {
					int dx = x[j] - x[i];
					int dy = y[j] - y[i];
					int rs = r[i] + r[j];
					if (dx*dx+dy*dy<rs*rs) {
						cover[j][i] = true;
					}
				}
			}
			System.out.println(dfs(0));
		}
	}

	public static int dfs(int used) {
		if (dp.containsKey(used)) {
			return dp.get(used);
		}
		int[][] canuse = new int[4][6];
		int[] canusenum = new int[4];
		for(int i=0;i<n;i++) {
			if (((1<<i)&used) == 0) {
				boolean flag = true;
				for(int j=0;j<i;j++) {
					if (((1<<j)&used) == 0 && cover[j][i]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					canuse[c[i]][canusenum[c[i]]++] = i;
				}
			}
		}
		int ret = 0;
		boolean flag = false;
		for(int i=0;i<4;i++) {
			if (canusenum[i] >= 2) {
				for(int j=0;j<canusenum[i]-1;j++) {
					for(int k=j+1;k<canusenum[i];k++) {
						int usednext = used | (1<<canuse[i][j]) | (1<<canuse[i][k]);
						ret = Math.max(ret, dfs(usednext));
						flag = true;
					}
				}
			}
		}
		ret = flag ? ret + 2 : 0;
		dp.put(used, ret);
		return ret;
	}

}