import java.util.Scanner;
public class Main
{
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int M = 256;
			int N = cin.nextInt();
			if(N == 0)break;
			int[] L = new int[N];
			for(int i = 0;i < N;i++)
			{
				L[i] = cin.nextInt();
			}
			int S = 0,A = 0,C = 0;
			double minH = Double.MAX_VALUE;
			for(int s = 0;s <= 15;s++)
			{
				for(int a = 0;a <= 15;a++)
				{
					for(int c = 0;c<=15;c++)
					{
						int[] R = new int[N];
						int[] O = new int[256];
						for(int i = 0;i < N;i++)
						{
							if(i == 0)
							{
								R[i] = (a * s + c) % M;
							}else
							{
								R[i] = (a * R[i - 1] + c)%M;
							}
						}
						for(int i = 0;i < N;i++)
						{
							O[(L[i] + R[i]) % M]++;
						}
						
						double h = 0.0;
						for(int i = 0;i < 256;i++)
						{
							if(O[i] == 0)continue;
							h -= (double)O[i] / N * Math.log((double)O[i] / N);
						}
						
						if(h + 1e-10 < minH)
						{
							minH = h;
							S = s;
							A = a;
							C = c;
						}
					}
				}
			}
			System.out.println(S + " " + A + " " + C);
		}
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}