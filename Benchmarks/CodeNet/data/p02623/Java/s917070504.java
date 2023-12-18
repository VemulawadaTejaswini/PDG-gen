

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int mod=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stu
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int m=Integer.valueOf(cmd[1]);
		int k=Integer.valueOf(cmd[2]);
		long[] a=new long[n];
		long[] b=new long[m];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			a[i]=Long.valueOf(cmd[i]);
		}
		cmd=br.readLine().split(" ");
		for(int i=0;i<m;i++)
		{
			b[i]=Long.valueOf(cmd[i]);
		}
		long[] sum1=new long[n+1];
		long[] sum2=new long[m+1];
		for(int i=1;i<=n;i++)
		{
			sum1[i]=sum1[i-1]+a[i-1];
		}
		for(int i=1;i<=m;i++)
		{
			sum2[i]=sum2[i-1]+b[i-1];
		}
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			if(sum1[i]<=k)
				ans=i;
			else
				break;
		}
		for(int i=1;i<=m;i++)
		{
			if(sum2[i]<=k)
				ans=Math.max(ans,i);
			else
				break;
		}
		for(int i=1;i<=n;i++)
		{
			if(sum1[i]>k)
				break;
			int ind=Arrays.binarySearch(sum2,k-sum1[i]);
//			System.out.println(i+" "+sum1[i]+" "+ind);
			int x=ind;
			if(ind<0)
				x=Math.abs(x+1)-1;
			ans=Math.max(ans,x+i);
		}
		System.out.println(ans);
	}
}
