import java.util.Scanner;
class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		final int P = 200003; 
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int prod=1;
			for(int j=i+1;j<n;j++)
			{
				prod=arr[i]*arr[j] % P;
				
				sum=sum+prod;
			}
		}
		System.out.println(sum);
	}
}
