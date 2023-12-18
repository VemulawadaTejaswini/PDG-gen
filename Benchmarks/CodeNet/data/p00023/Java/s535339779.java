import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			double xa=in.nextDouble(),ya=in.nextDouble(),ra=in.nextDouble();
			double xb=in.nextDouble(),yb=in.nextDouble(),rb=in.nextDouble();
			double l=Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb));
			if(l>ra+rb)
				System.out.println(0);
			else if(ra>l+rb)
				System.out.println(2);
			else if(rb>l+ra)
				System.out.println(-2);
			else
				System.out.println(1);
		}
	}
}