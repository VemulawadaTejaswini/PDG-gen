import java.util.*;
import java.io.*;

public class Main {
	static int dp[];
	static int k;
	public static void main(String[] args) throws IOException {	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		dp=new int[n];
		Arrays.fill(dp, -1);
		
		System.out.println(rec(0,a));
		
	}

	private static int rec(int i, int[] a) {
		if(dp[i]!=-1)
			return dp[i];
		if(i>=a.length)
			return (int)(1e5);
		if(i==a.length-1)
			return 0;
		
		
		int op=Integer.MAX_VALUE;
		for(int j=1;j<=k;j++) {
			if(i+j<a.length)
				op=Math.min(op,Math.abs(a[i]-a[i+j])+rec(i+j, a));
		}
		
		
		
		return dp[i]=op;
	}
}