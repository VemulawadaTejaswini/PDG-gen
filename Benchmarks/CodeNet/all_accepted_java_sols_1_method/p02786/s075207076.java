import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		long a;
		long d=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		while(a>1)
		{a=a/2;
			d*=2;}
			
		System.out.println(2*d-1);
	}
}