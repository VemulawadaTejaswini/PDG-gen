import java.util.*;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String s = "";
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0)
			{
				return;
			}
			if(x < y)
			{
				s += x + " " + y;
			}
			else
			{
				s += y + " " + x;
			}
			s += "\r";
			System.out.println(s);
		}					
	}
}