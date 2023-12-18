
import java.util.Scanner;

public class Main 
{	
	static int toMillenial(int startY, int startM, int startD)
	{
		int y = startY;
		int m = startM;
		int d = startD;
		int remy = 1000-startY;
		int remm = 0;
		int remd = 0;
		int ans = 0;
		
		//go to the first day of next month.
		if(d > 1)
		{
			if(y%3 == 0 || m%2 == 1)
			{ //big month
				ans += (21-d);
				d = 1;
			}
			else
			{ //small month
				ans += (20-d);
				d = 1;
			}
			m += 1;
			while(m>10)
			{
				m -= 10;
				y += 1;
			}
		}
//		System.out.println("Going to first day: " + ans);
//		System.out.println("It is now " + y + " " + m + " " + d);
		
		//go to the first month of next year.
		if(m > 1)
		{
			if(y%3 == 0)
			{ //big year
				ans += (11-m)*20;
				m = 1;
				y += 1;
			}
			else
			{ //common year
				while(m <= 10)
				{
					if(m%2 == 1)
					{ //big month
						ans += 20;
					}
					else
					{ //small month
						ans += 19;
					}
					m += 1;
				}
				m = 1;
				y += 1;
			}
		}
//		System.out.println("Going to first month: " + ans);
//		System.out.println("It is now " + y + " " + m + " " + d);
		
		while(y < 1000)
		{
			if(y%3 == 0)
			{ //big year
				ans += 200;
			}
			else
			{ //small year
				ans += 195;
			}
			y += 1;
		}
//		System.out.println("Going to year 1000: " + ans);
//		System.out.println("It is now " + y + " " + m + " " + d);
		
		return ans;
	}
	
	public static void main(String[] args) 
	{		
		//normal year: 195 days
		//big year: 200 days
//		System.out.println(19*5);
		
		Scanner scan = new Scanner(System.in);
		int ppl;
		ppl = scan.nextInt();
		int[] year = new int[ppl];
		int[] month = new int[ppl];
		int[] day = new int[ppl];		
		
		for(int i = 0; i < ppl; i++)
		{
			year[i] = scan.nextInt();
			month[i] = scan.nextInt();
			day[i] = scan.nextInt();
			
			System.out.println(toMillenial(year[i],month[i],day[i]));
		}
	}
	
}

