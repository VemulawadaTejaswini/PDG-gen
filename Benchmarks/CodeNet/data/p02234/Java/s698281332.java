import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
//		int n = 30*15*35 + 30*5*15 + 30*10*5 + 30*20*10 + 30*25*20;
//		System.out.println(n);
//
//		int l = 30*35*5 + 35*15*5 + 30*5*25 + 5*10*20 + 5*20*25;
//		System.out.println(l);
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] M = new int[n][2];
		for (int i=0; i < n; i++) {
			String[] data = br.readLine().split(" ");
			M[i][0] = Integer.parseInt(data[0]);
			M[i][1] = Integer.parseInt(data[1]);
		}

		memo = new int[n+1][n+1][3];
		ismemorized = new boolean[n+1][n+1];

		int ans = miniCost(M, 0, M.length)[2];
		System.out.println(ans);
	}

	static int[][][] memo;

	static boolean[][] ismemorized;

	public static int[] miniCost(int[][] M, int begin, int end) {
		if (ismemorized[begin][end]) return memo[begin][end];

		if (end - begin == 1) {
			ismemorized[begin][end] = true;
			return memo[begin][end] = new int[] { M[begin][0], M[begin][1], 0 };
		}

		int mini = Integer.MAX_VALUE;
		for (int mid = begin+1; mid < end; mid++) {
			int newcost = miniCost(M, begin, mid)[0] * miniCost(M, mid, end)[1] * miniCost(M, begin, mid)[1];
			int oldcost = miniCost(M, begin, mid)[2] + miniCost(M, mid, end)[2];
			if (mini > newcost + oldcost) {
				mini = newcost + oldcost;
			}
		}
		ismemorized[begin][end] = true;
		return memo[begin][end] =  new int[] {M[begin][0], M[end-1][1], mini};
	}
}