import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static long count=0,max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long n=scn.nextLong();
			long min=Long.MAX_VALUE,a,b;
			for(long i=1;i*i<=n;i++)
			{
				if(n%i==0)
				{
					a=i;b=n/i;
					if((a+b-2)<min)
						min=a+b-2;
				}
			}
			System.out.println(min);
		
		}
			
	
	
		
	public static void coin(int[] arr,int sum,int n,int prev)
	{	if(sum==n)
		{
			count++;
			return;
		}
	if(sum>n)	return;
		for(int i=prev;i<arr.length;i++)
		{
			coin(arr, sum+arr[i], n,i);
		}
	}
	
}

