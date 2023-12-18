import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			int date = d + 100 * m + 10000 * y;
			if(date < 18680908)
			{
				System.out.println("pre-meiji");
			}
			else if(18680908 <= date && date <= 19120729)
			{
				System.out.println("meiji " + (y - 1868 + 1) + " " + m + " " + d);
			}
			else if(19120730 <= date && date <= 19261224)
			{
				System.out.println("taisho " + (y - 1912 + 1) + " " + m + " " + d);
			}
			else if(19261225 <= date && date <= 19890107)
			{
				System.out.println("showa " + (y - 1926 + 1) + " " + m + " " + d);
			}
			else if(19890108 <= date)
			{
				System.out.println("heisei " + (y - 1989 + 1) + " " + m + " " + d);
			}
		}
	}
}