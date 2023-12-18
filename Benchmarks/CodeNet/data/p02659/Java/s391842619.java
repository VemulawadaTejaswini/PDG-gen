import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double b = scan.nextInt() * scan.nextDouble();
		scan.close();
		
		System.out.println((int)b);
		
		
	}
}