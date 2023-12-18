import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		long p = 1;
		for(; n>0; n--)
		{
			p *= n;
		}
		
		System.out.println(p);
	}
}