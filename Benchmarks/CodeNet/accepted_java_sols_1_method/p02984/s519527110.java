

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=2*scan.nextLong();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				sum-=ar[i];
			}else {
				sum+=ar[i];
			}
		}
		sum/=2;
		System.out.print(sum+" ");
		for(int i=0;i<n-1;i++)
		{
			long x=ar[i]-sum;
		System.out.print(x+" ");
			sum=x;
		
		}
	}
}
