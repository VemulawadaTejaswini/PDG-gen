
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/3 15:56
 */
public class Main
{
	static long INF = 123245452356732L;
	public static void main(String[] args) throws IOException
	{
		String next = Reader.nextLine();
		StringBuffer stringBuffer = new StringBuffer();
		while (!"0 0".equals(next))
		{
			int n = Integer.parseInt(next.split(" ")[0]);
			int m = Integer.parseInt(next.split(" ")[1]);
			long ans = INF;
			long[][] dis_1 = new long[n][n];
			long[][] dis_2 = new long[n][n];
			for (int i = 0; i < n; i++)
			{
				Arrays.fill(dis_1[i], INF);
				Arrays.fill(dis_2[i], INF);
				dis_1[i][i] = 0;
				dis_2[i][i] = 0;
			}
			for (int i = 0; i < m; i++)
			{
				String[] line = Reader.nextLine().split(" ");
				int u = Integer.parseInt(line[0]) - 1;
				int v = Integer.parseInt(line[1]) - 1;
				int cost = Integer.parseInt(line[2]);
				if ("L".equals(line[3]))
				{
					dis_1[u][v] = cost;
					dis_1[v][u] = cost;
				} else
				{
					dis_2[u][v] = cost;
					dis_2[v][u] = cost;
				}
			}
			floyd(dis_1, n);
			floyd(dis_2, n);
			int len = Reader.nextInt();
			int[] linked = new int[len];
			for (int i = 0; i < len; i++)
			{
				linked[i] = Reader.nextInt() - 1;
			}
			long[][] dp = new long[len][n];
			for (int i = 0; i < n; i++)
			{
				dp[0][i] = dis_2[linked[0]][i];
			}
			for (int i = 1; i < len; i++)
			{
				for (int j = 0; j < n; j++)
				{
					dp[i][j] = (dp[i - 1][j] + dis_1[linked[i - 1]][linked[i]]);

					for (int k = 0; k < n; k++)
					{

						dp[i][j] = Math.min(dp[i][j], (dp[i - 1][k] + dis_1[linked[i-1]][k]+dis_2[k][j] + dis_1[j][linked[i]]));
					}
				}
			}
			for (int i = 0; i < n; i++)
			{
				ans = Math.min(ans, dp[len - 1][i]);
			}
			System.out.println(ans);
			next = Reader.nextLine();
		}
	
	}

	private static void floyd(long[][] dis, int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					dis[j][k] = Math.min(dis[j][i] + dis[i][k], dis[j][k]);
				}
			}
		}
	}

	static class Reader
	{
		static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		static StringTokenizer tokenizer = new StringTokenizer("");

		static String nextLine() throws IOException
		{// 读取下一行字符串
			return reader.readLine();
		}

		static String next() throws IOException
		{// 读取下一个字符串
			while (!tokenizer.hasMoreTokens())
			{
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		static int nextInt() throws IOException
		{// 读取下一个int型数值
			return Integer.parseInt(next());
		}

		static long nextLong() throws IOException
		{// 读取下一个int型数值
			return Long.parseLong(next());
		}

		static double nextDouble() throws IOException
		{// 读取下一个double型数值
			return Double.parseDouble(next());
		}
	}
}

