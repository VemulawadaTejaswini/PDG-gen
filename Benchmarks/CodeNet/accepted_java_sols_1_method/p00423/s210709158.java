import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n= in.nextInt();
			if(n==0)
				return;
			int a=0;
			int b=0;
			while(n--!=0)
			{
				int x=in.nextInt();
				int y=in.nextInt();
				if(x>y)
					a+=x+y;
				else if(y>x)
					b+=x+y;
				else{
					a+=x;
					b+=y;	
				}	
			}
			System.out.println(a+" "+b);
		}
	}
}