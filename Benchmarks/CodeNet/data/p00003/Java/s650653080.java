import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a*a + b*b == c*c) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}