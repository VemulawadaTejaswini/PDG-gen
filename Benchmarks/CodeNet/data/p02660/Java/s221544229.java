import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int z = 2;
		int count = 0;
		int val = scan.nextInt();
		
		while(val > 0)
		{
			val /= z;
			z++;
			count++;
		}
		
		System.out.println(count);
		
	}
}