import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int a = value;
		value = scan.nextInt();
		int b = value;
		value = scan.nextInt();
		int c = value;
		if(a<b&&b<c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}

