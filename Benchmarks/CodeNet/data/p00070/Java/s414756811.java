import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int[][] d = new int[11][100001];
	static int[] max = new int[11];
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			max[i] = (i * (i + 1) * (2 * i + 1)) / 6;
		}
		boolean[] flag = new boolean[10];
		Arrays.fill(flag, true);
		dfs(0, 0, flag);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			//if(n == 0) break;
			int s = sc.nextInt();
			System.out.println(d[n][s]);
		}
		sc.close();
	}
	static void dfs(int n, int t, boolean[] flag) {
		if(n == 11) return;
		for(int i = 0; i < 10; i++) {
			if(flag[i]) {
				int k = t + i * (n + 1);
				d[n + 1][k]++;
				flag[i] = false;
				dfs(n + 1, k, flag);
				flag[i] = true;
			}

		}
	}
}
