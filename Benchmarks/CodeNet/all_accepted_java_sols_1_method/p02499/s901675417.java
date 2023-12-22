import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			int count = 0;
			int[] num = new int[26];
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null)
			{
				for(int i = 0; i < line.length(); ++i)
				{
					if('a' <= line.charAt(i) && line.charAt(i) <= 'z')
					{
						++num[line.charAt(i) - 'a'];
					}
					else if('A' <= line.charAt(i) && line.charAt(i) <= 'Z')
					{
						++num[line.charAt(i) - 'A'];
					}
				}
			}
			stdReader.close();
			for(int i = 0; i < 26; ++i)
			{
				System.out.println((char)(i + 'a') + " : " + num[i]);
			}
		}
		catch (Exception e)
		{
			e.getStackTrace();
			System.exit(-1);
		}

	}
}