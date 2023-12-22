import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.nextLine();
		String out = "";
		for(int i=0; i<in.length(); i++)
		{
			char c = in.charAt(i);
			if('a'<=c && c<='z')
			{
				c &= 0xdf;
			}
			else if('A'<=c && c<='Z')
			{
				c |= 0x20;
			}
			out += String.valueOf(c);
		}
		
		System.out.println(out);
	}
}