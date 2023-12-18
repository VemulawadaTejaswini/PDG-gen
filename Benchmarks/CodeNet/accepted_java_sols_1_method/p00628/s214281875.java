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
				if(line.equals("END OF INPUT"))
				{
					break;
				}
				int count = 0;
				for(int i = 0; i < line.length(); ++i)
				{
					if(line.charAt(i) == ' ')
					{
						System.out.print(count);
						count = 0;
					}
					else
					{
						++count;
					}
				}
				System.out.println(count);
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