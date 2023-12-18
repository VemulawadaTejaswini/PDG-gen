import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			long num = stdIn.nextLong();
			long[][] a = new long[10][10];
			for(int i = 9; i >= 0; --i)
			{
				a[0][i] = num % 10;
				num /= 10;
			}
			for(int i = 0; i < 9; ++i)
			{
				for(int j = 0; j < 9; ++j)
				{
					a[i + 1][j] = (a[i][j] + a[i][j + 1]) % 10;
				}
			}
			System.out.println(a[9][0]);
		}
	}
}