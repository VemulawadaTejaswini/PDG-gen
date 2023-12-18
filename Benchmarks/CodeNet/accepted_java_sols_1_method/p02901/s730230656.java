import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] a = new int[M];
		int[] b = new int[M];
		ArrayList<int[]> key = new ArrayList<int[]>();
		for (int i=0;i<M;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
			int s = 0;
			for (int j=0;j<b[i];j++) {
				int c = Integer.parseInt(sc.next());
				c--;
				s |= 1<<c;
			}
			int[] array = {s, a[i]};
			key.add(array);
		}

		int[] dp = new int[1<<N];
		for (int i=0;i<1<<N;i++) {
			dp[i] = 2_000_000_000;
		}
		dp[0] = 0;
		for (int s=0;s<1<<N;s++) {
			for (int i=0;i<M;i++) {
				int t = s | key.get(i)[0];
				int cost = dp[s] + key.get(i)[1];
				dp[t] = Math.min(dp[t], cost);
			}
		}
		System.out.println(dp[(1<<N)-1]==2_000_000_000 ? -1 : dp[(1<<N)-1]);
	}
}