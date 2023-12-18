import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		
		System.out.format("%d %d %.5f", x/y, x%y, (double)x/(double)y);
	}
}