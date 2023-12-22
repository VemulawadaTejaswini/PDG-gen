import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		int a,b,t,gcd,lcm;
		
		while(cin.hasNext())
		{
			a=lcm=cin.nextInt();
			b=gcd=cin.nextInt();
			
			while(gcd!=0)
			{
				lcm=lcm%gcd;
				t=lcm; lcm=gcd; gcd=t;	
			}
			gcd = a/lcm*b;

			System.out.println(lcm+" "+gcd);
		}
	}
}