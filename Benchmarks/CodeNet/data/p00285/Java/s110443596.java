import java.util.*;
public class Main {
	static String S;
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int w = sc.nextInt();
			if(m == 0 && w == 0) break;
			int[] bm = new int[m];
			int[] bw = new int[w];
			
			for (int i = 0; i < m; i++) {
				bm[i] = sc.nextInt();
			}
			for (int i = 0; i < w; i++) {
				bw[i] = sc.nextInt();
			}
			int t = 1 << m << w;
			int[] dp = new int[t];
			for (int i = 0; i < t; i++) {
				for (int j = 0; j < m; j++) {
					int p = 1 << j << w;
					if ((i & p) != 0) {
						continue;
					}
					for (int k = 0; k < w; k++) {
						if ((i & (1 << k)) != 0) {
							continue;
						}
						int a = i | p | (1 << k);
						dp[a] = Math.max(dp[a],dp[i] + Math.abs(bm[j] - bw[k]) * (Math.abs(bm[j] - bw[k]) - 30) * (Math.abs(bm[j] - bw[k]) - 30));
					}
				}
			}
			System.out.println(dp[(1 << m << w) - 1]);
		}




	}

}