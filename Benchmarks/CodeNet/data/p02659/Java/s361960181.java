import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		sc.close();
		int d = (int)(b *1000);
		long c = (long)(a*d)/1000 ;
		System.out.println(c);
	}
}