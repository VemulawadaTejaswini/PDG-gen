import java.util.Scanner;

public class Main
{
	public static void main(String aeg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n =sc.nextInt();
			if(n==0)
				return;
			while(n-->0)
			{
				int pm =sc.nextInt();
				int pe =sc.nextInt();
				int pj =sc.nextInt();

				if(pm==100||pe==100||pj==100)
					System.out.println("A");
				else if((pm+pe)/2 >=90)
					System.out.println("A");
				else if((pm+pe+pj)/3 >= 80)
					System.out.println("A");
				else if((pm+pe+pj)/3 >= 70)
					System.out.println("B");
				else if((pm+pe+pj)/3 >= 50 && (pm>=80|| pe>=80))
					System.out.println("B");
				else
					System.out.println("C");
			}
		}
	}
}