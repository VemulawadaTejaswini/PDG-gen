import java.io.*;
import java.util.*;
public class Main
{ 
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,d,e,h,i,j,k,l;
		long f,g;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		int[][]z=new int[a][b];
		for(d=0;d<a;d++)
		{
			for(e=0;e<b;e++)z[d][e]=0;
		}
		for(;c>0;c--)
		{
			d=in.nextInt();
			e=in.nextInt();
			z[d-1][e-1]=1;
		}
		long[]y=new long[a];
		long[]x=new long[b];
		for(d=0;d<a;d++)
		{
			for(e=0,f=0;e<b;e++)
			{
				if(z[d][e]==1)f++;
			}
			y[d]=f;
		}
		for(d=0;d<b;d++)
		{
			for(e=0,f=0;e<a;e++)
			{
				if(z[e][d]==1)f++;
			}
			x[d]=f;
		}
		for(d=0,f=0;d<a;d++)
		{
			for(e=0;e<b;e++)
			{
				g=y[d]+x[e];
				if(z[d][e]==1)g--;
				if(g>f)f=g;
			}
		}
		System.out.println(f);
	}
} 