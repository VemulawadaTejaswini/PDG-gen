import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long k=sc.nextInt();
		long sum=0;
		if(a>k)
			System.out.println(k);
		else
		{
			k-=a;
			sum=a;
			if(b>=k)
				System.out.println(sum);
			else
			{
				k-=b;
				sum-=k;
				System.out.println(sum);
			}
		}
	}
}