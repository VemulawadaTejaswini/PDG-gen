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
		int n;
		n = in.nextInt();
		int []nums = new int[n];
		for (int i=0; i<n; i++) nums[i] = in.nextInt();
		int dp[] = new int[n+1];
		for (int i=1; i<n; i++) {
			dp[i] = dp[i-1]+Math.abs(nums[i] - nums[i-1]);
			if (i-2 >= 0) 
				dp[i] = Math.min(dp[i],dp[i-2] +Math.abs(nums[i] - nums[i-2]));
		}
		// for (int i=0; i<n; i++)
		// 	System.out.print(dp[i]+" ");
		// System.out.println();
		System.out.println(dp[n-1]);
	}
}