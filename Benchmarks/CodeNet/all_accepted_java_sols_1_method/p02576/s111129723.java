import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double x=sc.nextDouble();
		double t=sc.nextDouble();
		double a=Math.ceil(n/x);
		System.out.println((int)(a*t));
	}
}
