import java.util.Arrays;
import java.util.Scanner;

public class topcoder1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			double prod=1;
			for(int j=i+1;j<n;j++)
			{
				prod=arr[i]*arr[j];
				
				if(prod%1==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}
}
