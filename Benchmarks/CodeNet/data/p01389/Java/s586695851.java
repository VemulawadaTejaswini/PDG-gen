import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int[][] route = new int[52][52];
		char[][] cicada = new char[52][52];
		int H = stdIn.nextInt();
		int W = stdIn.nextInt();
		for(int i = 0; i < H; ++i)
		{
			String str = stdIn.next();
			for(int j = 0; j < str.length(); ++j)
			{
				cicada[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < H; ++i)
		{
			for(int j = 0; j < W; ++j)
			{
				route[i][j] = 999999999;
			}
		}
		route[0][0] = 0;
		for(int i = 0; i < H; ++i)
		{
			for(int j = 0; j < W; ++j)
			{
				if(route[i][j + 1] > route[i][j] + cicada[i][j + 1] - '0')
				{
					route[i][j + 1] = route[i][j] + cicada[i][j + 1] - '0';
				}
				if(route[i + 1][j] > route[i][j] + cicada[i + 1][j] - '0')
				{
					route[i + 1][j] = route[i][j] + cicada[i + 1][j] - '0';
				}
			}
		}
		System.out.println(route[H - 1][W - 1]);
	}
}