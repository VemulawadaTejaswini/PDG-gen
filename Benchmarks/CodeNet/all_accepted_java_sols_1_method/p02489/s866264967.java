import java.util.*;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(sc.hasNext())
		{
			String s = "";
			int j = sc.nextInt();
			if(j == 0)
			{
				return;
			}
			s += "Case "+ ++i + ": "  + j + "\r";
			System.out.println(s);
		}		
			
	}
}