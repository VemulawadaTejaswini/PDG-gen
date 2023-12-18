//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long ans=0;
		
		long[] div=new long[n+1];
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j*i<=n;j++)
			{
				div[i*j]++;
			}
		}
		
		for(int i=1;i<=n;i++)
		{
			ans=ans+(long)(i*div[i]);
		}
		System.out.println(ans);
	}

}
