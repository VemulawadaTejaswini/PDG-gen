import java.math.BigInteger;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String st[]=in.next().split("\\+");
			String st2[]=st[1].split("=");
			String a=st[0];
			String b=st2[0];
			String c=st2[1];
			int ans=-1;
			for(int i=0;i<10;i++)
			{
				String x=a;
				String y=b;
				String z=c;
				if(i==0)
				{
					if(x.length()>1)
						if(x.charAt(0)=='X')
							continue;
					if(y.length()>1)
						if(y.charAt(0)=='X')
							continue;
					if(z.length()>1)
						if(z.charAt(0)=='X')
							continue;
				}
				x=x.replaceAll("X",String.valueOf(i));
				y=y.replaceAll("X",String.valueOf(i));
				z=z.replaceAll("X",String.valueOf(i));
				
				BigInteger x2=new BigInteger(x);
				BigInteger y2=new BigInteger(y);
				BigInteger z2=new BigInteger(z);
				
				if((x2.add(y2)).equals(z2))
				{
					ans=i;
					break;
				}
			}
			System.out.println(ans==-1 ? "NA":ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}