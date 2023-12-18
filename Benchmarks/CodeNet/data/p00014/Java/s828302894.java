import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int n,s;
		while(cin.hasNext())
		{
			s = 0;
			n = cin.nextInt();
			for(int i=n; i<600; i+=n)
			{
				s+=n*i*i;
			}
			System.out.println(s);
		}
	}
}