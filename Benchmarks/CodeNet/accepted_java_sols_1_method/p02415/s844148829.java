import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char ch;
		String s;
		int b = 0;
		while (input.hasNext())
		{

			String st = "";
			s = input.next();
			for(int i = 0; i < s.length(); i++)
			{
				ch = s.charAt(i);
				if(ch >= 'A' && ch <= 'Z')
				{
					ch = Character.toLowerCase(ch);
				}
				else if(ch >='a' && ch <= 'z') {
					ch = Character.toUpperCase(ch);
					
				}
				st = st + ch;
			}
			if(b == 0)
			{
				System.out.print(st);
				b++;
			}
			else 
			{
				System.out.print(' ' + st);
			}
		}
		System.out.println();
	}
}