import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int figer[][][] = {
			{//A
				{1,1},
				{1,1},
			},
			{//B
				{1},
				{1},
				{1},
				{1},
			},
			{//C
				{1,1,1,1},
			},
			{//D
				{0,1},
				{1,1},
				{1,0},
			},
			{//E
				{1,1,0},
				{0,1,1},
			},
			{//F
				{1,0},
				{1,1},
				{0,1},
			},
			{//G
				{0,1,1},
				{1,1,0},
			},
		};
		
		int map[][] = new int[8][8];
		
		while (true)
		{
			try
			{
				for (int i = 0; i < 8; i++)
				{
					String str = sc.nextLine();
					for (int j = 0; j < 8; j++)
					{
						map[i][j] = str.charAt(j) - '0';
					}
				}
				
				LOOP1: for (int i = 0; i < figer.length; i++)
				{
					LOOP2: for (int j = 0; j < map.length; j++)
					{
						LOOP3: for (int k = 0; k < map[j].length; k++)
						{
							LOOP4: for (int l = 0; l < figer[i].length; l++)
							{
								LOOP5: for (int m = 0; m < figer[i][l].length; m++)
								{
									try
									{
										if (map[j + l][k + m] != figer[i][l][m])
										{
											continue LOOP3;
										}
										else if (l == figer[i].length-1 && m == figer[i][l].length-1)
										{
											System.out.println((char) (i + 'A'));
											break LOOP1;
										}
									}
									catch (ArrayIndexOutOfBoundsException ae)
									{
										continue LOOP4;
									}
								}
							}
						}
					}
				}
				
				sc.nextLine();
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}