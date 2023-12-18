import java.util.Scanner;
public class Main
{
	static int a[]=new int[10];
	static int b[]=new int[10];
	static int c[]=new int[10];

	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			for(int i=0;i<10;i++)
				a[i]=in.nextInt();
			if(solve(a))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	public static boolean solve(int a[])
	{
		int ballB=0;
		int ballC=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>ballB)
				ballB=a[i];
			else if(a[i]>ballC)
				ballC=a[i];
			else 
				return false;
		}
		return true;
	}

}