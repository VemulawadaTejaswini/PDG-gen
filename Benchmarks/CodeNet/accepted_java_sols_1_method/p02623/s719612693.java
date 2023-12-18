/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		long[] pren = new long[n+1];
		long[] prem = new long[m+1];
		for(int i = 1;i<=n;i++){
			pren[i] = pren[i-1]+in.nextInt();
		}
		for(int i=1;i<=m;i++){
			prem[i] = prem[i-1]+in.nextInt();
		}
		int ans=0;int j=m;
		for(int i=0;i<=n;i++){
			if(k<pren[i]){
				break;
			}
			while(prem[j]>k-pren[i]){
				j--;
			}
			
			ans = Math.max(ans,i+j);
		}
		System.out.println(ans);
	}
}