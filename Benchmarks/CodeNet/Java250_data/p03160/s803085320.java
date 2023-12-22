import java.util.*;
import java.io.*;

public class Main {
	static int dp[];
	public static void main(String[] args) throws IOException {	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
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
			return Integer.MAX_VALUE-100;
		if(i==a.length-1)
			return 0;
		
		
		int op1=Integer.MAX_VALUE,op2=Integer.MAX_VALUE;
		if(i+1<a.length)
		op1=Math.abs(a[i]-a[i+1])+rec(i+1, a);
		if(i+2<a.length)
		op2=Math.abs(a[i]-a[i+2])+rec(i+2, a);
		
		
		return dp[i]= Math.min(op1, op2);
	}
}