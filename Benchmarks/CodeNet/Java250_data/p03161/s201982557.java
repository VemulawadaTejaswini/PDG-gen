import java.util.*;

class Main{
	static int []segmentTree;

	static void build(int []nums) {
		int n = nums.length;
		for (int i=0; i<n; i++)
			segmentTree[n+i] = nums[i];
		for (int i=n-1; i>0; i--) {
			segmentTree[i] = segmentTree[2*i] + segmentTree[2*i+1];
		}
	}

	static int query(int l, int r, int n) {
		int sum = 0;
		for (l+=n, r+=n; l<r; l>>=1, r>>=1) {
			if ((l&1) == 1) {
				sum += segmentTree[l++];
			}
			if ((r&1) == 1) {
				sum += segmentTree[--r];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, k;
		n = in.nextInt();
		k = in.nextInt();
		int []nums = new int[n];
		for (int i=0; i<n; i++) nums[i] = in.nextInt();
		int dp[] = new int[n+1];
		for (int i=1; i<n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j=1; j<=k; j++) {
				if (i-j >= 0) {
					// System.out.println(dp[i]+" "+(dp[i-j]+Math.abs(nums[i] - nums[i-j])));
					dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(nums[i] - nums[i-j]));
				}
				else {
					break;
				}
			}
		}
		// for (int i=0; i<n; i++)
		// 	System.out.print(dp[i]+" ");
		// System.out.println();
		System.out.println(dp[n-1]);
	}
}