import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n;
		double[] x = new double[111];
		double[] y = new double[111];
		double p, d;
		n = input.nextInt();
		for(int i = 0; i < n; i++)
		{
			x[i]=input.nextDouble();
		}
		for(int i = 0; i < n; i++)
		{
			y[i]=input.nextDouble();
		}
		p = 0;
		for(int i = 0; i < n; i++)
		{
			p += Math.abs(x[i] - y[i]);
		}
		System.out.println(p);
		
		p=0;
		for(int i = 0; i < n; i++)
		{
			p += Math.pow(x[i] - y[i], 2);
		}
		System.out.println(Math.sqrt(p));

		p=0;
		d=1.0/3;
		for(int i = 0; i < n; i++)
		{
			p += Math.pow(Math.abs(x[i] - y[i]), 3);
		}
		System.out.println(Math.pow(p, d));

		p = Math.abs(x[0] - y[0]);
		for(int i = 0; i < n; i++)
		{
			if(p < Math.abs(x[i] - y[i]))
			{
				p = Math.abs(x[i] - y[i]);
			}
		}
		System.out.println(p);
		input.close();
	}
}