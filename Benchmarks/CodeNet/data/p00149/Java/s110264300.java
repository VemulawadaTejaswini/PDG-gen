import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[2];	
		int d[] = new int[2];

		while(sc.hasNext())
		{
			double le = sc.nextDouble();
			double ri = sc.nextDouble();

			if(le>=1.1 )
				a[0]++;
			else if(le>=0.6 )
				b[0]++;
			else if(le>=0.2 )
				c[0]++;
			else
				d[0]++;

			if(ri>=1.1 )
				a[1]++;
			else if(ri>=0.6 )
				b[1]++;
			else if(ri>=0.2 )
				c[1]++;
			else
				d[1]++;
		}
		System.out.println(a[0]+" "+a[1]);
		System.out.println(b[0]+" "+b[1]);
		System.out.println(c[0]+" "+c[1]);
		System.out.println(d[0]+" "+d[1]);
	}

}