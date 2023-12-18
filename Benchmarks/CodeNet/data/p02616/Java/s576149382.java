

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main{
	static long mod=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int k=Integer.valueOf(cmd[1]);
		long[] arr=new long[n];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Long.valueOf(cmd[i]);
		}
		Arrays.sort(arr);
		long ans=1;
		if(arr[n-1]==0 && k%2!=0)
			ans=0;
		else if(arr[n-1]<0 && k%2!=0)
		{
			for(int i=n-1;i>=n-k;i--)
			{
				ans=ans*arr[i];
				if(Math.abs(ans)>mod)
					ans=(ans+mod)%mod;
			}
		}
		else
		{
			int i=0;
			int j=n-1;
			if(k%2!=0)
			{
				ans=ans*arr[n-1];
				if(Math.abs(ans)>mod)
					ans=(ans+mod)%mod;
				j--;
				k--;
			}
			while(k!=0)
			{
				long a=arr[j]*arr[j-1];
				if(Math.abs(a)>mod)
					a=a%mod;
				long b=arr[i]*arr[i+1];
				if(Math.abs(b)>mod)
					b=b%mod;
				if(a>b)
				{
					ans=ans*a;
					if(Math.abs(ans)>mod)
						ans=ans%mod;
					j=j-2;
				}
				else
				{
					ans=ans*b;
					if(Math.abs(ans)>mod)
						ans=ans%mod;
					i=i+2;
				}
				k=k-2;
			}
		}
		System.out.println((ans+mod)%mod);
	}
}
