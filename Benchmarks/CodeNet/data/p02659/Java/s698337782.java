import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String a=s.next();
		a=a+".00";
		String b=s.next();
	
		BigDecimal aa=new BigDecimal(a);
		BigDecimal bb=new BigDecimal(b);
		
		BigDecimal qw=aa.multiply(bb);
		
		String ans=qw.toString();
		
		for(int i=0;i<ans.length();i++)
		{
			if(ans.charAt(i)=='.')
				break;
			else
			{
				System.out.print(ans.charAt(i));
			}
		}
		
	}
	
}