import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b) ? "YES":"NO");
		}
	}
}