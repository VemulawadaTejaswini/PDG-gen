import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int n;
		while(true)
		{
			n = cin.nextInt();
			if(n==0) break;
	
			BigInteger   p = new BigInteger("1"); 
			BigInteger[] s = new BigInteger[10];
			BigInteger[] t = new BigInteger[10];

			for(int i=0; i<n; i++)
			{
				s[i] = new BigInteger(cin.next());
				t[i] = new BigInteger(cin.next());
				
				p = t[i].multiply( p.divide( p.gcd(t[i]) ));
			}

			for(int i=0; i<n; i++)
			{
				s[i] = s[i].multiply( p.divide(t[i]) );
			}
			
			p = new BigInteger("1");
			for(int i=0; i<n; i++)
			{
				p = s[i].multiply( p.divide( p.gcd(s[i]) ));
			}			
			
			for(int i=0; i<n; i++)
			{
				System.out.println(p.divide(s[i]));
			}
		}
	}
}