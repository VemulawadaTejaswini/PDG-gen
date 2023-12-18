import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if (str.length() <= 20)
		{
			char[] ch = str.toCharArray();
			
			StringBuffer sb = new StringBuffer();
			for(int len = str.length() - 1;len >= 0; len--)
			{
			 sb. append(ch[len]);
			}
			String s = sb.toString();
			
			System.out.print(s);
		}
	}
}