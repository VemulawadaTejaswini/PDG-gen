/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    static int[] h;
    static int[] dp;
    static int n, k;
    
    static int solve(int start, int end)
    {
        //base cases
        if(end-start<=0)
			return 0;
		if(end-start==1)
		    return Math.abs(h[end]-h[start]);
		
        
        if(dp[start]==-1)
        {
            int temp = Integer.MAX_VALUE;
            for(int i = 1; i<=k; i++)
            {   
                if(start + i<=n - 1)
                    temp = Math.min(temp, solve(start + i, end) + Math.abs(h[start] - h[start + i]));
            }
            dp[start] = temp;
            return temp;
        }
        else
            return dp[start];
    }
    
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		n = scn.nextInt();
		k = scn.nextInt();
		
		h = new int[n];
		dp = new int[n];
		
		for(int i=0; i<n; i++)
			h[i] = scn.nextInt();
		
		Arrays.fill(dp, -1); 
		
		System.out.println(solve(0, n-1));
	}
}