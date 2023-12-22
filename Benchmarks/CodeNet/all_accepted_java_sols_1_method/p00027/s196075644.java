import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String week[] = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			if(m == 0 && d == 0)
			{
				break;
			}
			int sum = 0;
			for(int i = 1; i < m; ++i)
			{
				sum += days[i - 1];
			}
			sum += d - 1;
			System.out.println(week[sum % 7]);
		}
	}
}