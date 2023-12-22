import java.util.*;
 import java.math.BigInteger;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String h[]=sc.nextLine().split(" ");
		long n=Long.parseLong(sc.nextLine());
		long a=100;
		int k=0;
		while(a<n)
		{
			a=(long)((double)a*1.01);
			k+=1;
		}
		System.out.println(k);
	}

}



	
