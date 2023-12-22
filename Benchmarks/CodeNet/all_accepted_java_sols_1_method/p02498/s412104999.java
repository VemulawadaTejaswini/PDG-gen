import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null)
			{
				for(int i = 0; i < line.length(); ++i)
				{
					char c;
					if('a' <= line.charAt(i) && line.charAt(i) <= 'z')
					{
						c = (char)(line.charAt(i) - 'a' + 'A');
					}
					else if('A' <= line.charAt(i) && line.charAt(i) <= 'Z')
					{
						c = (char)(line.charAt(i) - 'A' + 'a');
					}
					else
					{
						c = line.charAt(i);
					}
					System.out.print(c);
				}
				System.out.println();
			}
			stdReader.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
			System.exit(-1);
		}
	}
}