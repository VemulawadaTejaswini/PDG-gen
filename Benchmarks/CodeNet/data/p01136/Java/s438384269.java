
import java.io.*;
import java.util.*;

public class GatherMap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt();
			if (N == 0) break;
			
			boolean[][] ok = new boolean[N][31];
			for (int i = 0; i < N; i++)
			{
				int f = sc.nextInt();
				for (int j = 0; j < f; j++)
				{
					int d = sc.nextInt();
					ok[i][d] = true;
				}
			}
			
			int[] map = new int[N];
			int all = 0;
			for (int i = 0; i < N; i++)
			{
				all |= (map[i] = 1 << i);
			}
			
			int day = -1;
			for (int d = 1; d <= 30; d++)
			{
				for (int n1 = 0; n1 < N; n1++)
				{
					for (int n2 = n1 + 1; n2 < N; n2++)
					{
						if (ok[n1][d] && ok[n2][d])
						{
							map[n1] = map[n2] = (map[n1] | map[n2]);
							if (map[n1] == all)
							{
								day = d;
							}
						}
					}
				}
				if (day != -1) break;
			}
			System.out.println(day);
		}
	}
}