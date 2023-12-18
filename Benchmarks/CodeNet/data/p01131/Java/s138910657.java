import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String[] map = new String[10];
		map[1] = ".,!? ";
		map[2] = "abc";
		map[3] = "def";
		map[4] = "ghi";
		map[5] = "jkl";
		map[6] = "mno";
		map[7] = "pqrs";
		map[8] = "tuv";
		map[9] = "wxyz";
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(;N-->0;)
		{
			String s = sc.next() + "0";
			
			int p = 0, j = 0;
			for (int i = 0; i < s.length(); i++)
			{
				char c = s.charAt(i);
				int q = c - '0';
				if (q == 0)
				{
					if (p != 0)
					{
						System.out.print(map[p].charAt(j));
						p = 0;
						j = 0;
					}
				}
				else
				{
					if (p == q)
					{
						j = (j + 1) % map[p].length();
					}
					else
					{
						p = q;
						j = 0;
					}
				}
			}
			System.out.println();
		}
	}
}