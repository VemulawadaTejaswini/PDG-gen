
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		long allsum=0;
		for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextLong();
				allsum+=arr[i];
				allsum%=1000000007;
			}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			allsum-=arr[i];
			sum+=(allsum*arr[i]);
			sum%=1000000007;
		
		}
		System.out.println(sum);
	}
}
