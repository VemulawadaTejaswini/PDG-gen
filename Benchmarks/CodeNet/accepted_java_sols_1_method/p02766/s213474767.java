import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner (System.in);
		double n,r;
		n=s1.nextDouble();
		r=s1.nextDouble();
		double m = (Math.log(n)/Math.log(r));
		int count=(int)(Math.floor(m)+1);
		System.out.println(count);
	}
}