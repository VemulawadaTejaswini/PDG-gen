import java.util.Scanner;
public class Main
{
	private class Data
	{
		long t;
		int s,d;
		Data(long t,int s,int d)
		{
			this.t = t;
			this.s = s;
			this.d = d;
		}
	}
	public void sort(Data[] datas)
	{
		for(int i = 0;i < datas.length - 1;i++)
		{
			for(int j = i + 1;j < datas.length;j++)
			{
				if(datas[i].t > datas[i].t)
				{
					Data tmp = datas[i];
					datas[i] = datas[j];
					datas[j] = tmp;
				}
			}
		}
	}
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int N = cin.nextInt();
			int M = cin.nextInt();
			if( N == 0 && M == 0)break;
			int[] infected = new int[N];
			infected[0] = 1;
			Data[] datas = new Data[M];
			for(int i = 0;i < M;i++)
			{
				datas[i] = new Data(cin.nextLong(),cin.nextInt() - 1,cin.nextInt() - 1);
			}
			
			sort(datas);
			for(int i = 0;i < M;i++)
			{
				if(infected[datas[i].s] == 1 && infected[datas[i].d] != 3)
				{
					infected[datas[i].d] = 1;
				}else if(infected[datas[i].d]== 1)
				{
					infected[datas[i].s] = 3;
				}
			}
			int ans = 0;
			for(int i = 0;i < N;i++)
			{
				if(infected[i] == 1)ans++;
			}
			
			System.out.println(ans);
		}
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}