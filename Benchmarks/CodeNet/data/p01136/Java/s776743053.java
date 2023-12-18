import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;

	static boolean ok(boolean[][] dp,int d) {
		boolean[] p = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			if(dp[d][i]) p[i] = true;
		}
		for(int i=d-1;i>=1;i--) {
			boolean ok = false;
			for(int j=1;j<=n;j++) {
				if(dp[i][j] && p[j]) ok = true;
			}
			if(ok) {
				for(int j=1;j<=n;j++) {
					if(dp[i][j]) p[j] = true;
				}
			}
		}
//		for(int i=1;i<=n;i++) {
//			System.out.print(p[i] + " ");
//		}
		for(int i=1;i<=n;i++) {
			if(!p[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		while(true) {
			n = sc.nextInt();
			if(n==0) break;
			boolean[][] dp = new boolean[31][n+1];
			for(int i=1;i<=n;i++) {
				int a = sc.nextInt();
				for(int j=0;j<a;j++) {
					int d = sc.nextInt();
					dp[d][i] = true;
				}
			}
			int ans = -1;
			for(int i=1;i<=30;i++) {
				if(ok(dp,i)) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}

