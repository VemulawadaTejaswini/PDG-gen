import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String s, s1;
		int ll = 0;
		s = input.next();
		s1 = input.next();
		s += s;
		for(int i = 0; i < s.length() - s1.length(); i++)
		{
			ll = 0;
			for(int k = 0; k < s1.length(); k++)
			{
				if(s.charAt(i) != s1.charAt(k))
					break;
				ll++;
			}
			if(ll == s1.length())
			{
				break;
			}
		}

		if(ll == s1.length())
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}