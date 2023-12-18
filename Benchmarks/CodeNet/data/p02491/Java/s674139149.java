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
			
			int d = x / y;
			int r = x % y;
			float f = (float)x / (float)y;
			s += d + " " + r + " " + f;
			s += "\r";
			System.out.println(s);
		}					
	}
}