
import java.util.Scanner;

import java.math.BigInteger;

class Main

{

	public static void main(String[] args)

	{

		Scanner cin=new Scanner(System.in);


		BigInteger a,b,c,d;

		BigInteger q,w,e,r,s;
		a=cin.nextBigInteger();
		b=cin.nextBigInteger();
		c=cin.nextBigInteger();
		d=cin.nextBigInteger();
		q=a.multiply(c);
		w=a.multiply(d);
		e=b.multiply(c);
		r=b.multiply(d);
        BigInteger ans;
        ans=q.max(w);
        ans=ans.max(e);
        ans=ans.max(r);
      s=BigInteger.valueOf(0);
       if(a.compareTo(s)<=0&&b.compareTo(s)>=0||c.compareTo(s)<=0&&d.compareTo(s)>=0) 
        {
        	if(ans.compareTo(s)<=0) ans=s;
       }
        System.out.println(ans);


	}



}
