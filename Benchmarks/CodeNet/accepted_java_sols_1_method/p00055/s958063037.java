import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			double n = sc.nextDouble();
			double ans =0;

			double a[]= new double[11];
			a[1]=n;
			for(int i=2; i<=10; i++)
			{
				if(i%2==0)
					a[i] = a[i-1]*2;
				else
					a[i]= a[i-1]/3;
			}
			for(int i=1; i<=10; i++)
				ans+=a[i];

			NumberFormat d = NumberFormat.getInstance();
			d.setMaximumFractionDigits(8);
			System.out.println(d.format(ans));
		}
	}

}