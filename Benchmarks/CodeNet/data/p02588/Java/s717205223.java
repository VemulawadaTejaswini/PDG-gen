import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		final int MOD = 1000000007; 
		double[] arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		
		Arrays.sort(arr);
		int count=0;
		int j=1;
		for(int i=0;i<n-1;i++)
		{
			double prod=1;
				prod=arr[i]*arr[j]%MOD;
				
				if(prod%1==0)
				{
					count++;
				}
			j++;
		}
		System.out.println(count);
		
		
	}
}
