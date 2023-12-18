import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str[] =in.next().split(",");
			double x1=Double.valueOf(str[0]);
			double y1=Double.valueOf(str[1]);
			double x2=Double.valueOf(str[2]);
			double y2=Double.valueOf(str[3]);
			double xq=Double.valueOf(str[4]);
			double yq=Double.valueOf(str[5]);
			double xr,yr;
			double a=(y1-y2)/(x1-x2);
			double b=y1-a*x1;
			if(x1==x2)
			{
				xr=xq+(x1-xq)*2;
				yr=yq;
			}
			else if(y1==y2)
			{
				xr=xq;
				yr=yq+(y1-yq)*2;
			}
			else
			{
				xr=(2*a*yq-2*a*b-a*a*xq+xq)/(a*a+1);
				yr=(xq-xr+a*yq)/a;
			}
			System.out.printf("%.6f %.6f\n",xr,yr);
		}
	}
}