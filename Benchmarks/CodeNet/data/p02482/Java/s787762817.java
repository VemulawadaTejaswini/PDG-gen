import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a > b)
			System.out.println("a>b");
		else if(b > a)
			System.out.println("b>a");
		else if (a == b)
			System.out.println("a==b"); 
	}

}