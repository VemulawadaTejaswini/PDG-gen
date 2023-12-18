import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num*num2 + " " + (num+num2)*2);
	}
}
