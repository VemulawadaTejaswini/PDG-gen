import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int d = a / b;
		int r = a % b;
		float f = (float)a / b;
		
		
		System.out.printf("%1$d %2$d %3$.5f", d, r, f);

	}
}