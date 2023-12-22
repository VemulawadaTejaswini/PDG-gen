import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int k=s.nextInt();
		
		int sum=0;
		
		if(k>=a)
		{
			sum=a;
			k=k-a;
			
			if(k>=b)
			{
				k=k-b;
				
				sum=sum-k;
				
				System.out.println(sum);
			}
			else
			{
				System.out.println(sum);
			}
		}
		else
		{
			System.out.println(k);
		}
		
	}
	
}