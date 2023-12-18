import java.math.BigInteger;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		BigInteger x=BigInteger.ZERO;
		for(;;)
		{
			BigInteger n=in.nextBigInteger();
			if(n.compareTo(x)==0)
				return;
			String k=n.toString(8);
			char ch[]=k.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='4')
					ch[i]='5';
				else if(ch[i]=='5')
					ch[i]='7';
				else if(ch[i]=='6')
					ch[i]='8';
				else if(ch[i]=='7')
					ch[i]='9';
			}
			System.out.println(ch);
		}
	}
}