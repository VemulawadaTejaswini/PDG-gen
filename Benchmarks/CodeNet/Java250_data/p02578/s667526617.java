import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int temp=0;
		long ans=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		temp=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<=temp)
				ans=ans+Math.abs(a[i]-temp);
			else
				temp=a[i];
		}
		System.out.println(ans);
	}
}