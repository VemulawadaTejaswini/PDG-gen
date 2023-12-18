import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long n=s.nextLong();
		long m=s.nextLong();
		
		long sum=0;
		
		for(int i=0;i<m;i++)
		{
			sum=sum+s.nextLong();
		}
		
		System.out.println(Math.max(-1,n-sum));
		
	}
	
}