import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		long[][] col = new long[3][c];
		long[][] price = new long[c][c];
		
		//read price table
		for(int i = 0; i < c; i++)
			for(int j = 0; j < c; j++)
			{
//				int pr = sc.nextInt();
				price[i][j] = sc.nextInt();
			}
		
		long[][] groupprice = new long[3][c]; //price if group x goes to color y
		
		//read grid
		for(int y = 1; y <= n; y++)
			for(int x = 1; x <= n; x++)
			{
				int cur = sc.nextInt()-1;
				int group = (x+y)%3;
				while(group<0)group+=3;
				
				col[group][cur]++;
//				System.out.println(x + " " + y +": group " + group);
			}
		
		//reread price table
		for(int i = 0; i < c; i++)
			for(int j = 0; j < c; j++)
			{
				//i to j
				for(int g = 0; g < 3; g++)
				{
					groupprice[g][j] += price[i][j]*col[g][i];
//					System.out.println(i + " " + j + ": group " + g + " into color " + j +": pay " + price[i][j] + " times " + col[g][i]);
				}
			}

		long min = 999999999999l;
		for(int col1 = 0; col1 < c; col1++)
			for(int col2 = 0; col2 < c; col2++)
				for(int col3 = 0; col3 < c; col3++)
				{
					if(col1 == col2 || col2 == col3 || col1 == col3)continue;
					
					long wro = groupprice[0][col1] + groupprice[1][col2] + groupprice[2][col3];
					
					if(wro < min)
					{
//						System.out.println(col1 + " " + col2 + " " + col3 + ": " + wro);
//						System.out.println(groupprice[0][col1] + " " + groupprice[1][col2] + " " + groupprice[2][col3]);
					}
					min = Math.min(min, wro);
					
				}

		System.out.println(min);
	}

}
