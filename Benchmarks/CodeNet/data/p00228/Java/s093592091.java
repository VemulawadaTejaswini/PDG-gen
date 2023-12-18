import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		String digits[] = {"0111111", 
				 "0000110", 
				 "1011011", 
				 "1001111", 
				 "1100110", 
				 "1101101", 
				 "1111101", 
				 "0100111", 
				 "1111111", 
				 "1101111"};
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == -1)
			{
				break;
			}
			String s = "0000000";
			char[] current = s.toCharArray();
			for(int i = 0; i < n; ++i)
			{
				int num = stdIn.nextInt();
				for(int j = 0; j < current.length; ++j)
				{
					if(digits[num].charAt(j) == current[j])
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
						if(current[j] == '0')
						{
							current[j] = '1';
						}
						else
						{
							current[j] = '0';
						}
					}
				}
			}
			System.out.println("");
		}
	}
}