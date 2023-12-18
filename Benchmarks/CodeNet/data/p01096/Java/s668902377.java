import java.util.Scanner;

public class Main{
	static int[][] dp=new int[301][301];
	static int[] w=new int[301];
	static int rec(int l, int r) {
		if(dp[l][r]<0) {
			return dp[l][r];
		}
		if(l>=r) {
			return 0;
		}
		int res=0;
		if(Math.abs(w[l]-w[r])<=1 && rec(l+1, r-1)==r-l-1) {
			res = r- l + 1;
		}
		for(int mid=l; mid<r; mid++) {
			res = Math.max(res, rec(l,mid)+rec(mid+1,r));
		}
		return dp[l][r]=res;
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) {
					break;
				}
				for(int i=0; i<n; i++) {
					w[i]=sc.nextInt();
				}
				System.out.println(rec(0, n-1));
			}
			
		}
	}
}
