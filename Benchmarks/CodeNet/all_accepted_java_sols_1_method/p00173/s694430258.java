import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=9;
		while(n-->0)
		{
		String  cla = sc.next();
		int be = sc.nextInt();
		int af = sc.nextInt();
		int sum =be +af;
		System.out.print(cla+" ");
		System.out.print(sum+" ");
		System.out.println(be*200+af*300);
		}	
	}
}