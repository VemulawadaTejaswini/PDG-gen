import java.util.*;
public class Main 
{
	static boolean[] flag = new boolean[52];
	public static void main(String[] args) 
	{
		for(int i = 0; i < flag.length; ++i)
		{
			flag[i] = false;
		}
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i < x; ++i)
		{
			String c = sc.next();
			int a = sc.nextInt();
			--a;
			if(c.equals("S"))
			{
				flag[0 * 13 + a] = true;
			}
			else if(c.equals("H"))
			{
				flag[1 * 13 + a] = true;
			}
			else if(c.equals("C"))
			{
				flag[2 * 13 + a] = true;
			}
			else if(c.equals("D"))
			{
				flag[3 * 13 + a] = true;
			}
		}
		for(int i = 0; i < flag.length; ++i)
		{
			if(!flag[i])
			{
				if(i / 13 == 0)
				{
					System.out.printf("%c %d\n", 'S', i % 13 + 1);
				}
				else if(i / 13 == 1)
				{
					System.out.printf("%c %d\n", 'H', i % 13 + 1);
				}
				else if(i / 13 == 2)
				{
					System.out.printf("%c %d\n", 'C', i % 13 + 1);
				}
				else if(i / 13 == 3)
				{
					System.out.printf("%c %d\n", 'D', i % 13 + 1);
				}
			}
		}
	}
}