import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static int[] h, w;
	
	private static int check(int sx, int sy)
	{
		int x = sx;
		int y = sy;
		int count = 0;
		int width = w[sx];
		int height = h[sy];
		
		while(true)
		{
			if(width == height)
			{
				count++;
				x++;
				if(x >= m) return count;
				width += w[x];
			}
			else if(width < height)
			{
				x++;
				if(x >= m) return count;
				width += w[x];
			}
			else
			{
				y++;
				if(y >= n) return count;
				height += h[y];
			}
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			m = sca.nextInt();
			if(n == 0) break;
			
			int i, j, k;
			
			h = new int[n];
			for(i = 0;i < n;i++) h[i] = sca.nextInt();
			
			w = new int[m];
			for(i = 0;i < m;i++) w[i] = sca.nextInt();
			
			int count = 0;
			int x, y;
			for(y = 0;y < n;y++)
			{
				for(x = 0;x < m;x++)
				{
					count += check(x, y);
				}
			}
			
			System.out.println(count);
		}
	}
}