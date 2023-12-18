import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '1')
			{
				count++;
			}
		}

		System.out.println(count);
		scan.close();
	}
}
