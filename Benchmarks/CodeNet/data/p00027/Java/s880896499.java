import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			
			if(month==0 && day==0)
			{
				break;
			}
			
			System.out.println(getWeek(month, day));
		}
	}
	
	static String getWeek(int month, int day)
	{
		final int[] MONTH_DAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		final String[] STR ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
		
		int week = 3;
		for(int i=0; i<month; i++)
		{
			for(int j=0; j<MONTH_DAY[i]; j++)
			{
				if(i+1==month && j+1==day)
				{
					return STR[week];
				}
				if(++week > 6)
				{
					week = 0;
				}
			}
		}
		return STR[week];
	}
}