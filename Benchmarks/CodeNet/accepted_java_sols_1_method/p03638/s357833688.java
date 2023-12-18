import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			m = sc.nextInt(),
			colors = sc.nextInt();
		int color_num[] = new int[colors];
		
		int arr[][] = new int[n][m];

		for(int i = 0; i < colors; i++)
			color_num[i] = sc.nextInt();

		int i = 0, j = 0, addY = 1; 
		
		for(int now_color = 0; now_color < colors; now_color++)
		{
			for(int color_cnt = 0; color_cnt < color_num[now_color]; j += addY, color_cnt++)
			{
				if(j < 0)
				{
					addY = 1;
					j = 0;
					i++;
				}
				else if(j >= m)
				{
					addY = -1;
					j = m - 1;
					i++;
				}
				arr[i][j] = (now_color + 1);
			}
		}

		for(i = 0; i < n; i++)
		{
			for(j = 0; j < m; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
	}
}