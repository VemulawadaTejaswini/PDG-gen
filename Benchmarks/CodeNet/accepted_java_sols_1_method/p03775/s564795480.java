

import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long right;
	
		long min=100000000000l;
		long max;
		for(long i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				right=n/i;
				if(right>i) max=right;
				else max=i;
				min=Math.min(min,(long)Math.log10(max)+1);
				
			}
		}
		System.out.println(min);
		
	}

}
