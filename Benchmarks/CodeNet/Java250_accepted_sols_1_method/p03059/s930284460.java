import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int t = scan.nextInt();
		
		int x = t/a;
		int y = x * b;
		
		System.out.println(y);
	}
}
