import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		String order, moji;
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++)
		{
			order = sc.next();
			moji = sc.next();
			if(order.equals("insert"))
			{
				set.add(moji);
			}
			else
			{
				if(set.contains(moji))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
		}
		sc.close();
	}
}
