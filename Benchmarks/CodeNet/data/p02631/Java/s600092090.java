import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		List<Long> li=new ArrayList<Long>();
		long arr[]=new long[(int)n];
		long sum1=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
			sum1=sum1^arr[i];
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
		    long x=sum1^arr[i];
			li.add(x);
			sum=0;
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.print(li.get(i)+" ");
		}
	}
}