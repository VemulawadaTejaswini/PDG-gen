import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] card = new boolean[4][13];
		for(int i = 0; i < n; ++i)
		{
			String s = sc.next();
			int num = sc.nextInt();
			if(s.equals("S"))
			{
				card[0][num - 1] = true;
			}
			else if(s.equals("H"))
			{
				card[1][num - 1] = true;
			}
			else if(s.equals("C"))
			{
				card[2][num - 1] = true;
			}
			else if(s.equals("D"))
			{
				card[3][num - 1] = true;
			}
		}
		String suit = "SHCD";
		for(int i = 0; i < 4; ++i)
		{
			for(int j = 0; j < 13; ++j)
			{
				if(card[i][j] == false)
				{
					System.out.printf("%c %d\n", suit.charAt(i), j + 1);
				}
			}
		}
	}
}