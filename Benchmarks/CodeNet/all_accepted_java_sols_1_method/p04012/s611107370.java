import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String input;
		input = scan.next();
		int i , length = input.length();
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		for (i = 0;i < length;i ++)
		{
			char ch = input.charAt(i);
			if (!map.containsKey(ch))
				map.put(ch , 1);
			else
				map.put(ch , map.get(ch) + 1);
		}
		boolean ok = true;
		for (Map.Entry<Character , Integer> entry : map.entrySet())
		{
			if (entry.getValue() % 2 == 1)
				ok = false;
		}
		
		if (ok)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}