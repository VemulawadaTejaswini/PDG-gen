import java.math.BigInteger;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			double n=in.nextDouble();
			if(n<0)
				return;
			int bs4=(int) (n*16);
			if(bs4/16.0!=n||bs4>=4096)
				System.out.println("NA");
			else 
			{
				BigInteger b=new BigInteger(bs4+"");
				String st=b.toString(2);
				while(st.length()<12)
					st="0"+st;
				StringBuilder sb=new StringBuilder();
				sb.append(st);
				sb.insert(8,".");
				System.out.println(sb);
			}
		}
	}

}