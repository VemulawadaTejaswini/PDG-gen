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
		
		if(a>b)
		{
			System.out.println("a > b");
		}
		else if(a<b)
		{
			System.out.println("a < b");
		}
		if(a==b)
		{
			System.out.println("a == b");
		}

	}

}

