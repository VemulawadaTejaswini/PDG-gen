import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		sc.close();
		int d = (int)(b *100);
		long c = (long)(a*d)/100 ;
		System.out.println(c);
	}
}