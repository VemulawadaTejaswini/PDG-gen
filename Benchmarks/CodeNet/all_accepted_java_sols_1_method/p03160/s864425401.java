import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] heights = new int[n];
		for(int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}
		
		int[] dp = new int[n]; //min number of cost before reaching i
		
		dp[0] = 0;
		dp[1] = Math.abs(heights[0] - heights[1]);
		for(int i = 2; i < n; i++) {
			dp[i] = Math.min(dp[i-1] + Math.abs(heights[i-1] - heights[i]), dp[i-2] + Math.abs(heights[i-2] - heights[i])); //from i-1 or i-2
		}
		System.out.println(dp[n-1]);
	}
}