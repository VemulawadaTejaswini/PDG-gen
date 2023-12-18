import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static long sqrt(long a)
	{
		long l = 0;
		long r = 0x7fffffff;
		while ( true )
		{
	//	System.out.println(l + " " + r);
			if ( l*l == a )
				return l;
			if ( r*r == a )
				return r;
			long c = (l+r)/2;
			if ( c*c < a )
				l = c;
			else
				r = c;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while ( true )
		{
			int n = sc.nextInt();
			if ( n==0 )
				return;
			long[] b = new long[n*(n+1)/2];
			for ( int i=0; i<n*(n+1)/2; i++ )
				b[i] = sc.nextLong();
			long[] a = new long[n+1];
			
			long[] bodd = new long[n*(n+1)/2-n];
			long[] beven = new long[n];
			
			int boddn = 0;
			int bevenn = 0;
			
			for ( int i=0; i<n*(n+1)/2; i++ )
			{
				if ( b[i]%2 == 0 )
					beven[bevenn++] = b[i];
				else
					bodd[boddn++] = b[i];
			}
			
			Arrays.sort(bodd);
			Arrays.sort(beven);
			
			BigInteger t = new BigInteger(Long.toString(beven[0]));
			t = t.multiply(new BigInteger(Long.toString(beven[1])));
			t = t.divide(new BigInteger(Long.toString(bodd[0])));
			a[0] = sqrt(t.longValue());
			for ( int i=1; i<=n; i++ )
				a[i] = beven[i-1]/a[0];
			
			System.out.println(a[0]);
			
			for ( int i=1; i<=n; i++ )
			{
				if ( i>1 )
					System.out.print(" ");
				System.out.print(a[i]);
			}
			System.out.println();
			
		}
	}
}