/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Main {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] dp = new int[3];
		dp[0] = s.charAt(0)=='R'?1:0;
		int max = dp[0];
		for(int i = 1; i<s.length(); i++) {
		    dp[i] = s.charAt(i)=='R'?dp[i-1]+1:0;
		    max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}