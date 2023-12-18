import java.math.BigInteger;
import java.util.*;


public class Main {

	public static long gcd(long a,long b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long gcd,a,b,lcm;
		
		
		while(scan.hasNext())
		{
			a=scan.nextLong();
			b=scan.nextLong();
			gcd=gcd(a,b);
			if(gcd!=1)
				lcm=a/gcd*b;
			else
				lcm=a*b;
			System.out.print(gcd+" "+lcm);
		}
		scan.close();
}}