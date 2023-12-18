import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		double a=s.nextLong();
		double v1=s.nextLong();
		
		double b=s.nextLong();
		double v2=s.nextLong();
		
		double t=s.nextLong();
		
		if(v2>=v1)
		{
			System.out.println("NO");
		}
		else
		{
			double take=Math.abs(a-b)/Math.abs(v2-v1);
			
			if(take<=t)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}
	
}
