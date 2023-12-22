

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
		}
		int left[]=new int[n];
		int right[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(i==0)left[i]=ar[i];else
				left[i]=Math.max(ar[i],left[i-1]);
		}
		for(int i=n-1;i>=0;i--)
		{
			if(i==n-1)
			{
				right[i]=ar[i];
			}else{
				right[i]=Math.max(ar[i],right[i+1]);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.println(right[i+1]);
			}else if(i==n-1)
			{
				System.out.println(left[n-2]);
			}else {
			System.out.println(Math.max(left[i-1],right[i+1]));
			}
			}
	}
}
