import java.io.*;
public class Main 
{
	static int[] count = new int[26];
	public static void main(String[] args) 
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String str = b.readLine();
			str = str.toLowerCase();
			for(int i = 0; i < str.length(); ++i)
			{
				if('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				{
					++count[str.charAt(i) - 'a'];
				}
			}
			for(int i = 0; i < count.length; ++i)
			{
				System.out.printf("%c : %d\n", i + 'a', count[i]);
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}