import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int m = 100000;
		int n = cin.nextInt();
		for(int i=0; i<n; i++)
		{
			m *= 1.05;
			m  = (m+999)/1000*1000;
		}
		
		System.out.println(m);
	}
}