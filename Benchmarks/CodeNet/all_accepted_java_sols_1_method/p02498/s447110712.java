import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			StringBuilder sb = new StringBuilder(br.readLine());
			for(int i = 0; i < sb.length(); ++i)
			{
				if('a' <= sb.charAt(i) && sb.charAt(i) <= 'z')
				{
					System.out.print((char)(sb.charAt(i) - 'a' + 'A'));
				}
				else if('A' <= sb.charAt(i) && sb.charAt(i) <= 'Z')
				{
					System.out.print((char)(sb.charAt(i) - 'A' + 'a'));
				}
				else
				{
					System.out.print(sb.charAt(i));
				}
			}
			System.out.println("");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}