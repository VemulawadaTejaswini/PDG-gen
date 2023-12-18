import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		int ca = 1;
		int a  = scan.nextInt();
		while(a!=0)
		{
			System.out.println("Case "+ca+": "+ a);
			ca++;
			a=scan.nextInt();
		}

	}

}