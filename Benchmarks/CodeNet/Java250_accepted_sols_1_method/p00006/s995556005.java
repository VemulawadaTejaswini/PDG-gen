import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.next();
		String out = "";
		
		for(int i=in.length(); i>0; i--)
		{
			out += in.substring(i-1, i);
		}
		System.out.println(out);
	}
}