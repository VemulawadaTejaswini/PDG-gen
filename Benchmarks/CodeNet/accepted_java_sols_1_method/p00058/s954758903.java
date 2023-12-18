import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			double ax=sc.nextDouble();
			double ay=sc.nextDouble();
			double bx=sc.nextDouble();
			double by=sc.nextDouble();
			double cx=sc.nextDouble();
			double cy=sc.nextDouble();
			double dx=sc.nextDouble();
			double dy=sc.nextDouble();

			double inx1 = ax-bx;
			double iny1 = ay-by;
			double inx2 = cx-dx;
			double iny2 = cy-dy;

			if((inx1*inx2+iny1*iny2)==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}