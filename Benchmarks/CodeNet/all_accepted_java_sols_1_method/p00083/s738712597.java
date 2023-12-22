import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			
			int[] era = {1868, 1912, 1926, 1989};
			String[] eraString = {"meiji", "taisho", "showa", "heisei"};
			
			int id=0;
			if(year < era[0])
			{
				id = 0;
			}
			else if(year == era[0])
			{
				if(month > 9 || (month==9 && day>7))
				{
					id = 1;
				}
			}
			else if(year < era[1])
			{
				id = 1;
			}
			else if(year == era[1])
			{
				id = 1;
				if(month > 7 || (month==7 && day>29))
				{
					id = 2;
				}
			}
			else if(year < era[2])
			{
				id = 2;
			}
			else if(year == era[2])
			{
				id = 2;
				if(month==12 && day>24)
				{
					id = 3;
				}
			}
			else if(year < era[3])
			{
				id = 3;
			}
			else if(year == era[3])
			{
				id = 3;
				if(month > 1 || (month==1 && day>7))
				{
					id = 4;
				}
			}
			else
			{
				id = 4;
			}
			
			String output;
			switch (id)
			{
				case 0:
					output = "pre-meiji";
					break;
	
				default:
					output = String.format("%1$s %2$d %3$d %4$d", eraString[id-1], year-era[id-1]+1, month, day);
					break;
			}			
			System.out.println(output);		
		}
	}
}