import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		start = start - 1;
		int goal1 = sc.nextInt();
		goal1 = goal1 - 1;
		int goal2 = sc.nextInt();
		goal2 = goal2 - 1;
		int road[][] = new int[N][N];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				road[i][j] = Integer.MAX_VALUE / 10;
			}
		}
		for(int i = 0; i < m;i++)
		{
			int j = sc.nextInt();
			int k = sc.nextInt();
			road[j-1][k-1] = sc.nextInt();
		}
		for(int i = 0; i < N; i++)
		{
			road[i][i] = 0;
		}

			for(int k = 0; k < N; k++)
			{
				for(int i = 0 ; i < N; i++)
				{
					for(int j = 0; j < N;j++)
					{
						int num = road[i][k] + road[k][j];
						road[i][j] = min(road[i][j],num);
					}
				}
			}
			
		int min = 0;
		min = road[start][goal1] + road[start][goal2];
		int min_road = min(road[start][goal1] + road[goal1][goal2],road[start][goal2] + road[goal2][goal1]);
		if(min > min_road) min = min_road;
		for(int i = 0; i < N; i++)
		{
			min_road = road[start][i] + road[i][goal1] + road[i][goal2];
			if(min > min_road)min = min_road;
		}
		System.out.println(min);
	}

	private static int min(int i, int j) {
		if(i < j) return i;
		else return j;
	}
	
}