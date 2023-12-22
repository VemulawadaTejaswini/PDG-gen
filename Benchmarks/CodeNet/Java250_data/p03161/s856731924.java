import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = scn.nextInt();
		} int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
 
		System.out.println(mincostKjump_memoized(1, arr, k, memo));
	}
 
	public static int mincostKjump_memoized(int idx, int[] heights, int k, int[] memo) {
		if (idx == heights.length - 1)return memo[idx] = 0;
		if (memo[idx] != -1)return memo[idx];
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= k && idx + i < heights.length; i++) {
			int cba = mincostKjump_memoized(idx + i, heights, k, memo) + Math.abs(heights[idx + i] - heights[idx]);
			ans = Math.min(ans, cba);
		}
		return memo[idx] = ans;
	}
}