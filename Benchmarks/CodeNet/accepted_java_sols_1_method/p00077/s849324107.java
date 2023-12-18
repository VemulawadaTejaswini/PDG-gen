import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String str = stdIn.next();
			for(int i = 0; i < str.length(); ++i)
			{
				if(str.charAt(i) == '@')
				{
					for(int j = 0; j < (str.charAt(i + 1) - '0'); ++j)
					{
						System.out.print(str.charAt(i + 2));
					}
					i += 2;
				}
				else
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}