import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{try {
	    
	
	    Scanner k=new Scanner(System.in);
		int n=k.nextInt();int kg=0;
		BigInteger f=new BigInteger("1");	
		BigInteger ff=new BigInteger("1000000000000000000");
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
		    ar[i]=k.nextLong();
		    
		}
		for(int i=0;i<n;i++)
		{
		    if(ar[i]==0)
		    {
		        System.out.print(0);kg=99;
		        break;
		    }}
		    if(kg==0)
		  {  for(int i=0;i<n;i++)
		{
		    f=f.multiply(BigInteger.valueOf(ar[i]));
		    if(f.compareTo(ff)==1 && kg==0)
		{
		    System.out.print("-1");kg=99;
		break;}
		}
		if(kg==0)
			System.out.print(f);}}
			catch(Exception e) {
	return;}
	}}
	

