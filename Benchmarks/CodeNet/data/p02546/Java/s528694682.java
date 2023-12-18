import java.util.Scanner;

public class Test
{

	public static void Test(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if(str.endsWith("s"))
		{
			System.out.println(str + "es");
		}
		
		else 
		{
			System.out.println(str + "s");			
		}
		
		scan.close();

	}

}
