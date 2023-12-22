import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String a = s.next();
		try{
		String b = a.substring(0,4);
		
		if (b.equals("YAKI"))
		{
			System.out.println("Yes");
		} else
		{
			System.out.println("No");
		}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("No");
		}
	}

}
