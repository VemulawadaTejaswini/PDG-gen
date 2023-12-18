import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in).useDelimiter("=|\\+|\\s+");

		String tmp,str[];
		BigInteger num[];
		
		str = new String[3];
		num = new BigInteger[3];
		
		while(cin.hasNext())
		{
			for(int i=0; i<3; i++)
			{
				str[i] = cin.next();
			}
			
			char ch;
			for(ch='0'; ch<='9'; ch++)
			{
				for(int i=0; i<3; i++)
				{
					tmp    = str[i].replace('X', ch);
					num[i] = new BigInteger(tmp);
				}
				
				if(num[0].add(num[1]).compareTo(num[2]) == 0)
				{
					break;
				}
			}
			
			if(ch<='9')
				System.out.println(ch);
			else
				System.out.println("NA");				
		}
	}
}