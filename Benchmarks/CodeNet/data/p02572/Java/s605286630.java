import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long[] arr=new long[(int)n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long num=(int)(Math.pow(10, 9))+7;
		long sum=0;
		for(long i=0;i<n;i++)
		{
			for(long j=i+1;j<n;j++)
			{
				sum=sum+(arr[(int)i]*arr[(int)j])%num;
				/*if(i!=j)
				{
					sum=sum+(arr[i]*arr[j])%num;
				}
				else
				{
					j++;
				}*/
			}
		}
		System.out.println(sum%num);
	}

}
