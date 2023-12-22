import java.util.Scanner;
import java.lang.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int sum;
		String s;
		while (true)
		{
			s = input.nextLine();
			if(s.length() == 1 && s.charAt(0) == '0')
				break;
			else
			{
				sum = 0;
				for(int i = 0; i < s.length(); i++)
				{
					sum += (int)(s.charAt(i)-'0');
				}
				System.out.println(sum);
			}
		}
	}
}