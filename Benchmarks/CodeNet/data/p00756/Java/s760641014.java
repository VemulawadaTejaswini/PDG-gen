import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] x;
	static int[] y;
	static int[] r;
	static int[] c;
	static boolean[][] cover;
	static int[] dp;

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
			dp = new int[(1<<n)];
			Arrays.fill(dp, -1);
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
				c[i] = sc.nextInt();
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

	@SuppressWarnings("unchecked")
	public static int dfs(int used) {
		if (dp[used]!=-1) {
			return dp[used];
		}
		ArrayList<Integer>[] canuse = new ArrayList[4];
		for(int i=0;i<4;i++) {
			canuse[i] = new ArrayList<Integer>();
		}
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
					canuse[c[i]].add(i);
				}
			}
		}
		int ret = 0;
		boolean flag = false;
		for(int i=0;i<4;i++) {
			if (canuse[i].size() >= 2) {
				for(int j=0;j<canuse[i].size()-1;j++) {
					for(int k=j+1;k<canuse[i].size();k++) {
						int usednext = used | (1<<canuse[i].get(j)) | (1<<canuse[i].get(k));
						ret = Math.max(ret, dfs(usednext));
						flag = true;
					}
				}
			}
		}
		ret = flag ? ret + 2 : 0;
		dp[used] = ret;
		return ret;
	}

}