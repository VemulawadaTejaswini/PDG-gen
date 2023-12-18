import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line, moto;
		try
		{
			moto = reader.readLine();
			int ans = 0;
			while(true)
			{
				line = reader.readLine();
				if(line.equals("END_OF_TEXT"))
				{
					break;
				}
				String[] bun = line.split(" ",0);
				for (int i = 0; i < bun.length; i++)
				{
					bun[i] = bun[i].toLowerCase();
					if(bun[i].equals(moto))
					{
						++ans;
					}
				}
			}
			System.out.println(ans);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
