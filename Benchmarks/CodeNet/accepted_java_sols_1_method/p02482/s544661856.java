import java.util.Scanner;

import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int flag = 1;
		Scanner scan= new Scanner(System.in);
		int a = scan.nextInt();

		int b = scan.nextInt();
		
		if(a>b)
		{
			System.out.println("a > b");
		}
		if(b>a)
		{
			System.out.println("a < b");
		}
		if(a==b)
		{
			System.out.println("a == b");
		}
		
	}
}