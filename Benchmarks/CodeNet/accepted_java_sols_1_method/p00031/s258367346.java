import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> buf = new ArrayList<Integer>();
		
		int w[] = new int[10];
		for (int i = 0; i < 10; i++)
		{
			w[i] = 1<<i;
		}
		
		while (true)
		{
			buf.clear();
			int n;
			try
			{
				n = sc.nextInt();
			}
			catch (Exception e)
			{
				break;
			}
			int index = 9;
			while (0 < n)
			{
				for (int i = index; i >= 0; i--)
				{
					if (w[i] <= n)
					{
						buf.add(w[i]);
						n -= w[i];
						index = i - 1;
						break;
					}
				}
			}
			Integer[] res = buf.toArray(new Integer[buf.size()]);
			Arrays.sort(res);
			for (int i = 0; i < res.length; i++)
			{
				System.out.print(res[i]);
				if (i != res.length - 1) System.out.print(" ");
			}
			System.out.println();
		}
	}
}