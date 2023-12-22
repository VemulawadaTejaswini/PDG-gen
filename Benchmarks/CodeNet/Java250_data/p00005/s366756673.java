import java.util.Scanner;

public class Main
{
	static Scanner in;
	static long gcd(long p,long q)
	{
		if(p<q){long t=p;p=q;q=t;}
		if(q==0)return p;
		return gcd(q,p%q);
	}
	static long lcm(long p,long q)
	{
		return p*q/gcd(p,q);
	}
	public static void main(String[] args)
	{
		in=new Scanner(System.in);

		while(in.hasNext())
		{
		    long n,m;
			n=in.nextLong();m=in.nextLong();
		    System.out.println(gcd(n,m)+" "+lcm(n,m));
		}
	}
}