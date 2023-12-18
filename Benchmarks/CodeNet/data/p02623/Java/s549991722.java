//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		long sum=0;
		int a[]=new int[n];
		int b[]=new int[m];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
		
		int i=0;
		int j=0;
		while(sum<=k)
		{
			if(i<n && j<m)
			{
				if(a[i]<=b[j])
				{
					sum=sum+a[i];
					count++;
					i++;
				}
				else
				{
					sum=sum+b[j];
					count++;
					j++;
				}
			}
			else if(i<n)
			{
				sum=sum+a[i];
				count++;
				i++;
			}
			else if(j<m)
			{
				sum=sum+b[j];
				count++;
				j++;
			}
			else
			{
				break;
			}
		}
		if(sum>k)
		{
			count--;
		}
		System.out.println(count);
		
		
		
		
		
		
	}

}
