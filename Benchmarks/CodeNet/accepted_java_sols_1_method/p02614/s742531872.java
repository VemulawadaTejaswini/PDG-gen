import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int H=in.nextInt();
        int	W=in.nextInt();
		int K=in.nextInt();
		char [][] c=new char [H][W];
		for(int i=0;i<H;i++)
		{
			String s=in.next();
			for(int j=0;j<W;j++)
			{
				c[i][j]=s.charAt(j);
			}
		}
		int ans=0;
		for(int maskR = 0;maskR<(1 << H);maskR++)
		{
			for(int maskC = 0; maskC <(1 << W);maskC++)
			{
				int black=0;
				for(int i=0;i<H;i++)
				{
					for(int j=0;j<W;j++)
					{
						if (((maskR >> i) & 1) == 0 && ((maskC >> j) & 1) == 0 && c[i][j] == '#')
							black = black + 1;
					}
				}
				if (black == K)
					ans = ans + 1;
			}
		}
		System.out.println(ans);
	}
}
