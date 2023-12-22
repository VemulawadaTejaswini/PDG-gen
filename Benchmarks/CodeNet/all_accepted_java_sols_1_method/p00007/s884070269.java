import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double d=100000;
		for(int i=0; i<n; i++)
		{
			d=d*1.05;
			if(d%1000!=0)
				d+=1000;
			d=(int)d/1000;
			d=(int)d*1000; 
		}
		System.out.println((int)d);
	}
}