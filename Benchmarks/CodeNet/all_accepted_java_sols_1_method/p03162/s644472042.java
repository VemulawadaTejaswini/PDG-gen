/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{   
    static int[][] dp;
    static int[] a;
    static int[] b;
    static int[] c;
    static int days;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		days = scan.nextInt();
		dp = new int[3][days];
		a = new int[days]; b = new int[days]; c = new int[days];
		for(int i = 0; i < days; i++){
		    a[i] = scan.nextInt();
		    b[i] = scan.nextInt();
		    c[i] = scan.nextInt();
		}
		if(days == 1){
		    System.out.println(Math.max(a[0], Math.max(b[0], c[0])));
		    return;
		}
		dp[0][0] = Math.max(b[0], c[0]);
		dp[1][0] = Math.max(a[0], c[0]);
		dp[2][0] = Math.max(b[0], a[0]);
		for(int i = 1; i < days; i++){
		    dp[0][i] = Math.max(dp[1][i - 1] + a[i], dp[2][i - 1] + a[i]);
		    dp[1][i] = Math.max(dp[0][i - 1] + b[i], dp[2][i - 1] + b[i]);
		    dp[2][i] = Math.max(dp[1][i - 1] + c[i], dp[0][i - 1] + c[i]);
		}
		System.out.println(Math.max(dp[0][days-1], Math.max(dp[1][days-1], dp[2][days-1])));
	}
/*	public static int chose(int idx, int prev, int sum)
	{
	    if(idx == days - 1) {
	        if(prev == 0) return Math.max(sum + b[days - 1], sum + c[days - 1]);
	        else if(prev == 1) return Math.max(sum + a[days - 1], sum + c[days - 1]);
	        else return Math.max(sum + a[days - 1], sum + b[days - 1]);
	    }
	//    if(memo[prev][idx] != 0) return memo[prev][idx];
	    int f1 = 0;
	    int f2 = 0;
	    if(prev == 0){
	        f1 = chose(idx + 1, 1, sum + b[idx]);
	        f2 = chose(idx + 1, 2, sum + c[idx]);
	    }
	    else if(prev == 1){
	        f1 = chose(idx + 1, 0, sum + a[idx]);
	        f2 = chose(idx + 1, 2, sum + c[idx]);
	    }
	    else
	    {
	        f1 = chose(idx + 1, 1, sum + b[idx]);
	        f2 = chose(idx + 1, 0, sum + a[idx]);
	    }
	 //   memo[prev][idx] = Math.max(f1, f2);
	    return Math.max(f1, f2); //memo[prev][idx];
	}*/
}