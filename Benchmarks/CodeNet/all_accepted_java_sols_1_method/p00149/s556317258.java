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
			for(;;)
			{
				if(le>=1.1 )
				{
					a[0]++;
					break;
				}	
				else if(le>=0.6 )
				{
					b[0]++;
					break;
				}	
				else if(le>=0.2 )
				{
					c[0]++;
					break;
				}	
				else
				{
					d[0]++;
					break;
				}	
			}
			for(;;)
			{
				if(ri>=1.1 )
				{
					a[1]++;
					break;
				}	
				else if(ri>=0.6 )
				{
					b[1]++;
					break;
				}	
				else if(ri>=0.2 )
				{
					c[1]++;
					break;
				}	
				else
				{
					d[1]++;
					break;
				}	
			}
		}
	System.out.println(a[0]+" "+a[1]);
	System.out.println(b[0]+" "+b[1]);
	System.out.println(c[0]+" "+c[1]);
	System.out.println(d[0]+" "+d[1]);
	}

}