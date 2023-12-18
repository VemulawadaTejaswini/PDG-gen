
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();

			
		for(int i=1;i<=n;i++)
		{
			int year = stdIn.nextInt();
			int month = stdIn.nextInt();
			int day = stdIn.nextInt();
			int count = 0;
			
			if(year%3==0)
			{
				count += 21-day;
				if(month!=10)
				{
					count += (10-month)*20;
				}
				
			}
			else
			{
				if(month%2==0)
				{
					count += 20-day;
				}
				else
				{
					count += 21-day;
				}
				
				for(int j=month+1;j<=10;j++)
				{
					if(j%2==0)
					{
						count += 19;
					}
					else
					{
						count += 20;
					}
				}
			}
			
			for(int j=year+1;j<1000;j++)
			{
				if(j%3==0)
				{
					count+=200;
				}
				else
				{
					count+=195;
				}
			}
				
			System.out.println(count);
				
		}
		
	}

}