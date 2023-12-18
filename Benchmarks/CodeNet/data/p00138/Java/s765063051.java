import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int num[]=new int[24];
		double t[]=new double[24];
		boolean ju[]=new boolean[24];
		Arrays.fill(ju, true);
		for(int i=0;i<24;i++)
		{
			num[i]=in.nextInt();
			t[i]=in.nextDouble();
		}

		double ti=Integer.MAX_VALUE;
		int nu=-1;
		int inde=-1;
		for(int j=0;j<2;j++)
		{
			for(int i=0;i<8;i++)
			{
				if(t[i]<ti&&ju[i])
				{
					ti=t[i];
					nu=num[i];
					inde=i;
				}
			}
			ju[inde]=false;
			System.out.println(nu+" "+ti);
			ti=Integer.MAX_VALUE;
			nu=-1;
			inde=-1;
		}
		for(int j=0;j<2;j++)
		{
			for(int i=8;i<16;i++)
			{
				if(t[i]<ti&&ju[i])
				{
					ti=t[i];
					nu=num[i];
					inde=i;
				}
			}
			ju[inde]=false;
			System.out.println(nu+" "+ti);
			ti=Integer.MAX_VALUE;
			nu=-1;
			inde=-1;
		}
		for(int j=0;j<2;j++)
		{
			for(int i=16;i<24;i++)
			{
				if(t[i]<ti&&ju[i])
				{
					ti=t[i];
					nu=num[i];
					inde=i;
				}
			}
			ju[inde]=false;
			System.out.println(nu+" "+ti);
			ti=Integer.MAX_VALUE;
			nu=-1;
			inde=-1;
		}
		for(int j=0;j<2;j++)
		{
			for(int i=0;i<24;i++)
			{
				if(t[i]<ti&&ju[i])
				{
					ti=t[i];
					nu=num[i];
					inde=i;
				}
			}
			ju[inde]=false;
			System.out.println(nu+" "+ti);
			ti=Integer.MAX_VALUE;
			nu=-1;
			inde=-1;
		}
	}
}