//package src;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;

	public static void main(String args[]) {
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		long memo[]=new long[n+1];
		Arrays.fill(memo, -1);
		System.out.println(mincost(arr, 0,memo));
	}
		public static long mincost(int arr[],int i,long memo[])
		{	int n=arr.length;
			if(i==n-1)
				return 0;
			if(i>=n)
				return Integer.MAX_VALUE;
			if(memo[i]!=-1)
				return memo[i];
			long a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
			a=mincost(arr, i+1,memo)+Math.abs(arr[Math.min(i,n-1 )]-arr[Math.min(i+1, n-1)]);
			b=mincost(arr, i+2,memo)+Math.abs(arr[Math.min(i,n-1 )]-arr[Math.min(i+2, n-1)]);
			memo[i]=Math.min(a, b);
			return Math.min(a, b);
		}
	public static int decode(String str, int i, int[] memo) {
		if (i == 0) {
			return 1;
		}
		int ind = str.length() - i;
		if (str.charAt(ind) == '0')
			return 0;
		if (memo[i] != -1)
			return memo[i];
		int res = decode(str, i - 1, memo);
		if (i >= 2 && Integer.parseInt(str.substring(ind, ind + 2)) <= 26) {
			res += decode(str, i - 2, memo);
		}
		memo[i] = res;
		return res;
	}

	public static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static String factorial(int n) {
		BigInteger fac = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac.toString();
	}

}

class pair {
	int a;
	int b;

	pair(int x, int y) {
		this.a = x;
		this.b = y;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub
		int a = o1.a - o2.a;
		if (a < 0)
			return -1;
		else
			return 1;
	}

}
