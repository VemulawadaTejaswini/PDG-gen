import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String s = stdIn.nextLine();
			char[] a = s.toCharArray();
			for(int i = 0; i < 26; ++i)
			{
				for(int j = 0; j < a.length; ++j)
				{
					if('a' <= a[j] && a[j] <= 'z')
					{
						if(a[j] == 'z')
						{
							a[j] = 'a';
						}
						else
						{
							++a[j];
						}
					}
				}
				String ans = String.valueOf(a);
				if(ans.contains("this") || ans.contains("that") || ans.contains("the") )
				{
					System.out.println(ans);
					break;
				}
			}
		}
	}
}