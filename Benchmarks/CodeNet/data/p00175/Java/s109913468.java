import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == -1)
			{
				break;
			}
			if(n == 0)
			{
				System.out.println("0");
				continue;
			}
			StringBuffer fourDigits = new StringBuffer();
			while(n != 0)
			{
				fourDigits.append((char)(n % 4 + '0'));
				n /= 4;
			}
			fourDigits = fourDigits.reverse();
			System.out.println(fourDigits);
		}
	}
}