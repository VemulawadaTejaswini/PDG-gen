import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		double a=s.nextLong();
		double v1=s.nextLong();
		
		double b=s.nextLong();
		double v2=s.nextLong();
		
		if(a<b)
		{
			double temp=a;
			double temp2=v1;
			
			a=b;
			v1=v2;
			
			b=temp;
			v2=temp2;
		}
		
		double t=s.nextLong();
		
		
		if(a==b)
		{
			System.out.println("YES");
		}
		else if(v2<=v1)
		{
			System.out.println("NO");
		}
		else
		{
			double take=(a-b)/(v2-v1);
			
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