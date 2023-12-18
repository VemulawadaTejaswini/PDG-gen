package Vol000;
import java.util.Scanner;

public class AOJ0_64 
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int count =0;
		String tmp = "0";
		while(in.hasNext())
		{
			char ch[]=in.nextLine().toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				while(i<ch.length&&(Character.isDigit(ch[i])))
				{
					tmp+=ch[i];
					i++;
				}
				count+=Integer.valueOf(tmp);
				tmp="0";
			}
		}
		System.out.println(count);
	}
}