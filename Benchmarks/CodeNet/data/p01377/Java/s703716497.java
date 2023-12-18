import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		int size = str.length();
		int count = 0;
		if(size % 2 == 0)
		{
			if(str.charAt(size / 2 - 1) == 'i' && str.charAt(size / 2) == 'i' || 
			   str.charAt(size / 2 - 1) == 'w' && str.charAt(size / 2) == 'w' ||
			   str.charAt(size / 2 - 1) == '(' && str.charAt(size / 2) == ')' ||
			   str.charAt(size / 2 - 1) == ')' && str.charAt(size / 2) == '(')
			{
				;
			}
			else
			{
				++count;
			}
			for(int i = 0; i < size / 2 - 1; ++i)
			{
				if(str.charAt(i) == 'i' && str.charAt(size -i - 1) == 'i' ||
				   str.charAt(i) == 'w' && str.charAt(size -i - 1) == 'w' ||
				   str.charAt(i) == '(' && str.charAt(size -i - 1) == ')' ||
				   str.charAt(i) == ')' && str.charAt(size -i - 1) == '(')
				{
					;
				}
				else
				{
					++count;
				}
			}
		}
		else
		{
			if(str.charAt(size / 2) == 'i' || str.charAt(size / 2) == 'w')
			{
				;
			}
			else
			{
				++count;
			}
			for(int i = 0; i < size / 2; ++i)
			{
				if(str.charAt(i) == 'i' && str.charAt(size -i - 1) == 'i' ||
				   str.charAt(i) == 'w' && str.charAt(size -i - 1) == 'w' ||
				   str.charAt(i) == '(' && str.charAt(size -i - 1) == ')' ||
				   str.charAt(i) == ')' && str.charAt(size -i - 1) == '(')
				{
					;
				}
				else
				{
					++count;
				}
			}
		}
		System.out.println(count);
	}
}