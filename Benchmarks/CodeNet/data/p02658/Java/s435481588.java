/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  BigInteger m = new BigInteger("1");
	  BigInteger limit = new BigInteger("10e18");
	  
	  for(int i = 1; i <= n; i++){
	    int x = sc.nextInt();
	    if(m < limit) m = m.multiply(BigInteger.valueOf(x));
	  }
	  if(m <= limit) System.out.println(m);
	  else System.out.println("-1");
	}
}
  