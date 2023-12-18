import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		String box[] = new String[str.length()];

		for(int i=0; i < str.length(); i++)
		{
			box[i]=String.valueOf(str.charAt(i));
		}

		String rebox[] = new String[str.length()];

		for(int i=0; i<str.length(); i++)
			rebox[i] =box[str.length()-1-i];

		for(int i=0; i<str.length(); i++)
			System.out.print(rebox[i]);

		System.out.println();
	}
}